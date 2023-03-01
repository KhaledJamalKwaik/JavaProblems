package P11_1;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1 = sc.nextDouble(); 
        double side2 = sc.nextDouble(); 
        double side3 = sc.nextDouble(); 
        sc.nextLine();
        
        System.out.print("Enter the color of the triangle: ");
        String color = sc.nextLine();

        System.out.print("Is the triangle filled? ");
        boolean isFilled = sc.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.printf("\nArea = %.2f\nPerimeter = %.2f\nColor = %s\nIs filled? %b\n",
        triangle.getArea(), triangle.getPerimeter(), triangle.getColor(), triangle.isFilled());
    }
    
}
