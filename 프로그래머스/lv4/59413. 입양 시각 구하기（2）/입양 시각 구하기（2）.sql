SELECT d.hour,
    CASE WHEN a.hour IS NULL THEN 0
         ELSE a.count
     END AS count
  FROM
    (SELECT LEVEL - 1 AS hour
       FROM DUAL
    CONNECT BY LEVEL <= 24) d
  LEFT JOIN
    (SELECT EXTRACT(HOUR FROM CAST(datetime AS TIMESTAMP)) AS HOUR,
            COUNT(*) AS count
       FROM animal_outs
      GROUP BY EXTRACT(HOUR FROM CAST(datetime AS TIMESTAMP))) a
    ON d.hour = a.hour
 ORDER BY d.hour;