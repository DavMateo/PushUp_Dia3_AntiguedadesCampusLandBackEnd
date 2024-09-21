package com.pushup.antiguedades.shared.domain.entity.empresa;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "empresa")
public class Empresa {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idempresa;

    @Column(name = "nombreempresa", columnDefinition = "VARCHAR(75)", nullable = false)
    @NotBlank(message = "'nombreempresa no puede estar vacío.")
    @Size(min = 4, max = 75, message = "El nombreempresa debe tener una longitud de 4 a 75 caracteres.")
    private String nombreempresa;

    @Column(name = "razonsocial", columnDefinition = "VARCHAR(200)", nullable = false)
    @NotBlank(message = "'razonsocial no puede estar vacío.")
    @Size(min = 10, max = 200, message = "El razonsocial debe tener una longitud de 10 a 200 caracteres.")
    private String razonsocial;

    @Column(name = "descripcionempresa", columnDefinition = "VARCHAR(255)", nullable = true)
    @NotBlank(message = "'descripcionempresa no puede estar vacío.")
    @Size(min = 20, max = 255, message = "El descripcionempresa debe tener una longitud de 20 a 255 caracteres.")
    private String descripcionempresa;

    @Column(name = "fechacreacion", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechacreacion' no puede ser nulo, ingrese información.")
    private LocalDateTime fechacreacion;

    @Column(name = "nif", columnDefinition = "VARCHAR(20)", nullable = false)
    @NotBlank(message = "'nif no puede estar vacío.")
    @Size(min = 4, max = 20, message = "El nif debe tener una longitud de 4 a 20 caracteres.")
    private String nif;


    // Creando los constructores de la clase
    public Empresa() {

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