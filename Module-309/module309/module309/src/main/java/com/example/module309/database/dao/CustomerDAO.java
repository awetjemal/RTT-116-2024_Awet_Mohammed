package com.example.module309.database.dao;

import com.example.module309.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer, Long>{
    @Query("select  c from Customer c where c.contactFirstname = :firstName")
    public List<Customer> findByFirstName(String firstName);

    Customer findById(Integer id);

    List<Customer> findByContactLastname(String lastName);
}
