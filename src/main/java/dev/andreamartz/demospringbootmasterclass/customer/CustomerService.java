package dev.andreamartz.demospringbootmasterclass.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service  // makes this class into a bean that we can inject elsewhere
    // this is a singleton; so if we inject it in multiple places, we are getting the SAME instance each time!
public class CustomerService {
    List<Customer> getCustomers() {
        Customer jamesBond = new Customer(1L, "James Bond");
        return List.of(jamesBond);
    }
}
