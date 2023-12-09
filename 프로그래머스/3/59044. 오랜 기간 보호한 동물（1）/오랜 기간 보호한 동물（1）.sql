SELECT name, datetime
  FROM (SELECT i.name, i.datetime, o.animal_id
          FROM animal_ins i
          LEFT JOIN animal_outs o
            ON i.animal_id = o.animal_id
         ORDER BY i.datetime)
 WHERE animal_id IS NULL AND ROWNUM <= 3;