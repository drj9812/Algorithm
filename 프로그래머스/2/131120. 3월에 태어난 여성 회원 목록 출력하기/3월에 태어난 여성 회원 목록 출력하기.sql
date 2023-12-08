SELECT member_id, member_name, gender, TO_CHAR(date_of_birth, 'YYYY-MM-DD')
  FROM member_profile
 WHERE EXTRACT(MONTH FROM date_of_birth) = 03
       AND
       gender = 'W'
       AND
       tlno IS NOT NULL
 ORDER BY member_id ASC;