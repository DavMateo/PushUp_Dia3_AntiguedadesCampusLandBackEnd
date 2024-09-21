package com.pushup.antiguedades.shared.domain.entity.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
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
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "transacciones")
public class Transacciones {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransacciones", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idtransacciones;

    @Column(name = "fechatransaccion", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechatransaccion' no puede ser nulo, ingrese información.")
    private LocalDateTime fechatransaccion;

    @Column(name = "fechavencimiento", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechavencimiento' no puede ser nulo, ingrese información.")
    private LocalDateTime fechavencimiento;

    @Column(name = "montoitems", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotBlank(message = "'montoitems' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El montoitems debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El montoitems debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal montoitems;

    @Column(name = "iva", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    @NotBlank(message = "'iva' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo o menor a 0.")
    @Max(value = 100, message = "El valor numérico ingresado no puede ser mayor a 100.")
    private int iva;

    @Column(name = "isdescuento", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    @NotBlank(message = "'isdescuento' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo o menor a 0.")
    @Max(value = 1, message = "El valor numérico ingresado no puede ser mayor a 1.")
    private int isdescuento;

    @Column(name = "cantdescuento", columnDefinition = "DECIMAL(10, 2)", nullable = true)
    @NotBlank(message = "'cantdescuento' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El cantdescuento debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El cantdescuento debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal cantdescuento;

    @Column(name = "isdomicilio", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    @NotBlank(message = "'isdomicilio' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo o menor a 0.")
    @Max(value = 1, message = "El valor numérico ingresado no puede ser mayor a 1.")
    private int isdomicilio;

    @Column(name = "cantdomicilio", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotBlank(message = "'cantdomicilio' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El cantdomicilio debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El cantdomicilio debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal cantdomicilio;

    @Column(name = "montototal", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotBlank(message = "'montototal' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El montototal debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El montototal debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal montototal;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idtipotransaccion", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_tipotransaccion' no puede ser nulo, ingrese información.")
    private TipoTransaccion tipotransaccion;

    @ManyToOne
    @JoinColumn(name = "idestacionpago", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_estacionpago' no puede ser nulo, ingrese información.")
    private EstacionPago estacionpago;

    
    // Creando los constructores de la clase
    public Transacciones() {
    
    }


    // Definiendo los getter y setter de "idtransacciones"
    public long getIdtransacciones() {
        return idtransacciones;
    }
    public void setIdtransacciones(long idtransacciones) {
        this.idtransacciones = idtransacciones;
    }

    // Definiendo los getter y setter de "fechatransaccion"
    public LocalDateTime getFechatransaccion() {
        return fechatransaccion;
    }
    public void setFechatransaccion(LocalDateTime fechatransaccion) {
        this.fechatransaccion = fechatransaccion;
    }

    // Definiendo los getter y setter de "fechavencimiento"
    public LocalDateTime getFechavencimiento() {
        return fechavencimiento;
    }
    public void setFechavencimiento(LocalDateTime fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    // Definiendo los getter y setter de "montoitems"
    public BigDecimal getMontoitems() {
        return montoitems;
    }
    public void setMontoitems(BigDecimal montoitems) {
        this.montoitems = montoitems;
    }

    // Definiendo los getter y setter de "iva"
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }

    // Definiendo los getter y setter de "isdescuento"
    public int getIsdescuento() {
        return isdescuento;
    }
    public void setIsdescuento(int isdescuento) {
        this.isdescuento = isdescuento;
    }

    // Definiendo los getter y setter de "cantdescuento"
    public BigDecimal getCantdescuento() {
        return cantdescuento;
    }
    public void setCantdescuento(BigDecimal cantdescuento) {
        this.cantdescuento = cantdescuento;
    }

    // Definiendo los getter y setter de "isdomicilio"
    public int getIsdomicilio() {
        return isdomicilio;
    }
    public void setIsdomicilio(int isdomicilio) {
        this.isdomicilio = isdomicilio;
    }

    // Definiendo los getter y setter de "cantdomicilio"
    public BigDecimal getCantdomicilio() {
        return cantdomicilio;
    }
    public void setCantdomicilio(BigDecimal cantdomicilio) {
        this.cantdomicilio = cantdomicilio;
    }

    // Definiendo los getter y setter de "montototal"
    public BigDecimal getMontototal() {
        return montototal;
    }
    public void setMontototal(BigDecimal montototal) {
        this.montototal = montototal;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    // Definiendo los getter y setter de "tipotransaccion"
    public TipoTransaccion getTipotransaccion() {
        return tipotransaccion;
    }
    public void setTipotransaccion(TipoTransaccion tipotransaccion) {
        this.tipotransaccion = tipotransaccion;
    }

    // Definiendo los getter y setter de "estacionpago"
    public EstacionPago getEstacionpago() {
        return estacionpago;
    }
    public void setEstacionpago(EstacionPago estacionpago) {
        this.estacionpago = estacionpago;
    }
}