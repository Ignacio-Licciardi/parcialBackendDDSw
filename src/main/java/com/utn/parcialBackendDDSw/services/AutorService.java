package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Autor;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long>{

    List<Autor> searchAutor(String filtro) throws Exception;
}
