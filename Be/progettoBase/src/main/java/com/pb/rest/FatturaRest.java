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

import com.pb.entities.Fattura;
import com.pb.service.FatturaService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FatturaRest {

	@Autowired
	private FatturaService fatturaService;

	@GetMapping("/fatture")
	public List<Fattura> getAllFatture() {
		return this.fatturaService.getAllFatture();
	}

	@GetMapping("/fatture/{id}")
	public Fattura getFattureById(@PathVariable int id) {
		return this.fatturaService.getFatturaById(id);
	}

	@PostMapping("/fatture")
	public Fattura addFattura(@RequestBody Fattura f) {
		return this.fatturaService.addFattura(f);
	}

	@PutMapping("/fatture")
	public Fattura updateFattura(@RequestBody Fattura f) {
		return this.fatturaService.updateFattura(f);
	}

	@DeleteMapping("/fatture/{id}")
	public void deleteFattura(@PathVariable int id) {
		this.fatturaService.deleteFattura(id);
	}

}
