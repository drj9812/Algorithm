SELECT id, name, host_id
  FROM places
 WHERE host_id IN (SELECT host_id
                    FROM places
                   GROUP BY host_id
                  HAVING count(host_id) >= 2)
 ORDER BY id ASC;