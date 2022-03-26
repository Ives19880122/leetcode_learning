-- 1148. Article Views I
-- table schema 建立資料
Create table #Views (article_id int, author_id int, viewer_id int, view_date date)
insert into #Views (article_id, author_id, viewer_id, view_date) values ('1', '3', '5', '2019-08-01')
insert into #Views (article_id, author_id, viewer_id, view_date) values ('1', '3', '6', '2019-08-02')
insert into #Views (article_id, author_id, viewer_id, view_date) values ('2', '7', '7', '2019-08-01')
insert into #Views (article_id, author_id, viewer_id, view_date) values ('2', '7', '6', '2019-08-02')
insert into #Views (article_id, author_id, viewer_id, view_date) values ('4', '7', '1', '2019-07-22')
insert into #Views (article_id, author_id, viewer_id, view_date) values ('3', '4', '4', '2019-07-21')
insert into #Views (article_id, author_id, viewer_id, view_date) values ('3', '4', '4', '2019-07-21')

/**
Write an SQL query to find all the authors that viewed at least one of their own articles.
Return the result table sorted by id in ascending order.
*/

-- 直覺解
SELECT author_id id
FROM #Views 
WHERE author_id = viewer_id
GROUP BY author_id
ORDER by author_id asc

/**
Runtime: 2017 ms, faster than 63.32% of MS SQL Server online submissions for Article Views I.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Article Views I.
*/

-- distinct解 -> 在這邊distinct比group by 還快
SELECT distinct author_id id
FROM #Views 
WHERE author_id = viewer_id
ORDER by author_id asc

/**
Runtime: 1598 ms, faster than 89.95% of MS SQL Server online submissions for Article Views I.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Article Views I.
*/

Drop table #Views