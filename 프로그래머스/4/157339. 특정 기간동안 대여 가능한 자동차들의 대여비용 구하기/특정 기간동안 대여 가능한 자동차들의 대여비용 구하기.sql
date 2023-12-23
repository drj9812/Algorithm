SELECT car_id, car_type, daily_fee * 30 - (daily_fee * 30 * discount_rate / 100) AS fee
  FROM (SELECT c.car_id,
               c.car_type,
               c.daily_fee,
               d.discount_rate
          FROM car_rental_company_car c
         INNER JOIN car_rental_company_discount_plan d
            ON c.car_type = d.car_type
         WHERE c.car_id NOT IN (SELECT car_id
                                  FROM car_rental_company_rental_history
                                 WHERE end_date > DATE '2022-11-01' AND start_date < DATE '2022-12-01')
               AND
               c.car_type IN ('세단', 'SUV')
               AND
               d.duration_type = '30일 이상')
 WHERE daily_fee * 30 - (daily_fee * 30 * discount_rate / 100) >= 500000
       AND
       daily_fee * 30 - (daily_fee * 30 * discount_rate / 100) < 2000000
 ORDER BY fee DESC, car_type ASC, car_id DESC;