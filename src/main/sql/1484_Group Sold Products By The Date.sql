-- 1484. Group Sold Products By The Date

SELECT 
    sell_date,
    count(distinct product) num_sold,
    STUFF((select ','+product 
     from Activities i 
     where o.sell_date = i.sell_date
     GROUP BY product
     For xml path('')),1,1,'') products
FROM Activities o
GROUP BY sell_date

/**
* Runtime: 1635 ms, faster than 63.36% of MS SQL Server online submissions for Group Sold Products By The Date.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Group Sold Products By The Date.
*/