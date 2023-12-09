SELECT car_id,
       MAX(CASE WHEN TO_DATE('2022-10-16', 'YYYY-MM-DD') BETWEEN start_date
                                                                 AND
                                                                 end_date THEN '대여중'
           ELSE '대여 가능'
            END) AS availabilty
  FROM car_rental_company_rental_history
 GROUP BY car_id
 ORDER BY car_id DESC;