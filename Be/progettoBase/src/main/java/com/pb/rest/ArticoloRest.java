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

import com.pb.entities.Articolo;
import com.pb.service.ArticoloService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticoloRest {

	@Autowired
	private ArticoloService articoloService;

	@GetMapping("/articoli")
	public List<Articolo> getAllArticoli() {
		return this.articoloService.getAllArticoli();
	}

	@GetMapping("/articoli/{id}")
	public Articolo getArticoloById(@PathVariable int id) {
		return this.articoloService.getArticoloById(id);
	}

	@PostMapping("/articoli")
	public Articolo addArticolo(@RequestBody Articolo a) {
		return this.articoloService.addArticolo(a);
	}

	@PutMapping("/articoli")
	public Articolo updateArticolo(@RequestBody Articolo a) {
		return this.articoloService.updateArticolo(a);
	}

	@DeleteMapping("/articoli/{id}")
	public void deleteArticolo(@PathVariable int id) {
		this.articoloService.deleteArticolo(id);
	}

}
