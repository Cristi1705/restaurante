package com.cscl.restaurante.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cscl.restaurante.modelo.entidad.Cliente;
import com.cscl.restaurante.repositorio.IClienteRepositorio;
import com.cscl.restaurante.servicio.IClienteServicio;

@Service
@Component
public class ClienteServicioImpl implements IClienteServicio{
		
	@Autowired
	public IClienteRepositorio repositorioMiembro;

	@Override
    public Cliente insertarCliente(Cliente nuevoCliente) {
        return repositorioMiembro.save(nuevoCliente);
    }

    @Override
    public Cliente editarCliente(int idCliente) {
        return repositorioMiembro.findById(idCliente).orElse(null);
    }

    @Override
    public void eliminarCliente(int idCliente) {
        repositorioMiembro.deleteById(idCliente);
    }

    @Override
    public List<Cliente> listarCliente() {
        return repositorioMiembro.findAll();
    }
}
