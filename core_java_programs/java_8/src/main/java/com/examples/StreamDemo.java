package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nayan", "kumar", 27, "permanent", "kannada");
        Customer customer2 = new Customer("Jhon", "Hon", 27, "contract", "english");
        Customer customer3 = new Customer("Andres", "Yon", 37, "permanent", "english");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        List<Customer> permanentCustomers = customers.stream()
                .filter(customer -> customer.getCustomerType().equals("permanent"))
                .collect(Collectors.toList());


        permanentCustomers.forEach(cust -> System.out.println(cust));
    }
}
