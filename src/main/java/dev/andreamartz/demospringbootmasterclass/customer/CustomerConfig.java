package dev.andreamartz.demospringbootmasterclass.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean  // annotate this method with @Bean "so that this runs"
        // @Bean will make sure that this gets instantiated for us
    CommandLineRunner commandLineRunner(CustomerRepository repository) { // inject the repository
        return args -> {
            Customer mariam = new Customer(
                    1L,
                    "Mariam Jamal"
            );
            Customer james = new Customer(
                    2L,
                    "James Bond"
            );
//            repository.saveAll(List.of(mariam, james));
        };
    }
}
