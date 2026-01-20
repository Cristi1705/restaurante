package com.cscl.restaurante.servicio;

import java.util.List;

import com.cscl.restaurante.modelo.entidad.Mesa;

public interface IMesaServicio {

	public Mesa insertarMesa(Mesa nuevaMesa);
	public 	Mesa editarMesa(int idMesa);
	public void eliminarMesa(int idMesa);
	public List<Mesa> listarMesa();
	
	
}
