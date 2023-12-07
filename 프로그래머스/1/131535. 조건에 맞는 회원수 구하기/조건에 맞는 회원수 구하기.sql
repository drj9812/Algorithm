SELECT COUNT(*) AS users
  FROM user_info
 WHERE EXTRACT(YEAR FROM joined) = 2021
       AND
       age BETWEEN 20 AND 29;