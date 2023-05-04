SELECT price AS "MAX_PRICE"
  FROM product
 WHERE price = (SELECT MAX(price) FROM product);