SELECT fd.product_id, fd.product_name, SUM(fd.price * fo.amount) AS total_sales
  FROM food_product fd
 INNER JOIN food_order fo
    ON fd.product_id = fo.product_id
 WHERE TO_CHAR(fo.produce_date, 'YYYY-MM') = '2022-05'
 GROUP BY fd.product_id, fd.product_name
 ORDER BY total_sales DESC, fd.product_id ASC;