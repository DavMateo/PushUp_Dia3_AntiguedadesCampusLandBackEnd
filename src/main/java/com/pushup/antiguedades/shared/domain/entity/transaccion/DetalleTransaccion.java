package com.pushup.antiguedades.shared.domain.entity.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "detalletransaccion")
public class DetalleTransaccion {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalletransaccion", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long iddetalletransaccion;

    @Column(name = "cantidad", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'cantidad' no puede estar vacío.")
    @Min(value = 1, message = "El valor numérico ingresado no puede ser negativo o menor a 1.")
    @Max(value = 999, message = "El valor numérico ingresado no puede ser mayor a 999.")
    private int cantidad;

    @Column(name = "preciounitario", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotBlank(message = "'preciounitario' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El preciounitario debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.00", inclusive = true, message = "El preciounitario debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal preciounitario;

    @Column(name = "descripciondetalletransaccion", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "'descripciondetalletransaccion no puede estar vacío.")
    @Size(min = 10, max = 255, message = "El descripciondetalletransaccion debe tener una longitud de 10 a 255 caracteres.")
    private String descripciondetalletransaccion;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idtransacciones", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_transacciones' no puede ser nulo, ingrese información.")
    private Transacciones transacciones;

    @ManyToOne
    @JoinColumn(name = "idantiguedad", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_antiguedad' no puede ser nulo, ingrese información.")
    private Antiguedades antiguedad;


    // Creando los constructores de la clase
    public DetalleTransaccion() {
        
    }


    // Definiendo los getter y setter de "iddetalletransaccion"
    public long getIddetalletransaccion() {
        return iddetalletransaccion;
    }
    public void setIddetalletransaccion(long iddetalletransaccion) {
        this.iddetalletransaccion = iddetalletransaccion;
    }

    // Definiendo los getter y setter de "cantidad"
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Definiendo los getter y setter de "preciounitario"
    public BigDecimal getPreciounitario() {
        return preciounitario;
    }
    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    // Definiendo los getter y setter de "descripciondetalletransaccion"
    public String getDescripciondetalletransaccion() {
        return descripciondetalletransaccion;
    }
    public void setDescripciondetalletransaccion(String descripciondetalletransaccion) {
        this.descripciondetalletransaccion = descripciondetalletransaccion;
    }

    // Definiendo los getter y setter de "transacciones"
    public Transacciones getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }

    // Definiendo los getter y setter de "antiguedad"
    public Antiguedades getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(Antiguedades antiguedad) {
        this.antiguedad = antiguedad;
    }
}