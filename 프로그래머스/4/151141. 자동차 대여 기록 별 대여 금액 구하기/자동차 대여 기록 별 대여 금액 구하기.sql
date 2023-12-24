SELECT sub.history_id, sub.fee - sub.fee * NVL(d.discount_rate, 0) / 100 AS fee
  FROM (SELECT h.history_id,
               c.daily_fee * (h.end_date - h.start_date + 1) AS fee,
               CASE WHEN h.end_date - h.start_date + 1 >= 90 THEN '90일 이상'
                    WHEN h.end_date - h.start_date + 1 >= 30 THEN '30일 이상'
                    WHEN h.end_date - h.start_date + 1 >= 7 THEN '7일 이상'
               ELSE '7일 미만'
               END AS duration_type
          FROM car_rental_company_car c
         INNER JOIN car_rental_company_rental_history h
            ON c.car_id = h.car_id
         WHERE car_type = '트럭') sub
  LEFT JOIN car_rental_company_discount_plan d
    ON sub.duration_type = d.duration_type
       AND
       d.car_type = '트럭'
 ORDER BY fee DESC, sub.history_id DESC;