
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
}
