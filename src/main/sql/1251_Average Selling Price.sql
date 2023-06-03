/**
* Write an SQL query to find the average selling price for each product.
* average_price should be rounded to 2 decimal places.
*/
SELECT
    product_id,
    ROUND(SUM(price * units) / SUM(units), 2) average_price
FROM Prices p
CROSS APPLY(
    SELECT cast(units as float) units
    FROM UnitsSold s
    WHERE p.product_id = s.product_id and
        purchase_date between p.start_date and p.end_date
) r
GROUP BY product_id