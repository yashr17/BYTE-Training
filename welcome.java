import java.util.LinkedList;
import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTest program to print a user input linked list");
        System.out.print("\nEnter the size of the linked list: ");
        int size = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter the elements of the linked list: ");

        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("The linked list is: HEAD -> ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("END\n\n");
        sc.close();

    }
}