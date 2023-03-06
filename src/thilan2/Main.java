package thilan2;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[]args){
        CustomerRelationshipManagement crm = new CustomerRelationshipManagement();
        Scanner input = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("1. Add new customer");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    crm.addCustomer();
                    break;
                case 2:
                    crm.findCustomerByName();
                    break;
                case 3:
                    crm.displayAllCustomers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        input.close();
    }
}



