package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String expectedFirstName = student.getFirstName();
        String expectedLastName = student.getLastName();

        // Then
        Assert.assertEquals(expectedFirstName, firstName);
        Assert.assertEquals(expectedLastName, lastName);
    }

    @Test
    public void testStudentConstructor2() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setFirstName("John");
        student.setLastName("Ellis");
        String expectedFirstName = "John";
        String expectedLastName = "Ellis";
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void testGetExamScores() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.getTestScores();
        student.getTestScores();
        String expectedFirstName = "John";
        String expectedLastName = "Ellis";
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
    }





}