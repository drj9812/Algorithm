SELECT FLAVOR
  FROM
    (SELECT flavor, SUM(total_order) AS total_order
       FROM
         (SELECT flavor, total_order
            FROM first_half
           UNION ALL
          SELECT flavor, total_order
            FROM july)
      GROUP BY flavor
      ORDER BY total_order DESC)
 FETCH FIRST 3 ROWS ONLY;