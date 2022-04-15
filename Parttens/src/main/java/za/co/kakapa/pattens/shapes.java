package za.co.kakapa.pattens;

import java.util.Scanner;

public class shapes {
    private static int number;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // Asking the user to choose a shape they want to display
        // User should also enter the height of the shape they want to display
        String shapeType;

        System.out.println("Please enter the shape(Pyramid,Square,Triangle,Hexagon): ");
        shapeType = scanner.next();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.print("Please enter the height of the shape: ");
        number = scanner.nextInt();
        if (shapeType.equalsIgnoreCase("pyramid")){
            pyramid Pyramid = new pyramid(number);
            Pyramid.printPyramid();
        }
        else if(shapeType.equalsIgnoreCase("square")){
            Square square = new Square(number);
            square.printSquare();
        }
        else if(shapeType.equalsIgnoreCase("hexagon")){
            System.out.println("<Hexagon height is times two of the height you enter>");
            Hexagon hexagon = new Hexagon(number);
            hexagon.printHexagon();
        }
        else if(shapeType.equalsIgnoreCase("triangle")){
            Triangle triangle = new Triangle(number);
            triangle.printTriangle();
        }

    }
}
