SELECT main.category, SUM(sub.sales) AS total_sales
  FROM book main
 INNER JOIN book_sales sub
    ON main.book_id = sub.book_id
 WHERE EXTRACT(MONTH FROM sub.sales_date) = 1
 GROUP BY main.category
 ORDER BY main.category ASC;