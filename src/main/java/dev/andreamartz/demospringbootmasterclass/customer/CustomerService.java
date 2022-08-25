package dev.andreamartz.demospringbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // makes this class into a bean (that is, the class gets instantiated) that we can inject elsewhere
    // this is a singleton; so if we inject it in multiple places, we are getting the SAME instance each time!
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }



//    private final CustomerRepository customerRepository;
//
//    @Autowired
//    CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//    List<Customer> getCustomers() {
//        Customer jamesBond = new Customer(1L, "James Bond");
//        return List.of(jamesBond);
//    }
}
