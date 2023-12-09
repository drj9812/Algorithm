SELECT c.car_id
  FROM car_rental_company_car c
 INNER JOIN car_rental_company_rental_history h
    ON c.car_id = h.car_id
 WHERE c.car_type = '세단'
       AND 
       EXTRACT(MONTH FROM h.start_date) = 10
 GROUP BY c.car_id
 ORDER BY c.car_id DESC;