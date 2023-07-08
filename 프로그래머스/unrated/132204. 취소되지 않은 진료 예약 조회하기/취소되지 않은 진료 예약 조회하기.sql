SELECT a.apnt_no, p.pt_name, p.pt_no, d.mcdp_cd, d.dr_name, a.apnt_ymd
  FROM appointment a
 INNER JOIN doctor d ON a.mddr_id = d.dr_id
 INNER JOIN patient p ON a.pt_no = p.pt_no
 WHERE
    TO_CHAR(a.apnt_ymd, 'YYYY-MM-DD') = '2022-04-13'
    AND
    a.apnt_cncl_yn = 'N'
    AND
    d.mcdp_cd = 'CS'
 ORDER BY a.apnt_ymd ASC;