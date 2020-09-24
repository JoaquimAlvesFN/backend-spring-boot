package com.trixlog.api.service;

import java.util.List;

import com.trixlog.api.models.Parada;

public interface ParadaService {
	public List<Parada> listarParadas();
	public Parada criarParada(Parada parada);
}
