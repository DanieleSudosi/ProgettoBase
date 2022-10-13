package com.pb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pb.entities.Prodotto;
import com.pb.service.ProdottoService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProdottoRest {

	@Autowired
	private ProdottoService prodottoService;

	@GetMapping("/prodotti")
	public List<Prodotto> getAllProdotti() {
		return this.prodottoService.getAllProdotti();
	}

	@GetMapping("/prodotti/{id}")
	public Prodotto getProdottoById(@PathVariable int id) {
		return this.prodottoService.getProdottoById(id);
	}

	@PostMapping("/prodotti")
	public Prodotto addProdotto(@RequestBody Prodotto p) {
		return this.prodottoService.addProdotto(p);
	}

	@PutMapping("/prodotti")
	public Prodotto updateProdotto(@RequestBody Prodotto p) {
		return this.prodottoService.updateProdotto(p);
	}

	@DeleteMapping("/prodotti/{id}")
	public void deleteProdotto(@PathVariable int id) {
		this.prodottoService.deleteProdotto(id);
	}

}
