USE sys;

DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
 customer_id INT PRIMARY KEY,
 First_Name VARCHAR(50),
 Last_Name VARCHAR(50)
);
INSERT INTO customers (customer_id, First_Name, Last_Name) VALUES
(101, 'john', 'DOE'),
(102, 'SARAH', 'smith');

DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
 order_id INT PRIMARY KEY,
 customer_id INT,
 order_date DATETIME,
 order_total VARCHAR(20),
 FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
INSERT INTO orders (order_id, customer_id, order_date, order_total) VALUES
(1, 101, '2025-07-01 14:33:00', '1234.5'),
(2, 102, '2025-07-03 10:15:22', '8899.99');

SELECT * FROM Customers WHERE First_Name = 'JOHN';
-- Database is not case sensitive

SELECT * FROM Orders;
-- order_total for order_id 1 needs casting
SELECT CAST(order_total AS DECIMAL (10,2)) AS formatted_total FROM Orders;

SELECT DATE_FORMAT(order_date, '%M, %D, %Y') AS formatted_date FROM Orders;

SELECT FORMAT(order_total, 2) AS new_formatted_total FROM Orders;