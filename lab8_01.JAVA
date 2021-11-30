// Write a program to compute the area of a square and a triangle by using abstract class. 
abstract class Shape {
    abstract double area();

}
class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return base * height / 2;
    }
}
public class lab8_01 {
    public static void main(String[] args) {
        Square s = new Square(5);
        Triangle t = new Triangle(3, 4);
        System.out.println("Area of Square is " + s.area());
        System.out.println("Area of Triangle is " + t.area());
    }
}

