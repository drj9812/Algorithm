SELECT mcdp_cd AS "진료과 코드", COUNT(*) AS "5월예약건수"
  FROM appointment
 WHERE EXTRACT(MONTH FROM apnt_ymd) = 05
 GROUP BY mcdp_cd
 ORDER BY "5월예약건수" ASC, "진료과 코드" ASC;