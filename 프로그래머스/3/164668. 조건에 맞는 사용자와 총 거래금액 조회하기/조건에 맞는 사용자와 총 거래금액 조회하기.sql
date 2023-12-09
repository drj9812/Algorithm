SELECT u.user_id, u.nickname, b.total_sales
  FROM used_goods_user u
 INNER JOIN (SELECT writer_id, SUM(price) AS total_sales
               FROM used_goods_board
              WHERE status = 'DONE'
              GROUP BY writer_id
             HAVING SUM(price) >= 700000) b
    ON u.user_id = b.writer_id
 ORDER BY total_sales ASC;
    