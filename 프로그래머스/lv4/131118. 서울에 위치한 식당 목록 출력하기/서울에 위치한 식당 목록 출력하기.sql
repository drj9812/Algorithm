SELECT main.rest_id,
       main.rest_name,
       main.food_type,
       main.favorites,
       main.address,
       sub.score AS score
  FROM rest_info main
 INNER JOIN 
    (SELECT rest_id, ROUND(AVG(review_score), 2) AS score
       FROM rest_review
      GROUP BY rest_id) sub
    ON main.rest_id = sub.rest_id
 WHERE main.address LIKE '서울%'
 ORDER BY score DESC, main.favorites DESC;