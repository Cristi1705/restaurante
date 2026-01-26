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

import com.cscl.restaurante.modelo.entidad.Mesa;
import com.cscl.restaurante.servicio.IMesaServicio;

@RestController
@RequestMapping("/api/mesa")
public class MesaControlador {

	@Autowired
	private IMesaServicio servicioMesa;
	
	@GetMapping
	public List <Mesa> listarMesa(){
		return servicioMesa.listarMesa();
	}
	
	@PostMapping
	public Mesa crearMesa(@RequestBody Mesa mesa) {
		return servicioMesa.insertarMesa(mesa);				
	}
	@GetMapping("/{id}")
	public Mesa editarMesa(@PathVariable int id) {
		return servicioMesa.editarMesa(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarMesa(@PathVariable int id) {
		servicioMesa.eliminarMesa(id);
	}
}
