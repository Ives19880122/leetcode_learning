-- 1327
/**
* 直覺解
*/
SELECT
    product_name, unit
FROM Products p
CROSS APPLY(
    SELECT SUM(unit) unit FROM Orders o
    WHERE YEAR(order_date) = 2020 and
        MONTH(order_date) = 2 and
        p.product_id = o.product_id
)d
WHERE d.unit >= 100