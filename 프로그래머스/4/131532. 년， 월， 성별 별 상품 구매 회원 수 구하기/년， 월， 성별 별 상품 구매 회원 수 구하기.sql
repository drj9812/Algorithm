SELECT EXTRACT(YEAR FROM s.sales_date) AS year, EXTRACT(MONTH FROM s.sales_date) AS month, i.GENDER, COUNT(DISTINCT(i.user_id)) AS users
  FROM user_info i
 INNER JOIN online_sale s
    ON i.user_id = s.user_id
 WHERE i.gender IS NOT NULL
 GROUP BY EXTRACT(YEAR FROM s.sales_date), EXTRACT(MONTH FROM s.sales_date), i.GENDER
 ORDER BY year ASC, month ASC, i.gender ASC;