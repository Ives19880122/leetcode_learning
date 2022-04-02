-- 626_Exchange Seats
-- table schema
Create table #Seat (id int, student varchar(255))
insert into #Seat (id, student) values ('1', 'Abbot')
insert into #Seat (id, student) values ('2', 'Doris')
insert into #Seat (id, student) values ('3', 'Emerson')
insert into #Seat (id, student) values ('4', 'Green')
insert into #Seat (id, student) values ('5', 'Jeames')

/**
* Write an SQL query to swap the seat id of every two consecutive students. 
* If the number of students is odd, the id of the last student is not swapped.
* Return the result table ordered by id in ascending order.
*/
-- 解一先找到最後一筆,其他在用計算置換
WITH cte as(
  SELECT max(id) id FROM #Seat
)
SELECT 
    id, 
    case
      when id%2 = 1 then 
        case when id = (SELECT id FROM cte) then student 
        else lead(student) over(order by id asc) end
      when id%2 = 0 then lag(student) over(order by id asc)
    end student
FROM #Seat
order by id asc
/**
* Runtime: 961 ms, faster than 41.39% of MS SQL Server online submissions for Exchange Seats.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Exchange Seats.
*/

-- 參考解, 先找出前後筆id與row_number
;with cte as(
    select *,
        ROW_NUMBER() over (order by id) rn,
        lag(id) over (order by id) pre,
        lead(id) over (order by id) ne
    FROM #Seat 
)SELECT 
case 
when ne is null and rn%2 = 1 then id 
when rn%2 = 1 then ne
when rn%2 = 0 then pre
end id,
student
FROM cte
ORDER BY id

/**
* Runtime: 510 ms, faster than 96.53% of MS SQL Server online submissions for Exchange Seats.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Exchange Seats.
*/

drop table #Seat