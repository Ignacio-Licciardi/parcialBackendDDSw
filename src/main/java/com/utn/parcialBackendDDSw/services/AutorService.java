package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Autor;
import com.utn.parcialBackendDDSw.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long>{

    List<Autor> searchAutor(String filtro) throws Exception;

    //PAGINACION

    Page<Autor> searchAutorPaged(String filtro, Pageable pageable) throws Exception;
}
