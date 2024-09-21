package com.pushup.antiguedades.antiguedad.application.service;

import java.util.List;
import java.util.Optional;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;

public interface IAntiguedadService {
    List<Antiguedades> findAll();
    Optional<Antiguedades> findById(Long id);
    Antiguedades save(Antiguedades antiguedades);
    Antiguedades update(Antiguedades antiguedades);
    void deleteById(Long id);
}