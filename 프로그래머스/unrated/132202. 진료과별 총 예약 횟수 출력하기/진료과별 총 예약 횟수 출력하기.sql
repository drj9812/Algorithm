SELECT mcdp_cd AS "진료과 코드", count(*) AS "5월예약건수"
  FROM appointment
 WHERE TO_CHAR(apnt_ymd, 'MM') = '05'
 GROUP BY mcdp_cd
 ORDER BY "5월예약건수" ASC, "진료과 코드" ASC;
