package Assignment.Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface user = new UserInterface();
        // do{
        //     int choice = user.menu();
        //     user.shapeType(choice);
        //     System.out.print("Would you like to continue? (Y/N): ");
        //     user.getStr();
        // }
        // while(user.str == "Y" || user.str == "y");

        int choice = user.menu();
        user.shapeType(choice);
        
    }
}

class UserInterface {
    String str = "Y";
    Scanner sc = new Scanner(System.in);

    // public void getStr() {
    //     this.str = sc.next().toUpperCase();
    //     // System.out.println(this.str);
    // }

    public int menu() {
        System.out.println("\n\n\t\tWelcome to Shapes !\n\n");
        System.out.println("Please select one of the following options:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("\n(1/2/3)?: ");
        int choice = sc.nextInt();

        return choice;
    }

    public void shapeType(int choice) {
        switch (choice) {
            case 1:
                System.out.print("You have selected Circle, please enter the radius: ");
                int radius = sc.nextInt();
                System.out.println();
                Circle circle = new Circle(radius);
                System.out.println("Area of the circle is " + circle.calculateArea());
                System.out.println();
                break;
            case 2:
                System.out.println("You have selected Rectangle,");
                System.out.print("Please enter the length: ");
                int length = sc.nextInt();
                System.out.print("\nPlease enter the width: ");
                int width = sc.nextInt();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of the rectangle is " + rectangle.calculateArea());
                System.out.println();
                break;
            case 3:
                System.out.print("You have selected Square, please enter the side: ");
                int side = sc.nextInt();
                Square square = new Square(side);
                System.out.println("Area of the square is " + square.calculateArea());
                System.out.println();
                break;
            default:
                System.out.println("Invalid input, redirecting to the main menu");
        }

    }
}
