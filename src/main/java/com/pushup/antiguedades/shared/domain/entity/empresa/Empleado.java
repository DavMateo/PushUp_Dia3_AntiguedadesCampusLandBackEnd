package com.pushup.antiguedades.shared.domain.entity.empresa;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;
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
@Table(name = "empleado")
public class Empleado {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempleado", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idempleado;

    @Column(name = "cargo", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message = "'cargo' no puede estar vacío.")
    @Size(min = 6, max = 100, message = "El cargo debe tener una longitud de 6 a 100 caracteres.")
    private String cargo;

    @Column(name = "areatrabajo", columnDefinition = "VARCHAR(50)", nullable = false)
    @NotBlank(message = "'areatrabajo no puede estar vacío.")
    @Size(min = 5, max = 50, message = "El areatrabajo debe tener una longitud de 5 a 50 caracteres.")
    private String areatrabajo;

    @Column(name = "fechacontratacion", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fecha_contratacion' no puede ser nulo, ingrese información.")
    private LocalDateTime fechacontratacion;

    @Column(name = "horainiciohorario", columnDefinition = "VARCHAR(8)", nullable = false)
    @NotBlank(message = "'horainiciohorario no puede estar vacío.")
    @Size(min = 4, max = 8, message = "El horainiciohorario debe tener una longitud de 4 a 8 caracteres.")
    private String horainiciohorario;

    @Column(name = "horafinhorario", columnDefinition = "VARCHAR(8)", nullable = false)
    @NotBlank(message = "'horafinhorario no puede estar vacío.")
    @Size(min = 4, max = 8, message = "El horafinhorario debe tener una longitud de 4 a 8 caracteres.")
    private String horafinhorario;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;


    // Creando los constructores de la clase
    public Empleado() {

    }

    
    // Definiendo los getter y setter de "idempleado"
    public long getIdempleado() {
        return idempleado;
    }
    public void setIdempleado(long idempleado) {
        this.idempleado = idempleado;
    }

    // Definiendo los getter y setter de "cargo"
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Definiendo los getter y setter de "areatrabajo"
    public String getAreatrabajo() {
        return areatrabajo;
    }
    public void setAreatrabajo(String areatrabajo) {
        this.areatrabajo = areatrabajo;
    }

    // Definiendo los getter y setter de "fechacontratacion"
    public LocalDateTime getFechacontratacion() {
        return fechacontratacion;
    }
    public void setFechacontratacion(LocalDateTime fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }

    // Definiendo los getter y setter de "horainiciohorario"
    public String getHorainiciohorario() {
        return horainiciohorario;
    }
    public void setHorainiciohorario(String horainiciohorario) {
        this.horainiciohorario = horainiciohorario;
    }

    // Definiendo los getter y setter de "horafinhorario"
    public String getHorafinhorario() {
        return horafinhorario;
    }
    public void setHorafinhorario(String horafinhorario) {
        this.horafinhorario = horafinhorario;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}