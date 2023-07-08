SELECT car_id
  FROM (
    SELECT main.car_id, main.car_type
      FROM car_rental_company_car main
     INNER JOIN car_rental_company_rental_history sub
        ON main.car_id = sub.car_id
     WHERE EXTRACT(MONTH FROM sub.start_date) = 10)
 WHERE car_type = '세단'
 GROUP BY car_id
 ORDER BY car_id DESC;