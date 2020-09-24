package com.trixlog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trixlog.api.models.Parada;
import com.trixlog.api.service.ParadaService;

@RestController
@RequestMapping("/paradas")
public class ParadaController {

	@Autowired
	private ParadaService paradaService;
	
	@GetMapping
	public List<Parada> listarParadas() {
		return this.paradaService.listarParadas();
	}
	
	@PostMapping("/{id}")
	public Parada criarParada(@PathVariable String id, @RequestBody Parada parada) {
		return this.paradaService.criarParada(parada);
	}
	
}
