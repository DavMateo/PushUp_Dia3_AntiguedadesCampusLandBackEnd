package com.pushup.antiguedades.shared.domain.entity;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;
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
@Table(name = "historialpropiedad")
public class HistorialPropiedad {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhistorialpropiedad", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idhistorialpropiedad;

    @Column(name = "fechainicio", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechainicio' no puede ser nulo, ingrese información.")
    private LocalDateTime fechainicio;

    @Column(name = "fechafin", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechafin' no puede ser nulo, ingrese información.")
    private LocalDateTime fechafin;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idantiguedades", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_antiguedades' no puede ser nulo, ingrese información.")
    private Antiguedades antiguedades;

    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;


    // Creando los constructores de la clase
    public HistorialPropiedad() {

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