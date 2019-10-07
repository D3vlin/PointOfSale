SET GLOBAL time_zone = '-5:00';
grant all on *.* to 'root'@'localhost';
alter USER 'root'@'localhost'
IDENTIFIED WITH mysql_native_password BY 'mySql';
