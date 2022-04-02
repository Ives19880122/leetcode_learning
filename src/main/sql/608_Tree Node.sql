-- 608_Tree Node
-- table schema
Create table #Tree (id int, p_id int)
insert into #Tree (id, p_id) values ('1', null)
insert into #Tree (id, p_id) values ('2', '1')
insert into #Tree (id, p_id) values ('3', '1')
insert into #Tree (id, p_id) values ('4', '2')
insert into #Tree (id, p_id) values ('5', '2')

/**
* Write an SQL query to report the type of each node in the tree.
* Return the result table ordered by id in ascending order.
* The query result format is in the following example.
*/
-- 直覺解(沒有p_id一定是root, 如果有child是inner, 剩下是Leaf)
SELECT id , 
    case 
    when p_id is null then 'Root' 
    when (select top 1 1 from #Tree i where o.id = i.p_id ) > 0 then 'Inner'
    ELSE 'Leaf' End type
FROM #Tree o

/**
* Runtime: 537 ms, faster than 98.15% of MS SQL Server online submissions for Tree Node.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Tree Node.
*/

drop table #Tree