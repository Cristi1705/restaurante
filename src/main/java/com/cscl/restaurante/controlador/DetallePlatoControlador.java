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

import com.cscl.restaurante.modelo.entidad.DetallePlato;
import com.cscl.restaurante.servicio.IDetallePlatoServicio;

@RestController
@RequestMapping("/api/detalleplato")
public class DetallePlatoControlador {

	@Autowired
	private IDetallePlatoServicio servicioDetallePlato;
	
	@GetMapping
	public List <DetallePlato> listarDetallePlato(){
		return servicioDetallePlato.listarDetallePlato();
	}
	
	@PostMapping
	public DetallePlato crearDetallePlato(@RequestBody DetallePlato detalleplato) {
		return servicioDetallePlato.insertarDetallePlato(detalleplato);				
	}
	@GetMapping("/{id}")
	public DetallePlato editarDetallePlato(@PathVariable int id) {
		return servicioDetallePlato.editarDetallePlato(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarDetallePlato(@PathVariable int id) {
		servicioDetallePlato.eliminarDetallePlato(id);
	}
}
