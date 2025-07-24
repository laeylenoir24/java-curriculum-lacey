CREATE TABLE ProductCategory (
 CategoryId INT PRIMARY KEY,
 CategoryName VARCHAR(50)
);

CREATE TABLE Product (
 ProductId INT PRIMARY KEY,
 ProductName VARCHAR(100),
 CategoryId INT,
 Price DECIMAL(10, 2),
 EndDate DATE,
 FOREIGN KEY (CategoryId) REFERENCES ProductCategory(CategoryId)
);

INSERT INTO ProductCategory VALUES
(1, 'Books'),
(2, 'Stationery'),
(3, 'Clearance');

INSERT INTO Product VALUES
(101, 'Notebook', 2, 5.00, NULL),
(102, 'Pen Set', 2, 7.50, NULL),
(103, 'Calendar 2023', 2, 9.99, NULL),
(104, 'Mystery Novel', 1, 15.00, NULL),
(105, 'Classic Fiction', 1, 12.50, NULL);

UPDATE Product SET Price = 6.25 WHERE ProductName = 'Notebook';

UPDATE Product SET ProductName = 'Executive Pen Set', Price = 8.99 WHERE ProductName = 'Pen Set';

UPDATE Product SET EndDate = '2024-12-31' WHERE ProductCategory = 'Stationery';

UPDATE Product SET CategoryId = 999 WHERE ProductName = 'Calendar 2023';
-- Error 1452 Cannot add or update a child row: a foreign key constraint fails
UPDATE Product SET CategoryId = 3 WHERE ProductName = 'Calendar 2023';