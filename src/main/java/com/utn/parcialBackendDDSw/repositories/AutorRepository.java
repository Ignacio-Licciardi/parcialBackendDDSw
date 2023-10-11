package com.utn.parcialBackendDDSw.repositories;

import com.utn.parcialBackendDDSw.entities.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long>{

    //Query JPQL parametros indexados ? - 1// nombrados
    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro% ")
    List<Autor> searchAutor(@Param("filtro") String filtro);


}
