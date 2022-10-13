package com.pb.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clienti")
public class Cliente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name = "nome", length = 30)
	private String nome;
	
	@Column(name = "cognome", length = 30)
	private String cognome;
	
	@Column(name = "indirizzo", length = 50)
	private String indirizzo;
	
	@Column(name = "paese", length = 30)
	private String paese;
	
	@Column(name = "telefono", length = 20)
	private String telefono;
	
	@OneToMany(mappedBy="cliente")
    private Set<Fattura> fatture;

}
