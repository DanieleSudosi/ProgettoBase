package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.entities.Fattura;
import com.pb.repository.FatturaRepository;

@Service
public class FatturaService {

	
	@Autowired
	private FatturaRepository fatturaRepository;
	
	public List<Fattura> getAllFatture(){
		return this.fatturaRepository.findAll();
	}
	
	public Fattura getFatturaById(int id) {
		return this.fatturaRepository.findById(id).get();
	}
	
	public Fattura addFattura(Fattura f) {
		return this.fatturaRepository.save(f);
	}
	
	public Fattura updateFattura(Fattura f) {
		return this.fatturaRepository.save(f);
	}
	
	public void deleteFattura(int id) {
		this.fatturaRepository.deleteById(id);
	}
}
