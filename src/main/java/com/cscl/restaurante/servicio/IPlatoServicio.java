package com.cscl.restaurante.servicio;

import java.util.List;

import com.cscl.restaurante.modelo.entidad.Plato;

public interface IPlatoServicio {

	public Plato insertarPlato(Plato nuevoPlato);
	public Plato editarPlato(int idPlato);
	public void eliminarPlato(int idPlato);
	public List<Plato> listarPlato();
	
}
