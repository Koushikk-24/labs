// Write a program to compute the area of a square and a triangle by using interface class. 
interface Shape {
    double area();
}
class Square implements Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    double area() {

        Square(double side) {
            this.side = side;
        }
    }
}
class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return base * height / 2;
    }
}
public class lab8_02 {
    public static void main(String[] args) {
        Square s = new Square(5);
        Triangle t = new Triangle(3, 4);
        System.out.println("Square area: " + s.area());
        System.out.println("Triangle area: " + t.area());
    }
}
