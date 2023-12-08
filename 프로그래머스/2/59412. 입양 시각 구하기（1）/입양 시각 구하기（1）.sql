SELECT TO_CHAR(datetime, 'FMHH24') AS hour, COUNT(*) AS count
  FROM animal_outs
 GROUP BY TO_CHAR(datetime, 'FMHH24')
HAVING TO_CHAR(datetime, 'FMHH24') BETWEEN 9 AND 19
 ORDER BY TO_NUMBER(hour);
 