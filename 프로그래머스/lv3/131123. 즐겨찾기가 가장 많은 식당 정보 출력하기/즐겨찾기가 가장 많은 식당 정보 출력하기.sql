SELECT a.food_type, a.rest_id, a.rest_name, a.favorites
  FROM rest_info a, 
   (SELECT food_type, MAX(favorites) AS favorites
      FROM rest_info
     GROUP BY food_type) b
 WHERE 
    a.food_type = b.food_type
    AND
    a.favorites = b.favorites
 ORDER BY a.food_type DESC;
 