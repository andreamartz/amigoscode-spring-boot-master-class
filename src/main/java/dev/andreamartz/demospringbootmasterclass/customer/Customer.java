package dev.andreamartz.demospringbootmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Entity
public class Customer {
    private final Long id;
    private final String name;
    private final String password;

    Customer(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // the getters here are necessary to return data to the client from the controller!
    @JsonProperty("customerId")
    public Long getId() {
        return id;
    }

    // Spring is "smart". For the getter below,...
    // ...Spring will return a JSON property called customerId
//    public Long getCustomerId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    // a field will be sent to the client unless we mark it with @JsonIgnore
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
