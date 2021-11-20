package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {

    private Student[] students;
    int maxNUmberOfStudents;

    public void Classroom(int maxNUmberOfStudents) {
        this.maxNUmberOfStudents = maxNUmberOfStudents;
    }

    public void Classroom(Student[] students) {
        this.students = students;
    }

    // nullary constructor sets empty array size 30
    public void Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        // declare sum variable to keep track
        Double sum = 0.0;

        // update sum with
        for (Student student : students) {
            // loop through students in list adding exam scores to sum
            sum = sum + student.getAverageExamScore();
        }
        // return the avg score
        return sum / students.length;
    }

    public void addStudent(Student student) {
        // looping through length of students array
        for (int i = 0; i < students.length; i++) {
            // if the student at i equals null
            if (students[i] == null) {
                // then assign to student variable
                students[i] = student;
            }
        }
    }


    public void removeStudent(String firstName, String lastName) {

            // create new ArrayList
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));

        // loop through studentList we created
        for (int i = 0; i < studentList.size(); i++) {
            // made new student equal to studentList at i
            Student student = studentList.get(i);
            // if firstName and lastName equal the values when you call .getFirstName and .getLastName on student (at i)
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                // remove student from list
                studentList.remove(student);
                // add null to list bc arraylists cannot change in size at initialized
                studentList.add(null);
            }

        }
        this.students = studentList.toArray(new Student[0]);
    }

public Student[] getStudentsByScore() {
        // create new arraylist
    List<Student> studentList = new ArrayList(Arrays.asList(students));
    return null;
}

public Object getGradeBook() {
        return null;
}




}
