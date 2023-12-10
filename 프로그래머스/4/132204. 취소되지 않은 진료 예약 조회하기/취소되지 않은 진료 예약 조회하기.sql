SELECT sub.apnt_no, p.pt_name, p.pt_no, d.mcdp_cd, d.dr_name, sub.apnt_ymd
  FROM (SELECT apnt_no, pt_no, mcdp_cd, mddr_id, apnt_ymd
          FROM appointment
         WHERE TO_CHAR(apnt_ymd, 'YYYY-MM-DD') = '2022-04-13'
               AND
               apnt_cncl_yn = 'N'
               AND
               mcdp_cd = 'CS') sub
 INNER JOIN patient p ON sub.pt_no = p.pt_no
 INNER JOIN doctor d ON sub.mddr_id = d.dr_id
 ORDER BY apnt_ymd ASC;