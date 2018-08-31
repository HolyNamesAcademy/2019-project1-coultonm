
public class Student {
    private String name;
    private int height;
    private int gradeLevel;
    private String favoriteColor;
    private BankAccount bankAccount;

    // Constructor
    Student(String name, int height, int gradeLevel, String favoriteColor, BankAccount bankAccount) {
        this.name = name;
        this.height = height;
        this.gradeLevel = gradeLevel;
        this.favoriteColor = favoriteColor;
        this.bankAccount = bankAccount;
    }

    // Getters
    public String GetName() { return name; }
    public int GetHeight() { return height; }
    public int GetGradeLevel() { return gradeLevel; }
    public String GetFavoriteColor() { return favoriteColor; }
    public BankAccount GetBankAccount() { return bankAccount; }

    // Setters
    public void SetGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }
    public void SetFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }

    // define comparison
    public boolean equals(Student other) {
        if (!name.equals(other.name)) {
            return false;
        }

        if (height != other.height) {
            return false;
        }

        if (gradeLevel != other.gradeLevel) {
            return false;
        }

        if (!favoriteColor.equals(other.favoriteColor)) {
            return false;
        }

        if (!bankAccount.equals(other.bankAccount)) {
            return false;
        }

        return true;
    }
}
