SELECT pt_name, pt_no, gend_cd, age, NVL(tlno, 'NONE') as "tlno"
  FROM patient
 WHERE gend_cd = 'W' and age <= 12
 ORDER BY age DESC, pt_name ASC;