package com.pb.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prodotto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "prezzo_unitario")
	private double prezzoUnitario;
	
	@Column(name = "magazzino")
	private String magazzino;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "sconto")
	private boolean sconto;
	
	@Column(name ="totale_magazzino")
	private int totaleMagazzino;
	
	@OneToMany(mappedBy="prodotto")
	private Set<Articolo> articoli;
	
}
