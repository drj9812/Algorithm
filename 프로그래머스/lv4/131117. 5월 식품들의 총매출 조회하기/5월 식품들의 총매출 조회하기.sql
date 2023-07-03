SELECT sub.product_id, sub.product_name, sub.total_sales
FROM (
    SELECT p.product_id, p.product_name, SUM(p.price * o.amount) AS total_sales
    FROM food_product p
    INNER JOIN food_order o ON p.product_id = o.product_id
    WHERE TO_CHAR(o.produce_date, 'YYYY-MM') = '2022-05'
    GROUP BY p.product_id, p.product_name
) sub
ORDER BY sub.total_sales DESC, sub.product_id ASC;