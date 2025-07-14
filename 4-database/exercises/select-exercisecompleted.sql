-- Select Literal Values
-- 1. Write a SELECT query that prints the string: "All for one, and one for all!"
select 'All for one, and one for all!';

-- 2. Write a SELECT query that uses the CONCAT function to combine "All for one," and " and one for all!"
select 'All for one,', ' and one for all!';

-- 3. Write a SELECT query that adds 6 and 6.
select 6 + 6; 

-- 4. Write a SELECT query that divides 5 by 2.
select 5 / 2;

-- 5. Write a SELECT query that divides 5.0 by 2.0 and returns an int value. (2)
select floor(5 / 2);

-- 6. Write a SELECT query with 2 values - 6 divided by 4 and the remainder.  (1.5000, 2)
select 6 / 4, 6 % 4;

-- 7. Write a SELECT query for 6 squared. (36)
select pow(6, 2);

-- 8. Write a SELECT query that Return a random number between 1 and 100
select ceiling(rand() * 100);

-- Select Against Tables
-- 1. Select all the rows from the Building table.
select * from building;

-- 2. What are the period name, start, and end times?
select PeriodName, StartTime, EndTime from period;

-- 3. Which table is empty?


-- 4. List all courses and credit hours in the format: CourseName (CreditHours)
select CourseName, (CreditHours) from course;

-- 5. What are the teachers' full names (first names and last initials) for the first five teachers?
select FirstName, LastName from teacher limit 5;

-- 6. How many rooms are there?
select RoomNumber from  room;

-- 7. What are all of the valid BuildingIDs for a room?
select distinct(BuildingID) from room;

-- 8. How many unique SubjectIDs appear in the Course table?
select distinct(SubjectID) from course;

-- 9. How many grade types are there?


-- 10. What are the IDs and Names of the grade types? (Hint: Name the columns appropriately in the ResultSet "ID" and "Name")
select * from gradetype;

-- 11. What grade types appear in the GradeItem table?
select count(distinct(gradetypeid)) from gradeitem;






