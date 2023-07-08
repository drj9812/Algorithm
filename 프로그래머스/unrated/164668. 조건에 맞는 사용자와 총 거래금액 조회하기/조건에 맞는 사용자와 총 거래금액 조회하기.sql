SELECT main.user_id, main.nickname, sub.total AS total_sales
  FROM used_goods_user main
 INNER JOIN 
    (SELECT writer_id, SUM(price) AS total
       FROM used_goods_board
      WHERE status = 'DONE'
      GROUP BY writer_id) sub
    ON main.user_id = sub.writer_id
 WHERE sub.total >= 700000
 ORDER BY total_sales ASC;
    