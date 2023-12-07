SELECT flavor
  FROM icecream_info
 WHERE ingredient_type = 'fruit_based'
       AND
       flavor IN (SELECT flavor
                    FROM first_half
                   GROUP BY flavor
                  HAVING SUM(total_order) >= 3000);