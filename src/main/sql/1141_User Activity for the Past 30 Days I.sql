-- 1141. User Activity for the Past 30 Days I
Create table #Activity (user_id int, session_id int, activity_date date, activity_type nvarchar(30))
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('1', '1', '2019-07-20', 'open_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('1', '1', '2019-07-20', 'scroll_down')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('1', '1', '2019-07-20', 'end_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('2', '4', '2019-07-20', 'open_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('2', '4', '2019-07-21', 'send_message')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('2', '4', '2019-07-21', 'end_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('3', '2', '2019-07-21', 'open_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('3', '2', '2019-07-21', 'send_message')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('3', '2', '2019-07-21', 'end_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('4', '3', '2019-06-25', 'open_session')
insert into #Activity (user_id, session_id, activity_date, activity_type) values ('4', '3', '2019-06-25', 'end_session')

-- 解1
SELECT 
  activity_date [day], count(user_id) active_users
FROM (
  SELECT 
    user_id ,activity_date, rank() over (PARTITION BY user_id, activity_date order by newID()) num
  FROM #Activity 
  WHERE activity_date >= DATEADD(day,-29,'2019-07-27') and '2019-07-27' >= activity_date
) m
WHERE num = 1
GROUP BY activity_date
/**
Runtime: 4235 ms, faster than 9.25% of MS SQL Server online submissions for User Activity for the Past 30 Days I.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for User Activity for the Past 30 Days I.
*/

-- 解2 直接distinct 來源資料
SELECT 
  activity_date [day], count(user_id) active_users
FROM (
  SELECT Distinct
    user_id , activity_date
  FROM #Activity 
  WHERE activity_date >= DATEADD(day,-29,'2019-07-27') and '2019-07-27' >= activity_date
) m
GROUP BY activity_date

/**
Runtime: 2203 ms, faster than 58.33% of MS SQL Server online submissions for User Activity for the Past 30 Days I.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for User Activity for the Past 30 Days I.
*/

-- 解3 Group by twice
SELECT 
  activity_date [day], count(user_id) active_users
FROM (
  SELECT 
    user_id , activity_date
  FROM #Activity 
  WHERE activity_date >= DATEADD(day,-29,'2019-07-27') and '2019-07-27' >= activity_date
  GROUP BY user_id, activity_date 
) m
GROUP BY activity_date
/**
Runtime: 1713 ms, faster than 87.50% of MS SQL Server online submissions for User Activity for the Past 30 Days I.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for User Activity for the Past 30 Days I.
*/

DROP table #Activity
