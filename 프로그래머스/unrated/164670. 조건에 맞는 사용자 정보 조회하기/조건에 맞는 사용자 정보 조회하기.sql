SELECT user_id,
       nickname,
       city || ' ' ||street_address1 || ' ' || street_address2 AS 전체주소,
       REGEXP_REPLACE(TO_CHAR(tlno), '(\d{3})(\d{4})(\d{4})', '\1-\2-\3') AS 전화번호
  FROM used_goods_user 
 WHERE user_id in (
    SELECT writer_id
      FROM used_goods_board
     GROUP BY writer_id
    HAVING count(*) >= 3)
 ORDER BY user_id DESC;