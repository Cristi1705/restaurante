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

import com.cscl.restaurante.modelo.entidad.Pedido;
import com.cscl.restaurante.servicio.IPedidoServicio;

@RestController
@RequestMapping("/api/pedido")
public class PedidoControlador {

	@Autowired
	private IPedidoServicio servicioPedido;
	
	@GetMapping
	public List <Pedido> listarPedido(){
		return servicioPedido.listarPedido();
	}
	
	@PostMapping
	public Pedido crearPedido(@RequestBody Pedido pedido) {
		return servicioPedido.insertarPedido(pedido);				
	}
	@GetMapping("/{id}")
	public Pedido editarPedido(@PathVariable int id) {
		return servicioPedido.editarPedido(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPedido(@PathVariable int id) {
		servicioPedido.eliminarPedido(id);
	}
}
