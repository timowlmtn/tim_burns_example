package org.timburns.example.service;

import org.timburns.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 11/30/2014.
 */
public class CustomerService {
    static List<Customer> result = new ArrayList<Customer>();

    static {
        Customer cElem;
        String[] name = {"Name", "Mike", "Robert", "Sally", "Meredith"};
        String[] address = {"Address", "11 A Road", "659 Peter Lane", "100 Wisteria", "1100 Great Rd"};
        for ( int i = 0; i < name.length; i++ ) {
            cElem = new Customer();
            cElem.setName(name[i]);
            cElem.setAddress(address[i]);
            result.add(cElem);
        }
    }

    public List<Customer> getCustomers() {
        return result;
    }

    public void add(Customer customer) {
        result.add(customer);
    }
}
