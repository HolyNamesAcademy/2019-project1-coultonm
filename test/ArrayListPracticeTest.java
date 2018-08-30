import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ArrayListPracticeTest {
    private ArrayList<Integer> CreateIntegerArrayList() {
        return new ArrayList<Integer>(Arrays.asList(5, 18, 3, 2, 6, 7, 9, 22, 10));
    }

    private ArrayList<Student> CreateStudentArrayList() {
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
    public void CreateNumberArray() {
        // Arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(9, 10, 11, 12, 13, 14));

        // Act
        ArrayList<Integer> actual = ArrayListPractice.CreateNumberArray(9, 15);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateNumberArrayEmpty() {
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
    public void CreateStudentArray() {

        // write your code above and remove the line below
        throw new NotImplementedException();
    }

    @Test
    public void GetTeamsString() {
        // Arrange
        ArrayList<ArrayList<Student>> teams = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Student> team = CreateStudentArrayList();
            teams.add(team);
        }
        String expected =
               "Emily Joshua Jessica Michael Daniel Madison\n" +
               "Emily Joshua Jessica Michael Daniel Madison\n" +
               "Emily Joshua Jessica Michael Daniel Madison\n" +
               "Emily Joshua Jessica Michael Daniel Madison\n";


        // Act
        String actual = ArrayListPractice.GetTeamsString(teams);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void UpdateFavoriteColor() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();

        // Act
        ArrayListPractice.UpdateFavoriteColor(students, "Jessica", "brown");

        // Assert
        assertEquals("brown", students.get(2).GetFavoriteColor());
    }

    @Test
    public void UpdateGradeLevels() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();

        // Act
        ArrayListPractice.UpdateGradeLevels(students);

        // Assert
        assertEquals(4, students.size());
        assertEquals(12, students.get(0).GetGradeLevel());
        assertEquals(12, students.get(1).GetGradeLevel());
        assertEquals(10, students.get(2).GetGradeLevel());
        assertEquals(11, students.get(3).GetGradeLevel());
    }

    @Test
    public void GetStudentsInGradeLevel() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();

        // Act
        ArrayList<Student> output = ArrayListPractice.GetStudentsInGradeLevel(students, 11);

        // Assert
        assertEquals(students.get(0), output.get(0));
        assertEquals(students.get(2), output.get(1));
    }

    @Test
    public void TransferMoneySuccess() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Michael", "Madison", 30);

        // Assert
        assertEquals(20, students.get(3).GetBankAccount().GetBalance(), 0.1);
        assertEquals(140, students.get(5).GetBankAccount().GetBalance(), 0.1);
        assertTrue(output);
    }

    @Test
    public void TransferMoneyFailure() {
        // Arrange
        ArrayList<Student> students = CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Michael", "Madison", 80);

        // Assert
        assertEquals(50, students.get(3).GetBankAccount().GetBalance(), 0.1);
        assertEquals(110, students.get(5).GetBankAccount().GetBalance(), 0.1);
        assertFalse(output);
    }
}
