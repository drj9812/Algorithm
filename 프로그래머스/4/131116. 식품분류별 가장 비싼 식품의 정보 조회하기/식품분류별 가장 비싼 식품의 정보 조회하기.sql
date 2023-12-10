SELECT sub.category, sub.max_price, main.product_name
  FROM food_product main, (SELECT category, MAX(price) AS max_price
                           FROM food_product
                          WHERE category IN ('과자', '국', '김치', '식용유')
                          GROUP BY category) sub
 WHERE main.category = sub.category
       AND
       main.price = sub.max_price
 ORDER BY max_price DESC;