SELECT m.member_name, r.review_text, TO_CHAR(r.review_date, 'YYYY-MM-DD') AS review_date
  FROM member_profile m
 INNER JOIN rest_review r
    ON m.member_id = r.member_id
 WHERE m.member_id = (
    SELECT member_id
      FROM rest_review
     GROUP BY member_id
     ORDER BY COUNT(*) DESC
     FETCH FIRST 1 ROWS ONLY)
 ORDER BY r.review_date ASC, r.review_text ASC;
 