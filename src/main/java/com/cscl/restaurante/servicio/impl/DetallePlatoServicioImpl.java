package com.cscl.restaurante.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cscl.restaurante.modelo.entidad.DetallePlato;
import com.cscl.restaurante.repositorio.IDetallePlatoRepositorio;
import com.cscl.restaurante.servicio.IDetallePlatoServivio;

@Service
@Component
public class DetallePlatoServicioImpl implements IDetallePlatoServivio{

	@Autowired
	public IDetallePlatoRepositorio repositorioDetallePlato;

	@Override
	public DetallePlato insertarDetallePlato(DetallePlato nuevoDetallePlato) {
		// TODO Auto-generated method stub
		return repositorioDetallePlato.save(nuevoDetallePlato);
	}

	@Override
	public DetallePlato editarDetallePlato(int idDetallePlato) {
		// TODO Auto-generated method stub
		return repositorioDetallePlato.findById(idDetallePlato).get();
	}

	@Override
	public void eliminarDetallePlato(int idDetallePlato) {
		// TODO Auto-generated method stub
		repositorioDetallePlato.delete(editarDetallePlato(idDetallePlato));
	}

	@Override
	public List<DetallePlato> listarDetallePlato() {
		// TODO Auto-generated method stub
		return repositorioDetallePlato.findAll();
	}
	

}
