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

@Entity
@Data
public class Mesa implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_mesa;
	private int numero_mesa;
	private int cantidad_mesa;
	
	@OneToMany(mappedBy = "fkIdMesa", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Pedido> listarPedido = new ArrayList<>();

}
