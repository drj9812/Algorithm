SELECT a.author_id,
       a.author_name,
       b.category,
       SUM(s.sales * b.price) AS total_sales
  FROM book b
 INNER JOIN author a ON b.author_id = a.author_id
 INNER JOIN book_sales s ON b.book_id = s.book_id
 WHERE EXTRACT(MONTH FROM s.sales_date) = 1
 GROUP BY a.author_id, a.author_name, b.category
 ORDER BY a.author_id ASC, b.category DESC;