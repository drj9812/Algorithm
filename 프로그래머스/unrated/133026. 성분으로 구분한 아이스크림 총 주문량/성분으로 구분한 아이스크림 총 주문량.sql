SELECT i.ingredient_type, sum(h.total_order) AS total_order
  FROM first_half h
 INNER JOIN icecream_info i
    ON h.flavor = i.flavor
 GROUP BY i.ingredient_type;
 
 