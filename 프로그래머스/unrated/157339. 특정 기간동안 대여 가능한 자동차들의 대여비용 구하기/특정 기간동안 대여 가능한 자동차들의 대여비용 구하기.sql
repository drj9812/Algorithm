SELECT car_id,
       car_type,
       (daily_fee * 30) - (daily_fee * 30 * discount_rate / 100) AS fee
  FROM 
    (SELECT DISTINCT crcc.car_id,
            crcc.car_type,
            crcc.daily_fee,
            crcdp.discount_rate
       FROM car_rental_company_car crcc
      INNER JOIN car_rental_company_discount_plan crcdp
         ON crcc.car_type = crcdp.car_type
      WHERE
         crcc.car_id NOT IN
         (SELECT car_id
            FROM car_rental_company_rental_history
           WHERE END_DATE > DATE '2022-11-01' AND START_DATE < DATE '2022-12-01')
         AND
         crcc.car_type IN ('세단', 'SUV')
         AND
         crcdp.duration_type = '30일 이상')
 WHERE
    (daily_fee * 30) - (daily_fee * 30 * discount_rate / 100) >= 500000
    AND
    (daily_fee * 30) - (daily_fee * 30 * discount_rate / 100) < 2000000
 ORDER BY fee DESC, car_type ASC, car_id DESC;