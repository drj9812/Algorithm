SELECT b.category, SUM(bs.SALES) AS total_Sales
  FROM book b
 INNER JOIN book_sales bs
    ON b.book_id = bs.book_id
 WHERE EXTRACT(MONTH FROM bs.sales_date) = 1
 GROUP BY b.category
 ORDER BY b.category ASC;