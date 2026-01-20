package com.cscl.restaurante.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cscl.restaurante.modelo.entidad.Mesa;
import com.cscl.restaurante.repositorio.IMesaRepositorio;
import com.cscl.restaurante.servicio.IMesaServicio;

@Service
@Component
public class MesaServicioImpl implements IMesaServicio {

	@Autowired
	public IMesaRepositorio repositorioMesa;
		
	
	@Override
    public Mesa insertarMesa(Mesa nuevaMesa) {
		// TODO Auto-generated method stub
        return repositorioMesa.save(nuevaMesa);
    }

    @Override
    public Mesa editarMesa(int idMesa) {
    	// TODO Auto-generated method stub
        return repositorioMesa.findById(idMesa).orElse(null);
    }

    @Override
    public void eliminarMesa(int idMesa) {
    	// TODO Auto-generated method stub
        repositorioMesa.deleteById(idMesa);
    }

    @Override
    public List<Mesa> listarMesa() {
    	// TODO Auto-generated method stub
        return repositorioMesa.findAll();
    }
}
