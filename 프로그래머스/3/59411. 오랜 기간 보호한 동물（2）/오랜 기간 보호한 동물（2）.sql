SELECT *
  FROM 
  (SELECT i.animal_id, i.name
     FROM animal_ins i
    INNER JOIN animal_outs o
       ON i.animal_id = o.animal_id
    ORDER BY o.datetime - i.datetime DESC)
 WHERE ROWNUM <= 2;