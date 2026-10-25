package com.java.classs.assisgment;



import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {
    private HashSet<Customer> customers = new HashSet<>();


    public boolean addCustomer(int customerId, String firstName, String lastName,char gender) {
        boolean isAdded = false;
        if (findCustomerById(customerId) != null) {
            return false;                  // id already taken
        }
        Customer newProduct = new Customer(customerId, firstName,lastName,gender);
        isAdded = customers.add(newProduct);;
        return isAdded;
    }

    public HashSet<Customer> getCustomers(){
        return customers;
    }

    public CustomerOperations(){
        Customer customer1 = new Customer(101,"Rahul","Sharma",'M');
        Customer customer2 = new Customer(102,"Priya","Reddy",'F');
        Customer customer3 = new Customer(103,"Arjun","Kumar",'M');
        Customer customer4 = new Customer(104,"Sneha","Rao",'F');
        Customer customer5 = new Customer(105,"Kiran","Patel",'M');

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
    }
    public boolean updateCustomer(int productId,String firstName,String lastName,char gender) {
        boolean isUpdated = false;
        Iterator<Customer> it = customers.iterator();
        while (it.hasNext()) {
            Customer customer = it.next();

            if (customer.getId() == productId) {

                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setGender(gender);
                isUpdated = true;
                break;
            }

        }
        return false;
    }
    public boolean deleteCustomer(int customerId) {
        boolean isDeleted = false;
        Customer foundCustomer = null;
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                foundCustomer = customer;
                break;
            }

        }
        if (foundCustomer != null) {
            isDeleted = customers.remove(foundCustomer);
        }
        return false;
    }
    public Customer findCustomerById(int customerId){
        for(Customer customer: customers){
            if(customer.getId() == customerId){
                return customer;
            }
        }
        return null;
    }
    public Customer findCustomerByFirstName(String firstName){
        for(Customer customer : customers){
            if(customer.getFirstName().equals(firstName)){
                return customer;
            }
        }
        return null;
    }
}
