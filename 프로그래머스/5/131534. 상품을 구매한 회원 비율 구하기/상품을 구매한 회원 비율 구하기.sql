SELECT EXTRACT(YEAR FROM sales_date) AS year,
       EXTRACT(MONTH FROM sales_date) AS month,
       COUNT(DISTINCT user_id) AS puchased_users,
       ROUND(COUNT(DISTINCT user_id) / (SELECT COUNT(user_id)
                                            FROM user_info
                                           WHERE EXTRACT(YEAR FROM joined) = 2021), 1)
                                              AS puchased_ratio
  FROM (SELECT i.user_id, s.product_id, s.sales_amount, s.sales_date
          FROM user_info i
         INNER JOIN online_sale s
            ON i.user_id = s.user_id
         WHERE EXTRACT(YEAR FROM i.joined) = 2021)
 GROUP BY EXTRACT(YEAR FROM sales_date),
          EXTRACT(MONTH FROM sales_date)
 ORDER BY year, month;
         