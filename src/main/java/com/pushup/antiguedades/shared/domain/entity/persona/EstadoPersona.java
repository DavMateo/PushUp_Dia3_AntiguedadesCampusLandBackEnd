package com.pushup.antiguedades.shared.domain.entity.persona;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "estadopersona")
public class EstadoPersona {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestadopersona", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idestadopersona;

    @Column(name = "nombreestadopersona", columnDefinition = "VARCHAR(40)", nullable = false)
    @NotBlank(message = "'nombreestadopersona no puede estar vacío.")
    @Size(min = 5, max = 40, message = "El nombreestadopersona debe tener una longitud de 5 a 40 caracteres.")
    private String nombreestadopersona;


    // Creando los constructores de la clase
    public EstadoPersona() {
    
    }


    // Definiendo los getter y setter de "idestadopersona"
    public long getIdestadopersona() {
        return idestadopersona;
    }
    public void setIdestadopersona(long idestadopersona) {
        this.idestadopersona = idestadopersona;
    }

    // Definiendo los getter y setter de "nombreestadopersona"
    public String getNombreestadopersona() {
        return nombreestadopersona;
    }
    public void setNombreestadopersona(String nombreestadopersona) {
        this.nombreestadopersona = nombreestadopersona;
    }
}