package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.entities.Prodotto;
import com.pb.repository.ProdottoRepository;

@Service
public class ProdottoService {

	
	@Autowired
	private ProdottoRepository prodottoRepository;
	
	public List<Prodotto> getAllProdotti(){
		return this.prodottoRepository.findAll();
	}
	
	public Prodotto getProdottoById(int id) {
		return this.prodottoRepository.findById(id).get();
	}
	
	public Prodotto addProdotto(Prodotto p) {
		return this.prodottoRepository.save(p);
	}
	
	public Prodotto updateProdotto(Prodotto p) {
		return this.prodottoRepository.save(p);
	}
	
	public void deleteProdotto(int id) {
		this.prodottoRepository.deleteById(id);
	}
}
