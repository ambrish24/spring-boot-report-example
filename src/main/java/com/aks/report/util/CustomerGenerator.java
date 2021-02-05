package com.aks.report.util;

import com.aks.report.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerGenerator {

    public static List<Customer> getCustomers(){

        List<Customer> customerList = new ArrayList<>(0);

        for(int i=1; i<101; i++){
            Customer customer = new Customer("ID-"+i, "FirstName"+i, "LastName"+i);
            customerList.add(customer);
        }

        return customerList;

    }
}
