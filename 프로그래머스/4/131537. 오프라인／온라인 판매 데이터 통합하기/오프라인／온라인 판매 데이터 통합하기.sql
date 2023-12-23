(SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') AS sales_date,
        product_id,
        user_id,
        sales_amount
  FROM online_sale
 WHERE EXTRACT(MONTH FROM sales_date) = 3
 UNION ALL
SELECT TO_CHAR(sales_date, 'YYYY-MM-DD'),
       product_id,
       NULL,
       sales_amount
  FROM offline_sale
 WHERE EXTRACT(MONTH FROM sales_date) = 3)
 ORDER BY sales_date ASC, product_id ASC, user_id ASC;