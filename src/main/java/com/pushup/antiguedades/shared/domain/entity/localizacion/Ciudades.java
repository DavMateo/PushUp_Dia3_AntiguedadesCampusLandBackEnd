package com.pushup.antiguedades.shared.domain.entity.localizacion;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ciudades")
public class Ciudades {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idciudades", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idciudades;

    @Column(name = "nombreciudad", columnDefinition = "VARCHAR(75)", nullable = false)
    @NotBlank(message = "'nombreciudad no puede estar vacío.")
    @Size(min = 2, max = 75, message = "El nombreciudad debe tener una longitud de 2 a 75 caracteres.")
    private String nombreciudad;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idregiones", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_regiones' no puede ser nulo, ingrese información.")
    private Regiones regiones;


    // Creando los constructores de la clase
    public Ciudades() {

    }


    // Definiendo los getter y setter de "idciudades"
    public long getIdciudades() {
        return idciudades;
    }
    public void setIdciudades(long idciudades) {
        this.idciudades = idciudades;
    }

    // Definiendo los getter y setter de "nombreciudad"
    public String getNombreciudad() {
        return nombreciudad;
    }
    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    // Definiendo los getter y setter de "regiones"
    public Regiones getRegiones() {
        return regiones;
    }
    public void setRegiones(Regiones regiones) {
        this.regiones = regiones;
    }
}