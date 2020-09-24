package com.trixlog.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trixlog.api.models.Rota;
import com.trixlog.api.repository.RotasRepository;
import com.trixlog.api.service.RotaService;

@Service
public class RotaServiceImpl implements RotaService{
	
	@Autowired
	private RotasRepository rotaRepository;

	@Override
	public List<Rota> listarRotas() {
		return this.rotaRepository.findAll();
	}
	
	@Override
	public Rota criarRota(Rota rota) {
		return this.rotaRepository.save(rota);
	}

}
