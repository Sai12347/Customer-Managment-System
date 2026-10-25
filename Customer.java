package com.java.classs.assisgment;



public class Customer implements Comparable<Customer>{
    private int id;
    private String firstName;
    private String lastName;
    private char gender;

    public Customer(){

    }

    public Customer(int id,String firstName,String lastName,char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "\nCustomer[id=" + id + ", firstname=" + firstName
                + ", lastname=" + lastName + ", gender=" + gender + "]";
    }

    @Override
    public int compareTo(Customer o) {
        Customer currentCustomer = (Customer) this;
        Customer otherCustomer = (Customer) o;
        if (currentCustomer.getId() > otherCustomer.getId()) {
            return -1;
        } else if (currentCustomer.getId() < otherCustomer.getId()) {
            return 1;
        }

        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        boolean areSame = false;

        Customer currentCustumer = (Customer) this;

        Customer otherCustumer = (Customer) obj;


        int currentProductId = currentCustumer.getId();
        String currentCustumerFirstName= currentCustumer.getFirstName();
        String currentProductLastName = currentCustumer.getLastName();
        char currentProductGender = currentCustumer.getGender();

        int otherCustumerId = otherCustumer.getId();
        String otherCustumerFirstName = otherCustumer.getFirstName();
       String otherCustumerLastName = otherCustumer.getLastName();
        char otherCustumerGender = otherCustumer.getGender();

        // LOGIC FOR EQUALITY CHECK
        if (currentProductId == otherCustumerId
                && currentCustumerFirstName.equals(otherCustumerFirstName)
                && currentProductLastName.equals(otherCustumerLastName)
        && currentProductGender==otherCustumerGender) {
            areSame = true;
        }

        return areSame;
    }
}
