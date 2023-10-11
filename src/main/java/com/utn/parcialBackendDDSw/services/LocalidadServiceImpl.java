package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Localidad;
import com.utn.parcialBackendDDSw.repositories.BaseRepository;
import com.utn.parcialBackendDDSw.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }


    @Override
    public List<Localidad> searchLocalidad(String filtro) throws Exception {
        try {
            List<Localidad> localidades = localidadRepository.searchLocalidad(filtro);
            return localidades;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
