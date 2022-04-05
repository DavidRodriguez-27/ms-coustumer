package com.bootcamp.ms.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.ms.models.documents.Customers;

public interface CustomersDao extends ReactiveMongoRepository<Customers, String>{

}
