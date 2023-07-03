\qecho 'all robots'
SELECT *
  FROM jaegers;

\qecho 'active robots'
SELECT *
  FROM jaegers
 WHERE status != 'Destroyed';

\qecho 'robots Mark-1 and Mark-4'
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\qecho 'robots without Mark-1 and Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\qecho 'sort mark column'
SELECT *
  FROM jaegers
 ORDER BY mark;

\qecho 'oldest robot'
SELECT *
  FROM jaegers
 WHERE launch IN
       (SELECT MIN(launch)
          FROM jaegers);

\qecho 'robot destroyed the most kaiju'
SELECT *
  FROM jaegers
 WHERE kaiju_kill IN
       (SELECT MAX(kaiju_kill)
          FROM jaegers);

\qecho 'average robots weight'
SELECT AVG (weight)
  FROM jaegers;

\qecho 'increase kill kaiju in active robots by one'
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status IN ('Active');

\qecho 'result'
 SELECT *
  FROM jaegers
 WHERE status != 'Destroyed';

\qecho 'delete destroyed robots'
DELETE
  FROM jaegers
 WHERE status IN ('Destroyed');

\qecho 'result'
 SELECT *
  FROM jaegers;