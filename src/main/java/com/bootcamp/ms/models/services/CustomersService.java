package com.bootcamp.ms.models.services;

import com.bootcamp.ms.models.documents.Customers;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomersService {
	
	public Flux<Customers> findAll();
		
	public Mono<Customers> findById(String id);
	
	public Mono<Customers> save(Customers Customers);
	
	public Mono<Void> delete(Customers Customers);
	


}

