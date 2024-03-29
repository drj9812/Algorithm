SELECT TRUNC(price, -4) AS "price_group", COUNT(*) AS products
  FROM product
 GROUP BY TRUNC(price, -4)
 ORDER BY "price_group" ASC;