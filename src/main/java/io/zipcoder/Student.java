package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {


    // part 1.1
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;


    // part 1.2
    public Student(String firstName, String lastName, Double[] testScores) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new ArrayList<Double>(Arrays.asList(testScores));
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

    public String getExamScores() {

        String result = "";
        for (int i = 0; i < testScores.size(); i++) {
             result = result + "Exam " + (i + 1) + " score: " + testScores.get(i) + "\n";
        }
        return result;

    }

    public Integer getNumberOfExamsTaken() {
        return testScores.size();
    }

//    public String getExamScores() {
//        String result = "";
//
//        for (int i = 0; i < testScores.size(); i++) {
//            result = result + "Exam " + (i + 1) + " score: " + testScores.get(i) + "\n";
//        }
//        return result;
//    }


    public void addExamScore(Double examScore) {
        testScores.add(examScore);
    }


    public void setExamScore(Integer examNumber, Double newScore) {

        testScores.set(examNumber - 1, newScore);
    }

    public Double getAverageExamScore() {
        Double result = 0.0;
        for (int i = 0; i < testScores.size(); i++) {
            result = result + testScores.get(i);
        }
        return result / testScores.size();
    }

    @Override
    public String toString() {
        String string = "";
        String result = string += "Student name: " + firstName + " " + lastName + "\n" +
                "> Avg Score: " + this.getAverageExamScore() + "\n" + "> Exam scores: " +
                this.getExamScores() + "\n";

        return string;
    }
}
