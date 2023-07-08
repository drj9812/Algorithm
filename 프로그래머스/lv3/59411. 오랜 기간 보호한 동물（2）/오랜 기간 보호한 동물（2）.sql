SELECT animal_id, name
  FROM 
   (SELECT main.animal_id, main.name, sub.datetime - main.datetime AS period
      FROM animal_ins main
     INNER JOIN animal_outs sub
        ON main.animal_id = sub.animal_id
     ORDER BY period DESC)
  WHERE ROWNUM <= 2;