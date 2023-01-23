package Assignment.Exceptions;
import java.io.*;
import java.util.*;

public class Exceptions {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);) { //41

            System.out.print("Enter value 1: ");
            int a = sc.nextInt();
            System.out.print("Enter value 2: ");
            int b = sc.nextInt();
            if(b == 0) {
                throw new DivideByZeroException("Cannot divide by zero");
            }
            else System.out.println("Division: " + a/b);
        } catch (DivideByZeroException e) {
            System.out.println(e);
        } finally {
            System.out.println("\nInside Finally Block");
        }
        try { //42-1
            
            File file = new File("text.txt");
            if(!file.exists()) {
                throw new FileNotFoundException("text.txt file not found\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try(Scanner sc = new Scanner(System.in)) { //42-2
            
            System.out.print("Enter your mobile phone number: ");
            String mobile = sc.next();
            for(char c : mobile.toCharArray()){
                if(!Character.isDigit(c)) {
                    throw new IOException("Invalid mobile number");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        try(Scanner sc = new Scanner(System.in)) { //45
            
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if(age < 19) throw new InvalidAgeException("Invalid age, please enter a valid age");
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        try(Scanner sc = new Scanner(System.in);) { //47
            String str = sc.next();
            int num = Integer.parseInt(str);
            File file = new File(str + ".txt");

            if(str.length() == 0) throw new NullPointerException("Empty string");
            if(num == 0) throw new ArithmeticException("Number is Zero");
            if(!file.exists()) throw new FileNotFoundException("File not found");

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}