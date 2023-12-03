SELECT i.animal_id, i.name
  FROM animal_ins i
  LEFT JOIN animal_outs o
    ON i.animal_id = o.animal_id
 WHERE i.datetime > o.datetime
 ORDER BY i.datetime;