package com.pb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Articolo {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "quantita")
	private int quantita;
	
	@Column(name = "prezzo_totale")
	private double prezzoTotale;
	
	@Column(name ="totale")
	private double totale;
	
	@ManyToOne
	@JoinColumn(name="fattura_id", nullable=false)
	private Fattura fattura;
	
	@ManyToOne
	@JoinColumn(name="prodotto_id", nullable=false)
	private Prodotto prodotto;
	
}
