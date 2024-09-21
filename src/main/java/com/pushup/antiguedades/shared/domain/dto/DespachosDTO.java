package com.pushup.antiguedades.shared.domain.dto;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;

public class DespachosDTO {
    // Agregando los atributos necesarios
    private long idhistorialpropiedad;
    private LocalDateTime fechainicio;
    private LocalDateTime fechafin;
    private Antiguedades antiguedades;
    private Persona persona;


    // Creando los constructores de la clase
    public DespachosDTO() {

    }

    public DespachosDTO(
        long idhistorialpropiedad, LocalDateTime fechainicio, LocalDateTime fechafin,
        Antiguedades antiguedades, Persona persona
    ) {
        this.idhistorialpropiedad = idhistorialpropiedad;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.antiguedades = antiguedades;
        this.persona = persona;
    }


    // Definiendo los getter y setter de "idhistorialpropiedad"
    public long getIdhistorialpropiedad() {
        return idhistorialpropiedad;
    }
    public void setIdhistorialpropiedad(long idhistorialpropiedad) {
        this.idhistorialpropiedad = idhistorialpropiedad;
    }

    // Definiendo los getter y setter de "fechainicio"
    public LocalDateTime getFechainicio() {
        return fechainicio;
    }
    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }

    // Definiendo los getter y setter de "fechafin"
    public LocalDateTime getFechafin() {
        return fechafin;
    }
    public void setFechafin(LocalDateTime fechafin) {
        this.fechafin = fechafin;
    }

    // Definiendo los getter y setter de "antiguedades"
    public Antiguedades getAntiguedades() {
        return antiguedades;
    }
    public void setAntiguedades(Antiguedades antiguedades) {
        this.antiguedades = antiguedades;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
