package com.bootcamp.ms.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.ms.models.dao.CustomersDao;
import com.bootcamp.ms.models.documents.Customers;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomersServiceImpl implements CustomersService{

	@Autowired
	private CustomersDao dao;
	
	@Override
	public Flux<Customers> findAll() {
		return dao.findAll();
	}

	@Override
	public Mono<Customers> findById(String id) {
		return dao.findById(id);
	}

	@Override
	public Mono<Customers> save(Customers Customers) {
		return dao.save(Customers);
	}

	@Override
	public Mono<Void> delete(Customers Customers) {
		return dao.delete(Customers);
	}

	

	
}
