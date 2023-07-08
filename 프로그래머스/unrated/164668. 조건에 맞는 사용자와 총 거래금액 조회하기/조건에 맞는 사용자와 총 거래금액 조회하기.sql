SELECT main.user_id, main.nickname, sub.total AS total_sales
  FROM used_goods_user main
 INNER JOIN 
    (SELECT writer_id, SUM(price) AS total
       FROM used_goods_board
      WHERE status = 'DONE'
      GROUP BY writer_id
     HAVING SUM(price) >= 700000) sub
    ON main.user_id = sub.writer_id
 ORDER BY total_sales ASC;