public class Circle {
    int radius;
    static double pi = 3.14159;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * pi * radius;
    }
}
