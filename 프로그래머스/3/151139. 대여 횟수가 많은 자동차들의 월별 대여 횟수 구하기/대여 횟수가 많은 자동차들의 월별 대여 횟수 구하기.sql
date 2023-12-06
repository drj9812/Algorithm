SELECT EXTRACT(MONTH FROM main.start_date) AS month, main.car_id, COUNT(*) AS records
  FROM car_rental_company_rental_history main
 WHERE main.car_id IN (SELECT car_id
                         FROM car_rental_company_rental_history
                        WHERE start_date BETWEEN TO_DATE('2022-08-01', 'YYYY-MM-DD') AND TO_DATE('2022-10-31', 'YYYY-MM-DD')
                        GROUP BY car_id
                       HAVING COUNT(*) >= 5)
       AND
       main.start_date BETWEEN TO_DATE('2022-08-01', 'YYYY-MM-DD') AND TO_DATE('2022-10-31', 'YYYY-MM-DD')
 GROUP BY EXTRACT(MONTH FROM main.start_date), main.car_id
HAVING COUNT(*) > 0
 ORDER BY EXTRACT(MONTH FROM main.start_date), main.car_id DESC;