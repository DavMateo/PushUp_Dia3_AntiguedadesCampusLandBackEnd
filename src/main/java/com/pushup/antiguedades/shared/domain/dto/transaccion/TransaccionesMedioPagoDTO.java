package com.pushup.antiguedades.shared.domain.dto.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.transaccion.MedioPago;
import com.pushup.antiguedades.shared.domain.entity.transaccion.Transacciones;

public class TransaccionesMedioPagoDTO {
    // Agregando los atributos necesarios
    private long idtransaccionmediopago;
    private LocalDateTime fechatransaccionmediopago;
    private BigDecimal montotransaccion;
    private Transacciones transacciones;
    private MedioPago mediopago;

    
    // Creando los constructores de la clase
    public TransaccionesMedioPagoDTO() {
    
    }

    public TransaccionesMedioPagoDTO(
        long idtransaccionmediopago, LocalDateTime fechatransaccionmediopago,
        BigDecimal montotransaccion, Transacciones transacciones, MedioPago mediopago
    ) {
        this.idtransaccionmediopago = idtransaccionmediopago;
        this.fechatransaccionmediopago = fechatransaccionmediopago;
        this.montotransaccion = montotransaccion;
        this.transacciones = transacciones;
        this.mediopago = mediopago;
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