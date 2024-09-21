package com.pushup.antiguedades.shared.domain.entity.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "transaccionmediopago")
public class TransaccionMedioPago {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransaccionmediopago", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idtransaccionmediopago;

    @Column(name = "fechatransaccionmediopago", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechatransaccionmediopago' no puede ser nulo, ingrese información.")
    private LocalDateTime fechatransaccionmediopago;

    @Column(name = "montotransaccion", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotBlank(message = "'montotransaccion' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El montotransaccion debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El montotransaccion debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal montotransaccion;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idtransacciones", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_transacciones' no puede ser nulo, ingrese información.")
    private Transacciones transacciones;

    @ManyToOne
    @JoinColumn(name = "idmediopago", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_mediopago' no puede ser nulo, ingrese información.")
    private MedioPago mediopago;


    // Creando los constructores de la clase
    public TransaccionMedioPago() {

    }


    // Definiendo los getter y setter de "idtransaccionmediopago"
    public long getIdtransaccionmediopago() {
        return idtransaccionmediopago;
    }
    public void setIdtransaccionmediopago(long idtransaccionmediopago) {
        this.idtransaccionmediopago = idtransaccionmediopago;
    }

    // Definiendo los getter y setter de "fechatransaccionmediopago"
    public LocalDateTime getFechatransaccionmediopago() {
        return fechatransaccionmediopago;
    }
    public void setFechatransaccionmediopago(LocalDateTime fechatransaccionmediopago) {
        this.fechatransaccionmediopago = fechatransaccionmediopago;
    }

    // Definiendo los getter y setter de "montotransaccion"
    public BigDecimal getMontotransaccion() {
        return montotransaccion;
    }
    public void setMontotransaccion(BigDecimal montotransaccion) {
        this.montotransaccion = montotransaccion;
    }

    // Definiendo los getter y setter de "transacciones"
    public Transacciones getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }

    // Definiendo los getter y setter de "mediopago"
    public MedioPago getMediopago() {
        return mediopago;
    }
    public void setMediopago(MedioPago mediopago) {
        this.mediopago = mediopago;
    }
}