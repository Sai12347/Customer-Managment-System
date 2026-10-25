package com.java.classs.assisgment;

import java.util.HashSet;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerOperations customerOperations = new CustomerOperations();
          Customer customer = new Customer();

        System.out.println("intial Customers");
        System.out.println(customerOperations.getCustomers());

     customerOperations.getCustomers();
        boolean isCustomerAdded = customerOperations.addCustomer(106,"Ananya","Verma",'F');
        if(isCustomerAdded){
            System.out.println("\nCustomer Added Succesfully");
        } else{
            System.out.println("\nCustomer not added");
        }
        System.out.println(customerOperations.getCustomers());
        isCustomerAdded = customerOperations.addCustomer(106,"Ananya","Verma",'F');
        if(isCustomerAdded){
            System.out.println("\nCustomer Added Succesfully");
        } else{
            System.out.println("\nCustomer not added");
        }
        System.out.println();
        System.out.println(customerOperations.getCustomers());

        System.out.println("\nUpdatingCustomer Id 103");
        customerOperations.updateCustomer(103,"Arjun","Reddy",'M');
        System.out.println(customerOperations.getCustomers());
        System.out.println("\nDeleting Customer Id 104");
        customerOperations.deleteCustomer(104);
        System.out.println(customerOperations.getCustomers());
        System.out.println("\nFinding customer by FirstName: Kiran");
        Customer byName = customerOperations.findCustomerByFirstName("Kiran");
        if (byName != null) {
            System.out.println("Found: " + byName);
        } else {
            System.out.println("Customer not found with first name Kiran");
        }
        System.out.println("\nFinding customer by Id: 102");
        Customer byId = customerOperations.findCustomerById(102);
        if (byId != null) {
            System.out.println("Found: " + byId);
        } else {
            System.out.println("Customer not found with id 102");
        }
        System.out.println("\nFinding customer by Id: 999");
        byId = customerOperations.findCustomerById(999);
        if (byId != null) {
            System.out.println("Found: " + byId);
        } else {
            System.out.println("Customer not found with id 999");
        }

        System.out.println("\n All Customers:");
        System.out.println(customerOperations.getCustomers());
    }
}
