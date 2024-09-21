package com.pushup.antiguedades.shared.domain.entity.localizacion;

import jakarta.persistence.Column;
// Importando las clases y paquetes necesarios
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tipodireccion")
public class TipoDireccion {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipodireccion", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idtipodireccion;

    @Column(name = "nombretipodireccion", columnDefinition = "VARCHAR(35)", nullable = false)
    @NotBlank(message = "'nombretipodireccion no puede estar vacío.")
    @Size(min = 4, max = 35, message = "El nombretipodireccion debe tener una longitud de 4 a 35 caracteres.")
    private String nombretipodireccion;


    // Creando los constructores de la clase
    public TipoDireccion() {

    }


    // Definiendo los getter y setter de "idtipodireccion"
    public long getIdtipodireccion() {
        return idtipodireccion;
    }
    public void setIdtipodireccion(long idtipodireccion) {
        this.idtipodireccion = idtipodireccion;
    }

    // Definiendo los getter y setter de "nombretipodireccion"
    public String getNombretipodireccion() {
        return nombretipodireccion;
    }
    public void setNombretipodireccion(String nombretipodireccion) {
        this.nombretipodireccion = nombretipodireccion;
    }
}