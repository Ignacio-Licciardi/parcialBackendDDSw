package com.utn.parcialBackendDDSw.repositories;

import com.utn.parcialBackendDDSw.entities.Localidad;
import com.utn.parcialBackendDDSw.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long>{

    //Query JPQL parametros indexados ? - 1// nombrados
    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro%  ")
    List<Localidad> searchLocalidad(@Param("filtro")String filtro);
}
