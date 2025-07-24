USE simpleschool;

SELECT CourseName, CreditHours, SubjectName FROM Course INNER JOIN Subject ON Course.SubjectID = Subject.SubjectID WHERE SubjectName = 'History' ORDER BY CourseName;

SELECT C.CourseName, C.CreditHours, S.SubjectName FROM Course c, Subject s WHERE C.SubjectID = S.SubjectID AND S.SubjectName = 'History' ORDER BY c.CourseName;

SELECT C.CourseName, C.CreditHours, S.SubjectName FROM Course c INNER JOIN Subject s ON c.SubjectID = s.SubjectID WHERE S.SubjectName = 'History' ORDER BY c.CourseName;

SELECT CourseName, CreditHours, SubjectName FROM Course INNER JOIN Subject ON Course.SubjectID = Subject.SubjectID WHERE SubjectName LIKE 'Art%' ORDER BY SubjectName, CourseName;

SELECT RoomNumber, Description, BuildingName FROM Room INNER JOIN Building ON Room.BuildingID = Building.BuildingID WHERE Description IS NULL;

SELECT CourseName FROM Course INNER JOIN Teacher ON Course.CourseID = Teacher.TeacherID WHERE CreditHours > 3 AND Teacher.FirstName = 'Geno';