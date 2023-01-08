package com.seetharamu.customer.controller;

import com.seetharamu.customer.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/services")
public class CustomerController {


    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customer;
    }

    @RequestMapping(value = "/getsample", method = RequestMethod.GET)
    public Customer fetch() {
        Customer customer = new Customer();
        customer.setFirstName("seetha");
        customer.setLastName("rama");
        customer.setDlNumber("87456743");
        customer.setZipcode("476367");
        return customer;
    }

}
