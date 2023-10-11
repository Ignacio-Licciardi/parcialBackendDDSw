package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Persona;
import com.utn.parcialBackendDDSw.repositories.BaseRepository;
import com.utn.parcialBackendDDSw.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }


}
