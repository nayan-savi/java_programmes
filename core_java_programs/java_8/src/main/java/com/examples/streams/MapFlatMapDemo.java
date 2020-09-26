package com.examples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private String name;
    private List<String> phoneNumbers;

    public Customer(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

public class MapFlatMapDemo {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nayan", Arrays.asList("7894563210","9638527412")));
        customers.add(new Customer("Kumar", Arrays.asList("8638323432")));
        customers.add(new Customer("Tatsavi", Arrays.asList("6894323210","8838527412", "88554452541")));

        // Use map Function<? super T, ? extends R> mapper
        List<String> useMap = customers.stream().map(Customer::getName).collect(Collectors.toList());
        System.out.println(useMap);

        // Use flatMap Function<? super T, ? extends Stream<? extends R>>
        List<String> useFlatMap = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(useFlatMap);



    }
}
