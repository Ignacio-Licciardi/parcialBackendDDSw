package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> searchPersona(String filtro) throws Exception;

}