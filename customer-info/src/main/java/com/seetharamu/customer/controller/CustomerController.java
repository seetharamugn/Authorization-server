package com.seetharamu.customer.controller;


import com.seetharamu.customer.model.Customer;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/services")
public class CustomerController {


    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer) {
        return customer;
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)

    public Customer fetch(@RequestParam int profileId) {
     return new Customer("Customer 1", "Address 1", "Phone 1","");
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String fetch1() {
        return "hello";
    }
}
