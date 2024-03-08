DROP DATABASE IF EXISTS java_trading_db;
DROP user IF EXISTS 'trading'@localhost;
create database IF NOT EXISTS java_trading_db;
create user IF NOT EXISTS trading@localhost identified by '123654';
grant all privileges on java_trading_db.* To trading@localhost;