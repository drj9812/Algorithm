SELECT dr_name, dr_id, mcdp_cd, TO_CHAR(hire_ymd, 'YYYY-MM-DD') AS hire_ymd
  FROM doctor
 WHERE mcdp_cd IN ('CS', 'GS')
 ORDER BY hire_ymd DESC, dr_name ASC;