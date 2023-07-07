SELECT member_id,
       member_name,
       gender,
       TO_CHAR(date_of_birth, 'YYYY-MM-DD') AS date_of_irth
  FROM member_profile
 WHERE
    TO_CHAR(date_of_birth, 'MM') = 03
    AND
    gender = 'W'
    AND
    tlno IS NOT NULL
 ORDER BY member_id ASC;
