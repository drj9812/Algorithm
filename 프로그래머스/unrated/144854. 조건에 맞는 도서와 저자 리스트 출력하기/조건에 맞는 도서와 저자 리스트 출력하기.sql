SELECT b.book_id,
       a.author_name,
       TO_CHAR(b.published_date, 'YYYY-MM-DD') as published_date
  FROM author a 
 INNER JOIN book b
    ON a.author_id = b.author_id
 WHERE b.category = '경제'
 ORDER BY b.published_date ASC;