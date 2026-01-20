package com.cscl.restaurante.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cscl.restaurante.modelo.entidad.Plato;
import com.cscl.restaurante.repositorio.IPlatoRepositorio;
import com.cscl.restaurante.servicio.IPlatoServicio;

@Service
@Component
public class PlatoServicioImpl implements IPlatoServicio{

	@Autowired
	public IPlatoRepositorio repositorioPlato;

	@Override
	public Plato insertarPlato(Plato nuevoPlato) {
		// TODO Auto-generated method stub
		return repositorioPlato.save(nuevoPlato);
	}

	@Override
	public Plato editarPlato(int idPlato) {
		// TODO Auto-generated method stub
		return repositorioPlato.findById(idPlato).get();
	}

	@Override
	public void eliminarPlato(int idPlato) {
		// TODO Auto-generated method stub
		repositorioPlato.delete(editarPlato(idPlato));
	}

	@Override
	public List<Plato> listarPlato() {
		// TODO Auto-generated method stub
		return repositorioPlato.findAll();
	}
	
}
