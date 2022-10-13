package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.entities.Articolo;
import com.pb.repository.ArticoloRepository;


@Service
public class ArticoloService {

	
	@Autowired
	private ArticoloRepository articoloRepository;
	
	public List<Articolo> getAllArticoli(){
		return this.articoloRepository.findAll();
	}
	
	public Articolo getArticoloById(int id) {
		return this.articoloRepository.findById(id).get();
	}
	
	public Articolo addArticolo(Articolo a) {
		return this.articoloRepository.save(a);
	}
	
	public Articolo updateArticolo(Articolo a) {
		return this.articoloRepository.save(a);
	}
	
	public void deleteArticolo(int id) {
		this.articoloRepository.deleteById(id);
	}
}
