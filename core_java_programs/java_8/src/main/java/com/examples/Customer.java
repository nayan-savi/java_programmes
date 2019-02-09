package com.examples;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String customerType;
    private String language;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int age, String customerType, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.customerType = customerType;
        this.language = language;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", customerType='" + customerType + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
