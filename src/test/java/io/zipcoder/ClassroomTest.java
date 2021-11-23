package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void testAverageExamScore() {
        // given
        Double[] stud1Scores = { 95.0, 160.0 };
        Double[] stud2Scores = { 185.0, 60.0 };
        Student stud1 = new Student ("student", "one", stud1Scores);
        Student stud2 = new Student ("student", "two", stud2Scores);
        Student[] students = { stud1, stud2 };
        Classroom classroom = new Classroom(students);

        // when
        double output = classroom.getAverageExamScore();

        // then
        System.out.println(output);
    }



}
