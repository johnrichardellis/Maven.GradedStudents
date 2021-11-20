package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

        @Test
        public void addStudentTest() {
            // given
            int maxNumberOfStudents = 1;
            Classroom classroom = new Classroom(maxNumberOfStudents);
            Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
            Student student = new Student("John", "Ellis", examScores);


            // when
            Student[] enrolledAtStart = classroom.getStudents();;
            classroom.addStudent(student);
            Student[] enrolledAtEnd = classroom.getStudents();


            // then
            String enrolledAtStartAsAString = Arrays.toString(enrolledAtStart);
            String enrolledAtEndAsAString = Arrays.toString(enrolledAtEnd);

        }




}
