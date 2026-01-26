package com.cscl.restaurante.modelo.entidad;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DetallePlato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_detalleplato;
	
	private String descripcion_detalleplato;
	private int cantidad_detalleplato;
	private String estado_detalleplato;
	
    @ManyToOne
    @JoinColumn(name = "fk_id_pedido")
    private Pedido fkIdPedido;
}
