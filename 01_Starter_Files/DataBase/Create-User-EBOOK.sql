
CREATE USER 'ebookuser'@'localhost' IDENTIFIED BY 'ebookpassword';
GRANT ALL PRIVILEGES ON ebookdb.* TO 'ebookuser'@'localhost';
ALTER USER 'ebookuser'@'localhost' IDENTIFIED WITH mysql_native_password BY 'ebookpassword';
