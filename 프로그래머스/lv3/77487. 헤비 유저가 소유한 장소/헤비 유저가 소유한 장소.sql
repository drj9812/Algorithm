SELECT id, name, host_id
  FROM places
 WHERE host_id in (
    SELECT host_id
      FROM (
        SELECT host_id, count(*) AS count
          FROM places
         GROUP BY host_id
         ORDER BY count DESC)
     WHERE count >= 2)
 ORDER BY id ASC;