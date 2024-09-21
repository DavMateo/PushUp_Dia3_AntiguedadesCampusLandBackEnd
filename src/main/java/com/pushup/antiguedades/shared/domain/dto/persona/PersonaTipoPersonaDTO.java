package com.pushup.antiguedades.shared.domain.dto.persona;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;
import com.pushup.antiguedades.shared.domain.entity.persona.TipoPersona;

public class PersonaTipoPersonaDTO {
    // Agregando los atributos necesarios
    private long idpersonatipopersona;
    private LocalDateTime fechaestado;
    private Persona persona;
    private TipoPersona tipopersona;
    

    // Creando los constructores de la clase
    public PersonaTipoPersonaDTO() {

    }
    
    public PersonaTipoPersonaDTO(
        long idpersonatipopersona, LocalDateTime fechaestado, 
        Persona persona, TipoPersona tipopersona
    ) {
        this.idpersonatipopersona = idpersonatipopersona;
        this.fechaestado = fechaestado;
        this.persona = persona;
        this.tipopersona = tipopersona;
    }


    // Definiendo los getter y setter de "idpersonatipopersona"
    public long getIdpersonatipopersona() {
        return idpersonatipopersona;
    }
    public void setIdpersonatipopersona(long idpersonatipopersona) {
        this.idpersonatipopersona = idpersonatipopersona;
    }

    // Definiendo los getter y setter de "fechaestado"
    public LocalDateTime getFechaestado() {
        return fechaestado;
    }
    public void setFechaestado(LocalDateTime fechaestado) {
        this.fechaestado = fechaestado;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    // Definiendo los getter y setter de "tipopersona"
    public TipoPersona getTipopersona() {
        return tipopersona;
    }
    public void setTipopersona(TipoPersona tipopersona) {
        this.tipopersona = tipopersona;
    }
}