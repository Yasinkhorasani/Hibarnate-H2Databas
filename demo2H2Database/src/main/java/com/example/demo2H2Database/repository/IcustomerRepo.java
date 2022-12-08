package com.example.demo2H2Database.repository;

import com.example.demo2H2Database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcustomerRepo extends JpaRepository<Customer,Long> {
}
