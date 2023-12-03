SELECT name, datetime
  FROM (
SELECT i.name, i.datetime
  FROM animal_ins i
  LEFT JOIN animal_outs o
    ON i.animal_id = o.animal_id
 WHERE o.animal_id IS NULL
 ORDER BY i.datetime 
  )
 WHERE ROWNUM <= 3;