package com.cscl.restaurante.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cscl.restaurante.modelo.entidad.Pedido;

@Repository
@Component
public interface IPedidoRepositorio extends JpaRepository<Pedido, Integer> {

}
