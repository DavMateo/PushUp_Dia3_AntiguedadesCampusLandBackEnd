package com.pushup.antiguedades.shared.domain.entity;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.transaccion.Transacciones;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "despachos")
public class Despachos {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddespachos", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long iddespachos;

    @Column(name = "nombredespacho", columnDefinition = "VARCHAR(65)", nullable = false)
    @NotBlank(message = "'nombredespacho no puede estar vacío.")
    @Size(min = 2, max = 65, message = "El nombredespacho debe tener una longitud de 2 a 65 caracteres.")
    private String nombredespacho;

    @Column(name = "tipodespacho", columnDefinition = "VARCHAR(40)", nullable = false)
    @NotBlank(message = "'tipodespacho no puede estar vacío.")
    @Size(min = 4, max = 40, message = "El tipodespacho debe tener una longitud de 4 a 40 caracteres.")
    private String tipodespacho;

    @Column(name = "capacidad", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'capacidad' no puede estar vacío.")
    @Min(value = 1, message = "El valor numérico ingresado no puede ser negativo o me1or a 0.")
    @Max(value = 100000, message = "El valor numérico ingresado no puede ser mayor a 100000.")
    private int capacidad;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idtransacciones", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_transacciones' no puede ser nulo, ingrese información.")
    private Transacciones transacciones;


    // Creando los constructores de la clase
    public Despachos() {

    }


    // Definiendo los getter y setter de "iddespachos"
    public long getIddespachos() {
        return iddespachos;
    }
    public void setIddespachos(long iddespachos) {
        this.iddespachos = iddespachos;
    }

    // Definiendo los getter y setter de "nombredespacho"
    public String getNombredespacho() {
        return nombredespacho;
    }
    public void setNombredespacho(String nombredespacho) {
        this.nombredespacho = nombredespacho;
    }

    // Definiendo los getter y setter de "tipodespacho"
    public String getTipodespacho() {
        return tipodespacho;
    }
    public void setTipodespacho(String tipodespacho) {
        this.tipodespacho = tipodespacho;
    }

    // Definiendo los getter y setter de "capacidad"
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Definiendo los getter y setter de "transacciones"
    public Transacciones getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }
}