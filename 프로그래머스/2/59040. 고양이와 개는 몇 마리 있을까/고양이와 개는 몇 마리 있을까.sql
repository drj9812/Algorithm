SELECT animal_type, COUNT(*) AS count
  FROM animal_ins
 GROUP BY animal_type
HAVING animal_type BETWEEN 'Cat' AND 'Dog'
ORDER BY animal_type ASC;