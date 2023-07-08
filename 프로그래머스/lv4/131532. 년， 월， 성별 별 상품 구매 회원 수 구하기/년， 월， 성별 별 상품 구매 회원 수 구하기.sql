SELECT EXTRACT(YEAR FROM sub.sales_date) AS year,
       EXTRACT(MONTH FROM sub.sales_date) AS month,
       main.gender,
       COUNT(DISTINCT main.user_id) AS users
  FROM user_info main
 INNER JOIN online_sale sub ON main.user_id = sub.user_id
 WHERE main.gender IS NOT NULL
 GROUP BY EXTRACT(YEAR FROM sub.sales_date),
          EXTRACT(MONTH FROM sub.sales_date),
          main.gender
 ORDER BY year ASC, month ASC, main.gender ASC;