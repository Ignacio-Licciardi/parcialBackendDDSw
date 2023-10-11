package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long>{
    List<Localidad> searchLocalidad(String filtro) throws Exception;
}

