package org.example.adapter.student;

public class SchoolStudent{

    private String firstName;
    private String emailAddress;

    public SchoolStudent(String firstName, String emailAddress) {
        this.firstName = firstName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "firstName='" + firstName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
