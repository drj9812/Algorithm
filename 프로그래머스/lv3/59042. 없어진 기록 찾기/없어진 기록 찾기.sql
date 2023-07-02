SELECT o.animal_id, o.name
  FROM animal_outs o
  LEFT JOIN animal_ins i 
    ON o.animal_id = i.animal_id
 WHERE i.animal_id IS NULL
 ORDER BY o.animal_id ASC;