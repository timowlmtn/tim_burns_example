package org.timburns.example.service;

import junit.framework.TestCase;

/**
 * Created by Tim on 11/26/2014.
 */
public class CustomerServiceTest extends TestCase {

    CustomerService service = new CustomerService();

    public void testListCustomer() {
        System.out.print( service.getCustomers() );

    }

}
