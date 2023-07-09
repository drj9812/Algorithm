SELECT
    TO_NUMBER(TO_CHAR(O.SALES_DATE, 'YYYY')) AS YEAR,
    TO_NUMBER(TO_CHAR(O.SALES_DATE, 'MM')) AS MONTH,
    COUNT(DISTINCT O.USER_ID) AS PUCHASED_USERS,
    ROUND(
        (COUNT(DISTINCT O.USER_ID)
         /(SELECT COUNT(USER_ID) FROM USER_INFO
           WHERE TO_CHAR(JOINED, 'YYYY') = '2021')
        ),1
    ) AS PUCHASED_RATIO
FROM ONLINE_SALE O
    LEFT OUTER JOIN USER_INFO U
    ON O.USER_ID = U.USER_ID
WHERE TO_CHAR(U.JOINED, 'YYYY') = '2021'
GROUP BY TO_CHAR(O.SALES_DATE, 'YYYY'), TO_CHAR(O.SALES_DATE, 'MM')
ORDER BY 1, 2;