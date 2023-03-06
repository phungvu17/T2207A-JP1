package thilan2;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerRelationshipManagement {
    private HashMap<String, Customer> customers;
    private Scanner input;

    public CustomerRelationshipManagement() {
        customers = new HashMap<>();
        input = new Scanner(System.in);
    }

    public void addCustomer() {
        System.out.print(" Name: ");
        String name = input.nextLine();
        System.out.print(" Email: ");
        String email = input.nextLine();
        System.out.print(" Phone: ");
        String phone = input.nextLine();

        Customer customer = new Customer(name, email, phone);
        customers.put(name, customer);
        System.out.println("Customer added successfully.");
    }

    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers in the database.");
        } else {
            System.out.println("Customers in the database:");
            for (String name : customers.keySet()) {
                Customer customer = customers.get(name);
                System.out.println("Name: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("Phone: " + customer.getPhone());
                System.out.println("------------------------");
            }
        }
    }

    public void findCustomerByName() {
        System.out.print(" Name: ");
        String name = input.nextLine();

        if (customers.containsKey(name)) {
            Customer customer = customers.get(name);
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
        } else {
            System.out.println("Customer not found.");
        }
    }

}
