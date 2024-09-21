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
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "personatipopersona")
public class PersonaTipoPersona {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersonatipopersona", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idpersonatipopersona;

    @Column(name = "fechaestado", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechaestado' no puede ser nulo, ingrese información.")
    private LocalDateTime fechaestado;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idtipopersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_tipopersona' no puede ser nulo, ingrese información.")
    private TipoPersona tipopersona;


    // Creando los constructores de la clase
    public PersonaTipoPersona() {
        
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