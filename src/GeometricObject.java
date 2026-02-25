import java.util.Scanner;
Scanner sc = new Scanner(System.in);
public class GeometricObject {
    private String color;
    private boolean filled;
    java.util.Date dateCreated = new java.util.Date();

    GeometricObject() {

    }

    public GeometricObject(String color) {
        String getColor;
        sc.nextLine();
    }

    public GeometricObject(boolean filled) {
        String getBoolean;
        sc.nextLine();
    }
}
public class Circle extends GeometricObject {
    private double radius;
    private double area;
    public Circle() {
    }
    public double getRadius () {
        return this.radius;
        }
    public void setRadius(){
        this.setRadius();  }
    public double getArea(){
        return this.area;
        }
    public void setArea(){
        this.setArea();
    }
}

public class Rectangle extends GeometricObject {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    public Rectangle() {}

    public double getLength() {
        return length;
    }
    public void setLength(){
        this.setLength();
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(){
        this.setWidth();
    }
    public double getArea() {
        return area;
    }
    public void setArea(){
        this.setArea();
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(){
        this.setPerimeter();
    }
}
public class triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private double perimeter;
    public triangle() {}
    public double getSide1() {
        return side1;
    }
    public void setSide1(){
        this.setSide1();
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(){
        this.setSide2();
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(){
        this.setSide3();
    }
    public double getArea() {
        return this.area;
    }
    public void setArea(){
        this.setArea();
    }
    public double getPerimeter() {
        return this.perimeter;
    }
    public void setPerimeter(){
        this.setPerimeter();
    }
}

void main() {
    Object scanner = Scanner;
    Scanner sc = new Scanner(System.in);
     IO.println("Dame los 3 lados de un triangulo");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        IO.println(triangle);
}

private Object Scanner;