/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.timburns.example.ui;

import org.timburns.example.model.Customer;
import org.timburns.example.service.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * A rest service based on the example by bsutter@redhat.com
 *
 * Tailored for Example Code Portfolio by Tim Burns
 */

@Path("/")
public class CustomerHandler {
    @Inject
    CustomerService customerService;

    @POST
    @GET
    @Path("/customers")
    @Produces("application/json")
    public String getCustomerJSON() {
        return "" + customerService.getCustomers().toString() + "";
    }

    @POST
    @GET
    @Path("/test")
    @Produces("application/json")
    public String getCustomerTest() {
        return "[{\"Name\":\"Value\" }]";
    }

    @POST
    @Path("/addCustomer")
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String addCustomer(@FormParam("name") String name, @FormParam("address") String address ) {
        System.out.println("name: " + name);
        System.out.println("address: " + address);

        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);

        customerService.add(customer);
        return "[{\"Name\":\""+name+"\" }]";
    }

}
