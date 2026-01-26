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
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	
	private String nombre_cliente;
	private String email_cliente;
	private String telefono_cliente;
		
	@OneToMany(mappedBy = "fkIdCliente", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Pedido> listarPedido = new ArrayList<>();
}
