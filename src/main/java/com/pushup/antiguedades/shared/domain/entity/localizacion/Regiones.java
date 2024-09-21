package com.pushup.antiguedades.shared.domain.entity.localizacion;

// Importando las clases y paquetes necesarios
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
@Table(name = "regiones")
public class Regiones {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregiones", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idregiones;

    @Column(name = "nombreregiones", columnDefinition = "VARCHAR(75)", nullable = false)
    @NotBlank(message = "'nombreregiones no puede estar vacío.")
    @Size(min = 4, max = 75, message = "El nombreregiones debe tener una longitud de 4 a 75 caracteres.")
    private String nombreregiones;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idpaises", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_paises' no puede ser nulo, ingrese información.")
    private Paises paises;

    
    // Creando los constructores de la clase
    public Regiones() {
    
    }


    // Definiendo los getter y setter de "idregiones"
    public long getIdregiones() {
        return idregiones;
    }
    public void setIdregiones(long idregiones) {
        this.idregiones = idregiones;
    }

    // Definiendo los getter y setter de "nombreregiones"
    public String getNombreregiones() {
        return nombreregiones;
    }
    public void setNombreregiones(String nombreregiones) {
        this.nombreregiones = nombreregiones;
    }

    // Definiendo los getter y setter de "paises"
    public Paises getPaises() {
        return paises;
    }
    public void setPaises(Paises paises) {
        this.paises = paises;
    }
}
