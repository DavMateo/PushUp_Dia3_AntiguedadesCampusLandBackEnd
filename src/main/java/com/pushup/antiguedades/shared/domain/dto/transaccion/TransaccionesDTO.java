package com.pushup.antiguedades.shared.domain.dto.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;
import com.pushup.antiguedades.shared.domain.entity.transaccion.EstacionPago;
import com.pushup.antiguedades.shared.domain.entity.transaccion.TipoTransaccion;

public class TransaccionesDTO {
    // Agregando los atributos necesarios
    private long idtransacciones;
    private LocalDateTime fechatransaccion;
    private LocalDateTime fechavencimiento;
    private BigDecimal montoitems;
    private int iva;
    private int isdescuento;
    private BigDecimal cantdescuento;
    private int isdomicilio;
    private BigDecimal cantdomicilio;
    private BigDecimal montototal;
    private Persona persona;
    private TipoTransaccion tipotransaccion;
    private EstacionPago estacionpago;

    
    // Creando los constructores de la clase
    public TransaccionesDTO() {

    }

    public TransaccionesDTO(
        long idtransacciones, LocalDateTime fechatransaccion, LocalDateTime fechavencimiento,
        BigDecimal montoitems, int iva, int isdescuento, BigDecimal cantdescuento, 
        int isdomicilio, BigDecimal cantdomicilio, BigDecimal montototal, Persona persona, 
        TipoTransaccion tipotransaccion, EstacionPago estacionpago
    ) {
        this.idtransacciones = idtransacciones;
        this.fechatransaccion = fechatransaccion;
        this.fechavencimiento = fechavencimiento;
        this.montoitems = montoitems;
        this.iva = iva;
        this.isdescuento = isdescuento;
        this.cantdescuento = cantdescuento;
        this.isdomicilio = isdomicilio;
        this.cantdomicilio = cantdomicilio;
        this.montototal = montototal;
        this.persona = persona;
        this.tipotransaccion = tipotransaccion;
        this.estacionpago = estacionpago;
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