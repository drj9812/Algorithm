SELECT d.hour, COUNT(o.animal_id) AS count
  FROM (SELECT LEVEL - 1 AS hour
          FROM dual
       CONNECT BY LEVEL <= 24) d
  LEFT JOIN animal_outs o
    ON d.hour = TO_CHAR(o.datetime, 'FMHH24')
 GROUP BY d.hour
 ORDER BY d.hour ASC;