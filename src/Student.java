public class Student {
    String name;
    int groupNumber;
    double averageGrade;
    Book[] books;

    public Student(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public void updateGrade(int grade) {
        this.averageGrade = grade;
    }

    public void printInfo() {
        System.out.println("Student information:");
        System.out.println("Name:" + name);
        System.out.println("Group Number:" + groupNumber);
        System.out.println("Average Grade:" + averageGrade);
    }
}
