package com.pushup.antiguedades.antiguedad.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;

@Repository
public interface AntiguedadRepository extends JpaRepository<Antiguedades, Long> {
    boolean existsBynombreantiguedad(String nombreantiguedad);  
}