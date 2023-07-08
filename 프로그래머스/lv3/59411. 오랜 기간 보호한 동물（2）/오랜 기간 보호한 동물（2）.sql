SELECT animal_id, name
  FROM 
   (SELECT main.animal_id, main.name
      FROM animal_ins main
     INNER JOIN animal_outs sub
        ON main.animal_id = sub.animal_id
     ORDER BY sub.datetime - main.datetime DESC)
  WHERE ROWNUM <= 2;