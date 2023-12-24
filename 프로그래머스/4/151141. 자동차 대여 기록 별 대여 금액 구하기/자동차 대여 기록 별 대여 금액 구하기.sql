SELECT a.history_id,
       CASE WHEN a.period = '7일 미만' THEN a.fee
            ELSE a.fee - (a.fee * b.discount_rate / 100)
        END AS fee
  FROM (SELECT h.history_id,
               c.daily_fee * (h.end_date - h.start_date + 1) AS fee,
               CASE WHEN h.end_date - h.start_date + 1 >= 90 THEN '90일 이상'
                    WHEN h.end_date - h.start_date + 1 >= 30 THEN '30일 이상'
                    WHEN h.end_date - h.start_date + 1 >= 7 THEN '7일 이상'
                    ELSE '7일 미만'
                END AS period
          FROM car_rental_company_car c
         INNER JOIN car_rental_company_rental_history h
            ON c.car_id = h.car_id
         WHERE c.car_type = '트럭') a
  LEFT JOIN car_rental_company_discount_plan b
    ON b.car_type = '트럭' AND b.duration_type = a.period
 ORDER BY fee DESC, history_id DESC;