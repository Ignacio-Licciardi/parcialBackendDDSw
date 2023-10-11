package com.utn.parcialBackendDDSw.repositories;

import com.utn.parcialBackendDDSw.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Query JPQL parametros indexados ? - 1// nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro% ")
    List<Persona> searchPersona(@Param("filtro")String filtro);

}
