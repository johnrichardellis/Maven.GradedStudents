package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testAddExam() {
        // given
        Double[] examScore = {};
        Student student = new Student("Larry", "Lance", examScore);

        // when
        student.addExamScore(88.0);
        String expected = "Exam " + 1 + " score: " + 88.0 + "\n";

        // then
        Assert.assertEquals(expected, student.getExamScores());

    }




}