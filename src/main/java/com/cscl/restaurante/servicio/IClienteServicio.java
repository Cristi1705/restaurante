package com.cscl.restaurante.servicio;

import java.util.List;

import com.cscl.restaurante.modelo.entidad.Cliente;

public interface IClienteServicio {

	public Cliente insertarCliente(Cliente nuevoCliente);
	public Cliente editarCliente(int idCliente);
	public void eliminarCliente(int idCliente);
	public List<Cliente> listarCliente();
}
