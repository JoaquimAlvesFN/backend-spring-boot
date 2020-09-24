package com.trixlog.api.service;

import java.util.List;

import com.trixlog.api.models.Rota;

public interface RotaService {
	public List<Rota> listarRotas();
	public Rota criarRota(Rota rota);
	
}
