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
        // below is representative of a collection of testScores
        // new arraylist of type Double passing in testScores variable
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
        // loop through and add to result string each time
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

        // adding parameter examScore to testScores list instance field
        // listName.add(itemToAddToList)
        testScores.add(examScore);
    }


    public void setExamScore(Integer examNumber, Double newScore) {

        // setting a new score to a specific exam in the list
        // listName.set(examIndex (examNumber - 1 to access that index), then the actual score)
        testScores.set(examNumber - 1, newScore);
    }

    public Double getAverageExamScore() {

        // we want to get total amount between all the scores, right?
        // then divide by how many tests we have
        // loop through and add each score to the previous total that we had
        // use the .get method to get the current score to add
        // finally, divide by .size method

        Double result = 0.0;
        for (int i = 0; i < testScores.size(); i++) {
            result = result + testScores.get(i);
        }
        return result / testScores.size();
    }

    @Override
    public String toString() {


        // simply doing an override, and then figuring out the exact formatting
        // to return it how they want

        String string = "";
        String result = string += "Student name: " + firstName + " " + lastName + "\n" +
                "> Avg Score: " + this.getAverageExamScore() + "\n" + "> Exam scores: " +
                this.getExamScores() + "\n";

        return string;
    }
}
