package com.cscl.restaurante.modelo.entidad;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pedido implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pedido;
	private Data fecha_pedido;
	private String descripcion_pedido;
	private String estado_pedido;
	private int totla_pedido;
	
}
