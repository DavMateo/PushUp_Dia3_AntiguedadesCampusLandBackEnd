package com.pushup.antiguedades.shared.domain.dto.empresa;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;

public class EmpleadoDTO {
    // Agregando los atributos necesarios
    private long idempleado;
    private String cargo;
    private String areatrabajo;
    private LocalDateTime fechacontratacion;
    private String horainiciohorario;
    private String horafinhorario;
    private Persona persona;


    // Creando los constructores de la clase
    public EmpleadoDTO() {

    }

    public EmpleadoDTO(
        long idempleado, String cargo, String areatrabajo, LocalDateTime fechacontratacion,
        String horainiciohorario, String horafinhorario, Persona persona
    ) {
        this.idempleado = idempleado;
        this.cargo = cargo;
        this.areatrabajo = areatrabajo;
        this.fechacontratacion = fechacontratacion;
        this.horainiciohorario = horainiciohorario;
        this.horafinhorario = horafinhorario;
        this.persona = persona;
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