package com.pushup.antiguedades.shared.domain.entity.persona;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
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
@Table(name = "coleccionistas")
public class Coleccionistas {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcoleccionistas", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idcoleccionistas;

    @Column(name = "especialidad", columnDefinition = "VARCHAR(60)", nullable = false)
    @NotBlank(message = "'especialidad no puede estar vacío.")
    @Size(min = 4, max = 60, message = "El especialidad debe tener una longitud de 4 a 60 caracteres.")
    private String especialidad;

    @Column(name = "fechainicio", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechainicio' no puede ser nulo, ingrese información.")
    private LocalDateTime fechainicio;

    @Column(name = "fechafinal", columnDefinition = "DATETIME", nullable = true)
    @NotNull(message = "'fechafinal' no puede ser nulo, ingrese información.")
    private LocalDateTime fechafinal;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;


    // Creando los constructores de la clase
    public Coleccionistas() {

    }


    // Definiendo los getter y setter de "idcoleccionistas"
    public long getIdcoleccionistas() {
        return idcoleccionistas;
    }
    public void setIdcoleccionistas(long idcoleccionistas) {
        this.idcoleccionistas = idcoleccionistas;
    }

    // Definiendo los getter y setter de "especialidad"
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Definiendo los getter y setter de "fechainicio"
    public LocalDateTime getFechainicio() {
        return fechainicio;
    }
    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }

    // Definiendo los getter y setter de "fechafinal"
    public LocalDateTime getFechafinal() {
        return fechafinal;
    }
    public void setFechafinal(LocalDateTime fechafinal) {
        this.fechafinal = fechafinal;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}