package com.trixlog.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trixlog.api.models.Rota;

public interface RotasRepository extends MongoRepository<Rota, String> {
	
}
