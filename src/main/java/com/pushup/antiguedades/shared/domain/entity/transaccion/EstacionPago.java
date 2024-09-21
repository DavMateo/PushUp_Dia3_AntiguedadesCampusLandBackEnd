package com.pushup.antiguedades.shared.domain.entity.transaccion;

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
@Table(name = "estacionpago")
public class EstacionPago {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestacionpago", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idestacionpago;

    @Column(name = "ubicacion", columnDefinition = "VARCHAR(75)", nullable = false)
    @NotBlank(message = "'ubicacion no puede estar vacío.")
    @Size(min = 4, max = 75, message = "El ubicacion debe tener una longitud de 4 a 75 caracteres.")
    private String ubicacion;

    @Column(name = "nombreestacionpago", columnDefinition = "VARCHAR(45)", nullable = false)
    @NotBlank(message = "'nombreestacionpago no puede estar vacío.")
    @Size(min = 2, max = 45, message = "El nombreestacionpago debe tener una longitud de 2 a 45 caracteres.")
    private String nombreestacionpago;


    // Creando los constructores de la clase
    public EstacionPago() {

    }

    
    // Definiendo los getter y setter de "idestacionpago"
    public long getIdestacionpago() {
        return idestacionpago;
    }
    public void setIdestacionpago(long idestacionpago) {
        this.idestacionpago = idestacionpago;
    }

    // Definiendo los getter y setter de "ubicacion"
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Definiendo los getter y setter de "nombreestacionpago"
    public String getNombreestacionpago() {
        return nombreestacionpago;
    }
    public void setNombreestacionpago(String nombreestacionpago) {
        this.nombreestacionpago = nombreestacionpago;
    }
}