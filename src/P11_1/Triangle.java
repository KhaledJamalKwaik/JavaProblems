package P11_1;

public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;   

    // A no-arg constructor that creates a default triangle
    public Triangle() {

    }

    // A constructor that creates a triangle with the specified side1, side2, and side3
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // A method that returns the area of this triangle    
    public double getArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1)*(s - side2)*(s - side3));
    }

    // A method that returns the perimeter of this triangle
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}