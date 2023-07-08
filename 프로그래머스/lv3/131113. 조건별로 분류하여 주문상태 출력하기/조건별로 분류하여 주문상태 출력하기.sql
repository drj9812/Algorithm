SELECT order_id,
       product_id,
       TO_CHAR(out_date, 'YYYY-MM-DD') AS out_date,
       CASE WHEN out_date <= DATE '2022-05-01' THEN '출고완료'
            WHEN out_date > DATE '2022-05-01' THEN '출고대기'
            ELSE '출고미정'
            END AS 출고여부
  FROM food_order
 ORDER BY order_id ASC;