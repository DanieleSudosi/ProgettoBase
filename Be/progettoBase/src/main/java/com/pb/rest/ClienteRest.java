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

import com.pb.entities.Cliente;
import com.pb.service.ClienteService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ClienteRest {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/clienti")
	public List<Cliente> getAllClienti() {
		return this.clienteService.getAllClienti();
	}

	@GetMapping("/clienti/{id}")
	public Cliente getClienteById(@PathVariable int id) {
		return this.clienteService.getClienteById(id);
	}

	@PostMapping("/clienti")
	public Cliente addCLienti(@RequestBody Cliente c) {
		return this.clienteService.addCliente(c);
	}

	@PutMapping("/clienti")
	public Cliente updateCliente(@RequestBody Cliente c) {
		return this.clienteService.updateCliente(c);
	}

	@DeleteMapping("/clienti/{id}")
	public void deleteCliente(@PathVariable int id) {
		this.clienteService.deleteCliente(id);
	}

}
