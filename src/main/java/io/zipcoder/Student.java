package io.zipcoder;

import java.util.ArrayList;

public class Student {


    // part 1.1
    String firstName;

    String lastName;

    Double[] examScores;


    // part 1.2
    public void Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        examScores = testScores;
    }

    // part 1.3
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getExamScores() {

    }
}
