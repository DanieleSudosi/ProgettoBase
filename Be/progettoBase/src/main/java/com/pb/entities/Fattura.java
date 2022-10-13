package com.pb.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Fattura {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column (name = "data_ordine")
	private String dataOrdine;
	
	@Column (name = "sub_totale")
	private double subTotale;
	
	@Column (name = "regione")
	private String regione;
	
	@Column (name = "venditore")
	private String venditore;
	
	 @ManyToOne
	 @JoinColumn(name="cliente_id", nullable=false)
	 private Cliente cliente;
	 
	 @OneToMany(mappedBy="fattura")
	  private Set<Articolo> articoli;
}
