package com.pushup.antiguedades.shared.domain.dto.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;
import com.pushup.antiguedades.shared.domain.entity.transaccion.Transacciones;

public class DetalleTransaccionDTO {
    // Agregando los atributos necesarios
    private long iddetalletransaccion;
    private int cantidad;
    private BigDecimal preciounitario;
    private String descripciondetalletransaccion;
    private Transacciones transacciones;
    private Antiguedades antiguedad;

    
    // Creando los constructores de la clase
    public DetalleTransaccionDTO() {
    
    }

    public DetalleTransaccionDTO(
        long iddetalletransaccion, int cantidad, BigDecimal preciounitario,
        String descripciondetalletransaccion, Transacciones transacciones, 
        Antiguedades antiguedad
    ) {
        this.iddetalletransaccion = iddetalletransaccion;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.descripciondetalletransaccion = descripciondetalletransaccion;
        this.transacciones = transacciones;
        this.antiguedad = antiguedad;
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