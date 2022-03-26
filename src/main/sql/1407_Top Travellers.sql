-- 1407. Top Travellers
-- table schema
Create Table #Users (id int, name varchar(30))
Create Table #Rides (id int, user_id int, distance int)
insert into #Users (id, name) values ('1', 'Alice')
insert into #Users (id, name) values ('2', 'Bob')
insert into #Users (id, name) values ('3', 'Alex')
insert into #Users (id, name) values ('4', 'Donald')
insert into #Users (id, name) values ('7', 'Lee')
insert into #Users (id, name) values ('13', 'Jonathan')
insert into #Users (id, name) values ('19', 'Elvis')

insert into #Rides (id, user_id, distance) values ('1', '1', '120')
insert into #Rides (id, user_id, distance) values ('2', '2', '317')
insert into #Rides (id, user_id, distance) values ('3', '3', '222')
insert into #Rides (id, user_id, distance) values ('4', '7', '100')
insert into #Rides (id, user_id, distance) values ('5', '13', '312')
insert into #Rides (id, user_id, distance) values ('6', '19', '50')
insert into #Rides (id, user_id, distance) values ('7', '7', '120')
insert into #Rides (id, user_id, distance) values ('8', '19', '400')
insert into #Rides (id, user_id, distance) values ('9', '7', '230')

/**
Write an SQL query to report the distance traveled by each user.
Return the result table ordered by travelled_distance in descending order, 
if two or more users traveled the same distance, 
order them by their name in ascending order.
*/

-- 直覺解
SELECT [name], isNull(d,0) travelled_distance
FROM #users u
LEFT JOIN(
  SELECT 
    user_id, 
    sum(distance) d
  FROM #Rides
  GROUP BY user_id
)d ON u.id = d.user_id
ORDER BY isnull(d,0) desc, [name] asc
/**
Runtime: 1717 ms, faster than 38.20% of MS SQL Server online submissions for Top Travellers.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Top Travellers.
*/

-- 解2
;with cte as(
  SELECT 
    user_id id, 
    sum(distance) d
  FROM #Rides
  GROUP BY user_id
)
SELECT * 
FROM (
 SELECT 
  [name],  
   isnull((SELECT d FROM cte WHERE cte.id = u.id),0) travelled_distance
 FROM #users u 
) m
ORDER BY travelled_distance desc, [name] asc
/**
Runtime: 1697 ms, faster than 38.20% of MS SQL Server online submissions for Top Travellers.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Top Travellers.
*/

-- 參考簡化
SELECT [name], isNull(sum(distance),0) travelled_distance
FROM #users u
LEFT JOIN #Rides d ON u.id = d.user_id
GROUP BY [name]
ORDER BY sum(distance) desc, [name] asc
/**
Runtime: 1455 ms, faster than 59.72% of MS SQL Server online submissions for Top Travellers.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Top Travellers.
*/

-- 清除暫存表
Drop table #Users
Drop table #Rides