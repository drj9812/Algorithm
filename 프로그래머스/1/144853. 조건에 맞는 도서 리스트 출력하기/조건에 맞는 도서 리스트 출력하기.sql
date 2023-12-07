SELECT book_id, TO_CHAR(published_date, 'YYYY-MM-DD')
  FROM book
 WHERE EXTRACT(YEAR FROM published_date) = 2021
       AND
       category = '인문'
 ORDER BY published_date ASC;