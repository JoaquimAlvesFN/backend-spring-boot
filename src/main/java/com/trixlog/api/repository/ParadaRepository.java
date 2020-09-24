package com.trixlog.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trixlog.api.models.Parada;

public interface ParadaRepository extends MongoRepository<Parada, String> {

}
