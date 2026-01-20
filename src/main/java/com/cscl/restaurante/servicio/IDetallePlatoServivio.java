package com.cscl.restaurante.servicio;

import java.util.List;

import com.cscl.restaurante.modelo.entidad.DetallePlato;

public interface IDetallePlatoServivio {

public DetallePlato insertarDetallePlato (DetallePlato nuevoDetallePlato);
public DetallePlato editarDetallePlato (int idDetallePlato);
public void eliminarDetallePlato(int idDetallePlato);
public List<DetallePlato> listarDetallePlato();
}
