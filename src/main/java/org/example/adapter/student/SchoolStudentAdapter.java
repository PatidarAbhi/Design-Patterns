package org.example.adapter.student;

public class SchoolStudentAdapter implements  Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }

    @Override
    public String toString() {
        return "SchoolStudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}
