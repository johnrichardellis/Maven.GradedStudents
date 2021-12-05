package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Classroom {

    private Student[] student;  // list of students, can be used to initialize
    private Integer maxNUmberOfStudents;

    // redoing constructors for practice
    public Classroom (int maxNumberOfStudents) {
        this.student = new Student[maxNumberOfStudents];
    }

    public Classroom (Student[] students) {
        this.student = students;
    }

    public Classroom () {
        this.student = new Student[30];
    }

//    public Classroom(int maxNUmberOfStudents) {
//
//        this.student = new Student[maxNUmberOfStudents];
//    }
//
//    public Classroom(Student[] students) {
//
//        this.student = students;
//    }
//
//
//    public void Classroom() {
//
//        // nullary constructor sets empty array size 30
//        this.student = new Student[30];
//    }

    public Student[] getStudents() {

        return student;
    }

    public Double getAverageExamScore() {

//        // again for practice
//        Double sum = 0.0;
//
//        for (Student thisStudent : student) {
//            sum = sum + thisStudent.getAverageExamScore();
//        }
//        return sum / student.length;



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


        // cannot simply do student.add(newStudent) here














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
            // check to see if the firstName and lastName match what we are given
            if (student[i].getFirstName().equals(firstName) && student[i].getLastName().equals(lastName)) {
                    // if student matches, remove that particular student
                    studentList.remove(student[i]);
                    // add null
                    // arrays cannot change size, so you cannot remove without placing something
                    // in its place. in this case we would replace with null
                    studentList.add(null);
            }
        }
    }

    public void getStudentByScore() {
//        List<Student> studentbyScore = new ArrayList<>(Arrays.asList(student));
//
//        Comparator<Student> byExamScores = Comparator.comparing(Student::getAverageExamScore);
//        Comparator<Student> byFullName = Comparator.comparing(Student::getFullName);
//
//        studentbyScore.sort(byExamScores.reversed().thenComparing(byFullName));
//
//        return studentbyScore.toArray(new Student[0]);



    }

    public void getGradeBook() {

    }
}