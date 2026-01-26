package com.cscl.restaurante.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

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

    @ToString.Exclude
    @OneToMany(mappedBy = "fkIdPedido", cascade = CascadeType.REFRESH)
    @JsonBackReference
    private List<DetallePlato> listarDetallePlato = new ArrayList<>();
}
