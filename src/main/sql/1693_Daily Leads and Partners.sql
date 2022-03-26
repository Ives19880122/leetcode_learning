-- 1693_Daily Leads and Partners
-- Table Schema
Create table #DailySales(date_id date, make_name varchar(20), lead_id int, partner_id int)
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-8', 'toyota', '0', '1')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-8', 'toyota', '1', '0')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-8', 'toyota', '1', '2')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-7', 'toyota', '0', '2')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-7', 'toyota', '0', '1')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-8', 'honda', '1', '2')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-8', 'honda', '2', '1')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-7', 'honda', '0', '1')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-7', 'honda', '1', '2')
insert into #DailySales (date_id, make_name, lead_id, partner_id) values ('2020-12-7', 'honda', '2', '1')

/**
Write an SQL query that will, for each date_id and make_name, 
return the number of distinct lead_id's and distinct partner_id's.
Return the result table in any order.
*/

-- 未確定, count內可以distinct
SELECT 
    date_id, make_name, 
    count(distinct lead_id) unique_leads,
    count(distinct partner_id) unique_partners
FROM #DailySales
GROUP BY date_id, make_name

/**
Runtime: 1303 ms, faster than 45.90% of MS SQL Server online submissions for Daily Leads and Partners.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Daily Leads and Partners.
*/

-- 小結: 不知道為什麼,有些機器同樣的語法可以跑進900ms以下

Drop table #DailySales