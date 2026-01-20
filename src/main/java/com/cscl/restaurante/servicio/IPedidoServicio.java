package com.cscl.restaurante.servicio;

import java.util.List;

import com.cscl.restaurante.modelo.entidad.Pedido;

public interface IPedidoServicio {

	public Pedido insertarPedido(Pedido Pedido);
	public Pedido editarPedido(int idPedido);
	public void eliminarPedido(int idPedido);
	public List<Pedido> listarPedido();
}
