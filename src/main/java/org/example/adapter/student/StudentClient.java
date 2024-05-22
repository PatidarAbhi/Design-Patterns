package org.example.adapter.student;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public static List<Student> getStudents()
    {
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent= new CollegeStudent("Abhi", "a@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("Ravi", "r@gmail.com");
        students.add(collegeStudent);
        // here if we try to add school student here we will get error so we need to create a studentAdapter here
        //students.add(schoolStudent);

        SchoolStudentAdapter schoolStudentAdapter =new SchoolStudentAdapter(schoolStudent);
        students.add(schoolStudentAdapter);
        return  students;
    }
}
