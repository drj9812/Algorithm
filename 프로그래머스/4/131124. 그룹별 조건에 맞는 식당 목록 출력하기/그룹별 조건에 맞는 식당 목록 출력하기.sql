SELECT p.member_name, r.review_text, TO_CHAR(r.review_date, 'YYYY-MM-DD') AS review_date
  FROM member_profile p
 INNER JOIN rest_review r
    ON p.member_id = r.member_id
 WHERE p.member_id IN (SELECT member_id
                         FROM (SELECT member_id,
                                      DENSE_RANK() OVER(ORDER BY count(member_id) DESC) AS count
                                 FROM rest_review
                                GROUP BY member_id)
                        WHERE count = 1)
 ORDER BY review_date ASC, review_text ASC;