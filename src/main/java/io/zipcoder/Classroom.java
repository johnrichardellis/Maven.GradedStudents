package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {

    private Student[] student;
    private Integer maxNUmberOfStudents;

    public Classroom(int maxNUmberOfStudents) {
        this.student = new Student[maxNUmberOfStudents];
    }

    public Classroom(Student[] students) {
        this.student = students;
    }

    // nullary constructor sets empty array size 30
    public void Classroom() {
        this.student = new Student[30];
    }

    public Student[] getStudents() {
        return student;
    }

    public Double getAverageExamScore() {
        // declare sum variable to keep track
        Double sum = 0.0;

        // update sum with
        for (Student thisStudent : student) {
            // loop through students in list adding exam scores to sum
            sum = sum + thisStudent.getAverageExamScore();
        }
        // return the avg score
        return sum / student.length;
    }

    public void addStudent(Student newStudent) {
        // looping through length of students array
        for (int i = 0; i < student.length - 1; i++) {
            // if the student at i equals null
            if (student[i] == null) {
                // then assign to student variable
                student[i] = newStudent;
            }
        }
    }


    public void removeStudent(String firstName, String lastName) {

        // create new ArrayList
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(student));

        // loop through studentList we created
        for (int i = 0; i < student.length; i++) {
            if (student[i].getFirstName().equals(firstName) && student[i].getLastName().equals(lastName)) {

            }
        }
    }

    public void getStudentByScore() {
        // create new arraylist
        Arrays.sort(student);
    }

    public void getGradeBook() {

    }
}