package com.cscl.restaurante.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cscl.restaurante.modelo.entidad.Cliente;
import com.cscl.restaurante.servicio.IClienteServicio;


@RestController
@RequestMapping("/api/cliente")
public class ClienteControlador {

	@Autowired
	private IClienteServicio servicioCliente;
	
	@GetMapping
	public List <Cliente> listarCliente(){
		return servicioCliente.listarCliente();
	}
	
	@PostMapping
	public Cliente crearCliente(@RequestBody Cliente cliente) {
		return servicioCliente.insertarCliente(cliente);				
	}
	@GetMapping("/{id}")
	public Cliente editarCliente(@PathVariable int id) {
		return servicioCliente.editarCliente(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable int id) {
		servicioCliente.eliminarCliente(id);
	}
}
