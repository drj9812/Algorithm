SELECT SUBSTR(product_code, 1, 2) AS "CATEGORY", count(*) AS "PRODUCTS"
  FROM product
 GROUP BY SUBSTR(product_code, 1, 2)
 ORDER BY "CATEGORY";