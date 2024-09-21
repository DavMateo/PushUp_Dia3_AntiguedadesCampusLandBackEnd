package com.pushup.antiguedades.shared.domain.entity.transaccion;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "mediopago")
public class MedioPago {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmediopago", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idmediopago;

    @Column(name = "nombremediopago", columnDefinition = "VARCHAR(35)", nullable = false)
    @NotBlank(message = "'nombremediopago no puede estar vacío.")
    @Size(min = 2, max = 35, message = "El nombremediopago debe tener una longitud de 2 a 35 caracteres.")
    private String nombremediopago;

    @Column(name = "isdigital", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    @NotBlank(message = "'isdigital' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo o menor a 0.")
    @Max(value = 1, message = "El valor numérico ingresado no puede ser mayor a 1.")
    private int isdigital;


    // Creando los constructores de la clase
    public MedioPago() {

    }


    // Definiendo los getter y setter de "idmediopago"
    public long getIdmediopago() {
        return idmediopago;
    }
    public void setIdmediopago(long idmediopago) {
        this.idmediopago = idmediopago;
    }

    // Definiendo los getter y setter de "nombremediopago"
    public String getNombremediopago() {
        return nombremediopago;
    }
    public void setNombremediopago(String nombremediopago) {
        this.nombremediopago = nombremediopago;
    }

    // Definiendo los getter y setter de "isdigital"
    public int getIsdigital() {
        return isdigital;
    }
    public void setIsdigital(int isdigital) {
        this.isdigital = isdigital;
    }
}