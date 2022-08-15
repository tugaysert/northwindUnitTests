package com.etiya.northwind;

import com.etiya.northwind.business.responses.customers.CustomerListResponse;
import com.etiya.northwind.entities.concretes.Customer;
import com.etiya.northwind.entities.concretes.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSupport {

    public static List<Customer> generateCustomers(){

        return IntStream.rangeClosed(1,5)
                .mapToObj(i -> Customer
                        .builder()
                        .customerId(String.valueOf(i))
                        .build())
                .collect(Collectors.toList());

    }

    public static List<Employee> generateEmployees(){

        return IntStream.rangeClosed(1,5)
                .mapToObj(i -> Employee
                        .builder()
                        .employeeId(i)
                        .build())
                .collect(Collectors.toList());

    }

    public static Employee generateEmployee(){
        return Employee.builder().employeeId(1).firstName("TEST").lastName("TEST").build();
    }



  /*  public static List<CustomerListResponse> generateCustomerListResponseList(List<Customer> customerList){

        return customerList.stream()
                .map(customer -> CustomerListResponse
                        .builder()
                        .customerId(customer.getCustomerId())
                        .build())
                .collect(Collectors.toList());
    }*/
}
