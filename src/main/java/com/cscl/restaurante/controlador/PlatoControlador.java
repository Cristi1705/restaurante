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

import com.cscl.restaurante.modelo.entidad.Plato;
import com.cscl.restaurante.servicio.IPlatoServicio;

@RestController
@RequestMapping("/api/plato")
public class PlatoControlador {

	@Autowired
	private IPlatoServicio servicioPlato;
	
	@GetMapping
	public List <Plato> listarPlato(){
		return servicioPlato.listarPlato();
	}
	
	@PostMapping
	public Plato crearPlato(@RequestBody Plato plato) {
		return servicioPlato.insertarPlato(plato);				
	}
	@GetMapping("/{id}")
	public Plato editarPlato(@PathVariable int id) {
		return servicioPlato.editarPlato(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPlato(@PathVariable int id) {
		servicioPlato.eliminarPlato(id);
	}
}
