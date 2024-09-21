package com.pushup.antiguedades.shared.domain.dto.empresa;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;

public class EmpresaDTO {
    // Agregando los atributos necesarios
    private long idempresa;
    private String nombreempresa;
    private String razonsocial;
    private String descripcionempresa;
    private LocalDateTime fechacreacion;
    private String nif;


    // Creando los constructores de la clase
    public EmpresaDTO() {

    }

    public EmpresaDTO(
        long idempresa, String nombreempresa, String razonsocial, 
        String descripcionempresa, LocalDateTime fechacreacion, String nif
    ) {
        this.idempresa = idempresa;
        this.nombreempresa = nombreempresa;
        this.razonsocial = razonsocial;
        this.descripcionempresa = descripcionempresa;
        this.fechacreacion = fechacreacion;
        this.nif = nif;
    }

    
    // Definiendo los getter y setter de "idempresa"
    public long getIdempresa() {
        return idempresa;
    }
    public void setIdempresa(long idempresa) {
        this.idempresa = idempresa;
    }

    // Definiendo los getter y setter de "nombreempresa"
    public String getNombreempresa() {
        return nombreempresa;
    }
    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    // Definiendo los getter y setter de "razonsocial"
    public String getRazonsocial() {
        return razonsocial;
    }
    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    // Definiendo los getter y setter de "descripcionempresa"
    public String getDescripcionempresa() {
        return descripcionempresa;
    }
    public void setDescripcionempresa(String descripcionempresa) {
        this.descripcionempresa = descripcionempresa;
    }

    // Definiendo los getter y setter de "fechacreacion"
    public LocalDateTime getFechacreacion() {
        return fechacreacion;
    }
    public void setFechacreacion(LocalDateTime fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    // Definiendo los getter y setter de "nif"
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
}