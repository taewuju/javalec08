-- SQL문
-- Ansi SQL문 (모든 데이터베이스 시스템에서 사용가능)
-- Ansi SQL문+ 자체SQL => 데이터베이스 벤더가 사용
-- MSSQL 자체 SQL문을 T-SQL (Transaction SQL)
-- Oracle 자체 SQLansdmf PL/SQL

-- SQL문의 주석(한줄 주석)
/*
		여러줄 주석
*/

-- CRUD
-- DML(Data Manipulation language) : 데이터 조작어
-- C : Create (생성) - INSERT 키워드를 사용.
-- R : Read - SELECT 키워드를 사용.
-- U : Update - Update 키워드를 사용.
-- D : Delete - Delete 키워드를 사용.

-- DDL : 데이터베이스 관리/정의	
-- (데이터를 생성하거나 정의)
-- C : Create - Create 키워드를 사용.
-- R : Read - Show 키워드를 사용.
-- U : Update - Update 키워드를 사용.
-- D : Delete - Drop 키워드를 사용.

SELECT * FROM user; -- 조건을 부여가능. where절
-- user 테이블에서 id가 rdsadmin인 rows만 가져와
SELECT * FROM user WHERE user = 'rdsadmin';
-- Select_priv컬럼이 Y이고 Host가 Localhost인
-- 모든 데이터를 가지고 와라
SELECT HOST, user, select_priv
FROM user WHERE select_priv = 'Y' AND HOST = 'localhost';
-- ORuser