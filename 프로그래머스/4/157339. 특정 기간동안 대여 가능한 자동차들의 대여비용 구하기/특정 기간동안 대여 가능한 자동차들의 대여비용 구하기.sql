SELECT c.car_id,
       c.car_type,
       c.daily_fee * 30 - (c.daily_fee * 30 * d.discount_rate / 100) AS fee
  FROM car_rental_company_car c
 INNER JOIN car_rental_company_discount_plan d ON c.car_type = d.car_type
 WHERE c.car_type IN ('세단', 'SUV')
       AND
       d.duration_type = '30일 이상'
       AND NOT EXISTS (SELECT 1
                         FROM car_rental_company_rental_history r
                        WHERE c.car_id = r.car_id
                              AND
                              r.end_date > DATE '2022-11-01'
                              AND
                              r.start_date < DATE '2022-12-01')
  AND c.daily_fee * 30 - (c.daily_fee * 30 * d.discount_rate / 100) BETWEEN 500000 AND 1999999
ORDER BY
  fee DESC, car_type ASC, car_id DESC;