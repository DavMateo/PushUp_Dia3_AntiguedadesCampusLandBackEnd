package com.pushup.antiguedades.shared.domain.dto.persona;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;

public class ColeccionistasDTO {
    // Agregando los atributos necesarios
    private long idcoleccionistas;
    private String especialidad;
    private LocalDateTime fechainicio;
    private LocalDateTime fechafinal;
    private Persona persona;

    
    // Creando los constructores de la clase
    public ColeccionistasDTO() {
        
    }
    
    public ColeccionistasDTO(
        long idcoleccionistas, String especialidad, LocalDateTime fechainicio,
        LocalDateTime fechafinal, Persona persona
    ) {
        this.idcoleccionistas = idcoleccionistas;
        this.especialidad = especialidad;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.persona = persona;
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
