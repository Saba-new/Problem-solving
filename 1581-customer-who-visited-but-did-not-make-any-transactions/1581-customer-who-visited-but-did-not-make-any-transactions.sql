SELECT customer_id,COUNT(*) AS count_no_trans

FROM Visits V
LEFT JOIN Transactions t
ON V.visit_id=t.visit_id
WHERE t.visit_id IS NULL
GROUP BY V.customer_id;

