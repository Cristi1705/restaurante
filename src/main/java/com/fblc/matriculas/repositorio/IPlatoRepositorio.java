package com.fblc.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fblc.matriculas.modelo.entidad.plato;

@Repository
@Component
public interface IPlatoRepositorio extends JpaRepository<Integer, plato>{

}
