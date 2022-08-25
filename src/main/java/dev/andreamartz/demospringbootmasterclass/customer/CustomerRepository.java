package dev.andreamartz.demospringbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Repository
//public interface CustomerRepository extends JpaRepository<Customer, Long>{
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real db")
        );
    }
}
