package com.utn.parcialBackendDDSw.services;

import com.utn.parcialBackendDDSw.entities.Autor;
import com.utn.parcialBackendDDSw.repositories.AutorRepository;
import com.utn.parcialBackendDDSw.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }



}