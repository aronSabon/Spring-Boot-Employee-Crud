package com.broadway.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broadway.springboot.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
