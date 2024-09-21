package com.pushup.antiguedades.antiguedad.domain.implement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushup.antiguedades.antiguedad.application.service.IAntiguedadService;
import com.pushup.antiguedades.antiguedad.infrastructure.repository.AntiguedadRepository;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AntiguedadServiceImpl implements IAntiguedadService {

    @Autowired
    private AntiguedadRepository antiguedadRepository;

    @Override
    public List<Antiguedades> findAll() {
        return antiguedadRepository.findAll();
    }

    @Override
    public Optional<Antiguedades> findById(Long id) {
        return antiguedadRepository.findById(id);
    }

    @Override
    public Antiguedades save(Antiguedades antiguedades) {
        if (antiguedadRepository.existsBynombreantiguedad(antiguedades.getNombreantiguedad())) {
            throw new RuntimeException("Ya existe esta antigüedad");
        }
        antiguedades.setFecharegistro(LocalDateTime.now());
        antiguedades.setActualizadoen(LocalDateTime.now());
        return antiguedadRepository.save(antiguedades);
    }

    @Override
    public Antiguedades update(Antiguedades antiguedades) {
         if (antiguedadRepository.existsById(antiguedades.getIdantiguedades())) {
            antiguedades.setActualizadoen((LocalDateTime.now()));
            return antiguedadRepository.save(antiguedades);
        } else {
            throw new EntityNotFoundException("Antigüedad no encontrado por id:" + antiguedades.getIdantiguedades());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (antiguedadRepository.existsById(id)) {
            antiguedadRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Antigüedad no encontrado por id:" + id);
        }
    }
   
}
