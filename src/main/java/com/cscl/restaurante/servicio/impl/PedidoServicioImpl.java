package com.cscl.restaurante.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

import com.cscl.restaurante.modelo.entidad.Pedido;
import com.cscl.restaurante.repositorio.IPedidoRepositorio;
import com.cscl.restaurante.servicio.IPedidoServicio;

@Service
@Component
public class PedidoServicioImpl implements IPedidoServicio {

    @Autowired
    private IPedidoRepositorio repositorioPedido;

    @Override
    public Pedido insertarPedido(Pedido nuevoPedido) {
        return repositorioPedido.save(nuevoPedido);
    }

    @Override
    public Pedido editarPedido(int idPedido) {
        return repositorioPedido.findById(idPedido).orElse(null);
    }

    @Override
    public void eliminarPedido(int idPedido) {
        repositorioPedido.deleteById(idPedido);
    }

    @Override
    public List<Pedido> listarPedido() {
        return repositorioPedido.findAll();
    }
}
