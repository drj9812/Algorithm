SELECT a.category, b.max_price, a.product_name
  FROM food_product a,
    (SELECT category, max(price) AS max_price
      FROM food_product
     WHERE category IN ('과자', '국', '김치', '식용유')
     GROUP BY category) b
 WHERE
    a.category = b.category
    AND
    a.price = b.max_price
 ORDER BY price DESC;
