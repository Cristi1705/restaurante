package com.fblc.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fblc.matriculas.modelo.entidad.detalleplato;

@Repository
@Component
public interface IDetallePlatoRepositorio extends JpaRepository<Integer, detalleplato> {

}
