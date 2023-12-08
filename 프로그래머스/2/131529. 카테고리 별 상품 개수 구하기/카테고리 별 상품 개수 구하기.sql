SELECT SUBSTR(product_code, 1, 2) AS category, COUNT(product_id) AS products
  FROM product
 GROUP BY SUBSTR(product_code, 1, 2)
 ORDER BY category ASC;