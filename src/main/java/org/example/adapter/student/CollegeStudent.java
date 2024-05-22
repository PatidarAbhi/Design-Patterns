package org.example.adapter.student;

public class CollegeStudent implements Student{

    private String name;
    private String email;

    public CollegeStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
