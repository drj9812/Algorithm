SELECT d.hour, CASE WHEN o.count IS NULL THEN 0
                    ELSE o.count
               END AS count
  FROM (SELECT LEVEL - 1 AS hour
          FROM DUAL
       CONNECT BY LEVEL <= 24) d
  LEFT JOIN (SELECT TO_CHAR(datetime, 'FMHH24') AS hour, COUNT(*) AS count
               FROM animal_outs
              GROUP BY TO_CHAR(datetime, 'FMHH24')) o
    ON d.hour = o.hour
 ORDER BY d.hour ASC;