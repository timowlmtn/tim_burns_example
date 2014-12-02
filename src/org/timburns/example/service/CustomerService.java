package org.timburns.example.service;

import org.timburns.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 11/30/2014.
 */
public class CustomerService {
    public List<Customer> getCustomers() {
        List<Customer> result = new ArrayList<Customer>();
        Customer cElem;
        String[] name = {"Name", "Mike", "Robert", "Sally", "Meredith"};
        String[] address = {"Address", "11 A Road", "659 Peter Lane", "100 Wisteria", "1100 Great Rd"};
        for ( int i = 0; i < name.length; i++ ) {
            cElem = new Customer();
            cElem.setName(name[i]);
            cElem.setAddress(address[i]);
            result.add(cElem);
        }

        return result;

    }
}
