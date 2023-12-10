SELECT animal_id, animal_type, name
  FROM animal_outs
 WHERE animal_id IN (SELECT animal_id
                       FROM animal_ins 
                      WHERE sex_upon_intake LIKE '%Intact%')
       AND
       sex_upon_outcome NOT LIKE '%Intact%'
 ORDER BY animal_id ASC;