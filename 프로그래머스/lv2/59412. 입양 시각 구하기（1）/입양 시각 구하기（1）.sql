SELECT
    CASE
        WHEN TO_CHAR(datetime,'HH24') LIKE '0%' THEN SUBSTR(TO_CHAR(datetime,'HH24'),2,2)
        ELSE TO_CHAR(datetime,'HH24')
    END AS "HOUR"
    , COUNT(datetime) AS "COUNT"
  FROM animal_outs
 GROUP BY TO_CHAR(datetime,'HH24')
 HAVING TO_CHAR(datetime,'HH24') BETWEEN '09' AND '19'
 ORDER BY TO_CHAR(datetime,'HH24');