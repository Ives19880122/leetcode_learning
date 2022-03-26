-- 511. Game Play Analysis I
-- Table Schema
Create table #Activity (player_id int, device_id int, event_date date, games_played int)
insert into #Activity (player_id, device_id, event_date, games_played) values ('1', '2', '2016-03-01', '5')
insert into #Activity (player_id, device_id, event_date, games_played) values ('1', '2', '2016-05-02', '6')
insert into #Activity (player_id, device_id, event_date, games_played) values ('2', '3', '2017-06-25', '1')
insert into #Activity (player_id, device_id, event_date, games_played) values ('3', '1', '2016-03-02', '0')
insert into #Activity (player_id, device_id, event_date, games_played) values ('3', '4', '2018-07-03', '5')

/**
Write an SQL query to report the first login date for each player.
Return the result table in any order.
*/

-- 直覺解
SELECT player_id, min(event_date) first_login
FROM #Activity
GROUP BY player_id

/**
Runtime: 2489 ms, faster than 75.85% of MS SQL Server online submissions for Game Play Analysis I.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Game Play Analysis I.
*/

Drop table #Activity