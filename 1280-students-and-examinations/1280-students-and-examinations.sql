# Write your MySQL query statement below

select Students.student_id, Students.student_name,Subjects.subject_name,(select count(*) from Examinations where
                    Students.student_id =Examinations.student_id and Subjects.subject_name =Examinations.subject_name)
                    as attended_exams from Students join Subjects order by 
                    Students.student_id, Subjects.subject_name;
                                                                    


