package com.trixlog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trixlog.api.models.Rota;
import com.trixlog.api.service.RotaService;

@RestController
@RequestMapping("/rotas")
public class RotasController {
	
	@Autowired
	private RotaService rotasService;
	
	@GetMapping
	public List<Rota> listarRotas() {
		return this.rotasService.listarRotas();
	}
	

	@PostMapping
	public Rota criarRota(@RequestBody Rota rota) {
		return this.rotasService.criarRota(rota);
	}
}
