SELECT product_id, product_name, product_cd, category, price
  FROM food_product
 WHERE price IN (SELECT MAX(price)
                   FROM food_product);