package com.trixlog.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trixlog.api.models.Parada;
import com.trixlog.api.repository.ParadaRepository;
import com.trixlog.api.service.ParadaService;

@Service
public class ParadaServiceImpl implements ParadaService{
	
	@Autowired
	private ParadaRepository paradaRepository;

	@Override
	public List<Parada> listarParadas() {
		return this.paradaRepository.findAll();
	}
	
	@Override
	public Parada criarParada(Parada parada) {
		return this.paradaRepository.save(parada);
	}
}
