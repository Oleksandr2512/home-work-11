//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task01");
        Book myBook = new Book("Java Development for Dummies", "Vasya", 1000);
        myBook.printInfo();

        System.out.println("Task02");
        Circle myCircle = new Circle(5);
        System.out.println("Circle area = " + myCircle.calculateArea());
        System.out.println("Circle lenght = " + myCircle.calculateCircumference());

        System.out.println("Task03");
        Book book1 = new Book("Java Development for Dummies", "Vasya", 1000);
        Book book2 = new Book("C# Development for Dummies", "Petya", 2000);
        Book book3 = new Book("C++ Development for Dummies", "Sasha", 5000);

        Student student = new Student("Alexander", 5);
        student.printInfo();
    }
}