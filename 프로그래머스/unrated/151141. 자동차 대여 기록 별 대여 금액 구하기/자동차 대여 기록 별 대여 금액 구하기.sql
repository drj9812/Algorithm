SELECT b.history_id,
       CASE WHEN b.period = '7일 미만' THEN b.fee
            ELSE b.fee - (b.fee * COALESCE(a.discount_rate, 0) / 100)
       END AS fee
  FROM (SELECT h.history_id,
               c.daily_fee * (h.end_date - h.start_date + 1) AS fee,
               CASE WHEN h.end_date - h.start_date + 1 >= 90 THEN '90일 이상'
                    WHEN h.end_date - h.start_date + 1 >= 30 THEN '30일 이상'
                    WHEN h.end_date - h.start_date + 1 >= 7 THEN '7일 이상'
               END AS period
          FROM car_rental_company_car c
         INNER JOIN car_rental_company_rental_history h
            ON c.car_id = h.car_id
         WHERE c.car_type = '트럭') b
  LEFT JOIN car_rental_company_discount_plan a
    ON a.car_type = '트럭' AND a.duration_type = b.period
 ORDER BY fee DESC, history_id DESC;