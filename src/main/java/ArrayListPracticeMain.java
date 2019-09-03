import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListPracticeMain {

    public static void Run() {
        // Use this space to test ArrayListPractice
        ArrayList<Integer> numbers = CreateIntegerArrayList();
        ArrayList<Student> students = CreateStudentArrayList();

        /* Call ArrayListPractice functions here. For example:

        String favoriteColor = ArrayListPractice.GetFavoriteColorOfStudent(students, "Madison");
        System.out.println(favoriteColor);
         */
    }

    /**
     * @return an ArrayList of numbers.
     */
    public static ArrayList<Integer> CreateIntegerArrayList() {
        return new ArrayList<Integer>(Arrays.asList(5, 18, 3, 2, 6, 7, 9, 22, 10));
    }

    public static ArrayList<Student> CreateStudentArrayList(ArrayList<String> requiredStudents) {
        for (var student : requiredStudents) {
            students.stream()
        }
    }

    public static ArrayList<Student> CreateStudentArrayList() {
        return CreateStudentArrayList({"Emily", "Joshua", "Jessica", "Michael", "Daniel", "Madison"});
    }

    public static ArrayList<Student> CreateStudentArrayList(String[] requiredStudents) {
        ArrayList<Student> result = new ArrayList<>();
        for (String student : requiredStudents) {
            if (students.containsKey(student)) {
                result.add(students.get(student));
            }
        }
        return result;
    }

    public static ArrayList<Student> CreateStudentArrayListNoBankAccount() {
        return CreateStudentArrayListNoBankAccount({"Emily", "Joshua", "Jessica", "Michael", "Daniel", "Madison"});
    }

    public static ArrayList<Student> CreateStudentArrayListNoBankAccount(String[] requiredStudents) {
        ArrayList<Student> result = new ArrayList<>();
        for (String student : requiredStudents) {
            if (students.containsKey(student)) {
                result.add(students.get(student));
            }
        }
        return result;
    }

    private static HashMap<String, Student> students;
    private static HashMap<String, Student> studentsNoBankAccount;

    static {
        students = new HashMap<>();
        students.put("Emily", new Student("Emily", 65, 11, "blue", new BankAccount("Emily", 100)));
        students.put("Joshua", new Student("Joshua", 67, 12, "orange", new BankAccount("Joshua", 120)));
        students.put("Jessica", new Student("Jessica", 56, 11, "yellow", new BankAccount("Jessica", 200)));
        students.put("Michael", new Student("Michael", 60, 9, "green", new BankAccount("Michael", 50)));
        students.put("Daniel", new Student("Daniel", 70, 10, "purple", new BankAccount("Daniel", 75)));
        students.put("Madison", new Student("Madison", 68, 12, "red", new BankAccount("Madison", 110)));

        studentsNoBankAccount = new ArrayList<>();
        students.put("Emily", new Student("Emily", 65, 11, "blue"));
        students.put("Joshua", new Student("Joshua", 67, 12, "orange"));
        students.put("Jessica", new Student("Jessica", 56, 11, "yellow"));
        students.put("Michael", new Student("Michael", 60, 9, "green"));
        students.put("Daniel", new Student("Daniel", 70, 10, "purple"));
        students.put("Madison", new Student("Madison", 68, 12, "red"));
    }


}
