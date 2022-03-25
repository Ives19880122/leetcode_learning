-- 1050. Actors and Directors Who Cooperated At Least Three Times
Create table #ActorDirector (actor_id int, director_id int, timestamp int)
insert into #ActorDirector (actor_id, director_id, timestamp) values ('1', '1', '0')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('1', '1', '1')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('1', '1', '2')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('1', '2', '3')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('1', '2', '4')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('2', '1', '5')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('2', '1', '6')
insert into #ActorDirector (actor_id, director_id, timestamp) values ('1', '2', '7')

-- 導演&演員至少合作三次
-- 解1:直覺解
SELECT actor_id, director_id 
FROM #ActorDirector
GROUP BY actor_id, director_id
Having count(*) > 2
/**
Runtime: 2640 ms, faster than 25.70% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

-- 解2: 改用distinct變慢
SELECT  actor_id, director_id FROM(
    SELECT Distinct 
        actor_id, 
        director_id, 
        count(*) over (PARTITION BY actor_id, director_id) nums 
    FROM #ActorDirector
) m
WHERE nums > 2
/**
Runtime: 3841 ms, faster than 5.88% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

-- 解3: 先partition整理後,在group by
SELECT actor_id, director_id FROM(
    SELECT 
      actor_id, director_id, 
      count(*) over (PARTITION BY actor_id, director_id) nums 
    FROM #ActorDirector
) m
WHERE nums > 2
GROUP BY actor_id, director_id
/**
Runtime: 2096 ms, faster than 47.06% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

-- 解4: 先partition整理後,在distinct
SELECT distinct actor_id, director_id FROM(
    SELECT 
      actor_id, director_id, 
      count(*) over (PARTITION BY actor_id, director_id) nums 
    FROM #ActorDirector
) m
WHERE nums > 2
/**
Runtime: 3234 ms, faster than 10.53% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

-- 解5:參考解
SELECT actor_id, director_id 
FROM #ActorDirector
GROUP BY actor_id, director_id
Having count([timestamp]) > 2
/**
Runtime: 3376 ms, faster than 9.60% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

-- 解6參考解 把count * 改成 1
SELECT distinct actor_id, director_id FROM(
    SELECT 
      actor_id, director_id, 
      count(1) over(PARTITION BY actor_id, director_id) nums 
    FROM #ActorDirector
) m
WHERE nums > 2
/**
Runtime: 1666 ms, faster than 67.49% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

-- 解7 改解3 * -> 1
SELECT actor_id, director_id FROM(
    SELECT 
      actor_id, director_id, 
      count(1) over (PARTITION BY actor_id, director_id) nums 
    FROM #ActorDirector
) m
WHERE nums > 2
GROUP BY actor_id, director_id
/**
Runtime: 1334 ms, faster than 87.31% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Actors and Directors Who Cooperated At Least Three Times.
*/

DROP TABLE #ActorDirector