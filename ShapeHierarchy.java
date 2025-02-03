abstract class Shape {

public abstract double calculateArea();
}
class Circle extends Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}

}

class Rectangle extends Shape {
private double length;
private double width;

public Rectangle(double length, double width) {

this.length = length;
this.width = width;
}
@Override
public double calculateArea() {
return length * width;
}
}
public class ShapeHierarchy {
public static void main(String[] args) {
Circle circle = new Circle(5);
Rectangle rectangle = new Rectangle(4, 6);
System.out.println("Circle Area: " + circle.calculateArea());
System.out.println("Rectangle Area: " + rectangle.calculateArea());
}
}
