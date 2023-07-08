SELECT car_id, MAX(availability) AS availability
  FROM (
    SELECT car_id,
        CASE WHEN 
            start_date <= TO_DATE('2022-10-16', 'YYYY-MM-DD')
        AND
            end_date >= TO_DATE('2022-10-16', 'YYYY-MM-DD') THEN '대여중'
        ELSE '대여 가능'
        END AS availability
      FROM car_rental_company_rental_history)
 GROUP BY car_id
 ORDER BY car_id DESC;