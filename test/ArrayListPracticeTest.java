import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class ArrayListPracticeTest {
    private static ArrayList<Integer> CreateIntegerArrayList() {
        return new ArrayList<Integer>(Arrays.asList(5, 18, 3, 2, 6, 7, 9, 22, 10));
    }

    private static ArrayList<Student> CreateStudentArrayList() {
        return new ArrayList<>(
                Arrays.asList(
                new Student("Emily", 65, 11, "blue", new BankAccount("Emily", 100)),
                new Student("Joshua", 67, 12, "orange", new BankAccount("Joshua", 120)),
                new Student("Jessica", 56, 11, "yellow", new BankAccount("Jessica", 200)),
                new Student("Michael", 60, 9, "green", new BankAccount("Michael", 50)),
                new Student("Daniel", 70, 10, "purple", new BankAccount("Daniel", 75)),
                new Student("Madison", 68, 12, "red", new BankAccount("Madison", 110))
            ));
    }

    @Test
    public void GetFirst() {
        // Arrange
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        int expected = 5;

        // Act
        int actual = ArrayListPractice.GetFirst(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetThird() {
        // Arrange
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        int expected = 3;

        // Act
        int actual = ArrayListPractice.GetThird(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetLast() {
        // Arrange
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        int expected = 10;

        // Act
        int actual = ArrayListPractice.GetLast(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetSum() {
        // Arrange
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        int expected = 82;

        // Act
        int actual = ArrayListPractice.GetSum(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToString() {
        // Arrange
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        String expected = "5 18 3 2 6 7 9 22 10";

        // Act
        String actual = ArrayListPractice.ConvertToString(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetMax() {
        // Arrange
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        int expected = 22;

        // Act
        String actual = ArrayListPractice.ConvertToString(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateNumberArray(int first, int last) {
        // Arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(9, 10, 11, 12, 13, 14));

        // Act
        ArrayList<Integer> actual = ArrayListPractice.CreateNumberArray(9, 15);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateNumberArrayEmpty(int first, int last) {
        // Arrange
        ArrayList<Integer> expected = new ArrayList<>();

        // Act
        ArrayList<Integer> actual = ArrayListPractice.CreateNumberArray(13, 13);

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void GetStudentWithFavoriteColor() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();
        Student expectedStudent = students.get(2);

        // Act
        Student actualStudent = ArrayListPractice.GetStudentWithFavoriteColor(students, "yellow");

        // Assert
        assertEquals(expectedStudent, actualStudent);
    }

    @Test
    public void GetFavoriteColor() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();
        String expected = "purple";

        // Act
        String actual = ArrayListPractice.GetFavoriteColorOfStudent(students, "Daniel");

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetTallestStudent() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();
        Student expected = students.get(4);

        // Act
        Student actual = ArrayListPractice.GetTallestStudent(students);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public static ArrayList<Student> CreateStudentArray(int numberOfStudents) {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

    @Test
    public static String GetTeamsString(ArrayList<ArrayList<Student>> teams) {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

    @Test
    public static void UpdateFavoriteColor(ArrayList<Student> students, String name, String newFavoriteColor) {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

    @Test
    public static void UpdateGradeLevels(ArrayList<Student> students) {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

    @Test
    public static ArrayList<Student> GetStudentsInGradeLevel(ArrayList<Student> students, int gradeLevel) {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

    @Test
    public static boolean TransferMoney(String fromStudentName, String toStudentName, double amount) {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

}
