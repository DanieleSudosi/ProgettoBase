package com.pb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.entities.Cliente;
import com.pb.repository.ClienteRepository;

@Service
public class ClienteService {

	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> getAllClienti(){
		return this.clienteRepository.findAll();
	}
	
	public Cliente getClienteById(int id) {
		return this.clienteRepository.findById(id).get();
	}
	
	public Cliente addCliente(Cliente c) {
		return this.clienteRepository.save(c);
	}
	
	public Cliente updateCliente(Cliente c) {
		return this.clienteRepository.save(c);
	}
	
	public void deleteCliente(int id) {
		this.clienteRepository.deleteById(id);
	}
}
