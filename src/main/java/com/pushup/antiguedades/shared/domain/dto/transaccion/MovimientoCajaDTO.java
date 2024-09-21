package com.pushup.antiguedades.shared.domain.dto.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.transaccion.EstacionPago;
import com.pushup.antiguedades.shared.domain.entity.transaccion.TipoMovimientoCaja;

public class MovimientoCajaDTO {
    // Agregando los atributos necesarios
    private long idmovimientocaja;
    private LocalDateTime fechamovimiento;
    private BigDecimal montototal;
    private int ispagohibrido;
    private EstacionPago estacionpago;
    private TipoMovimientoCaja tipomovimientocaja;


    // Creando los constructores de la clase
    public MovimientoCajaDTO() {

    }

    public MovimientoCajaDTO(
        long idmovimientocaja, LocalDateTime fechamovimiento, BigDecimal montototal,
        int ispagohibrido, EstacionPago estacionpago, TipoMovimientoCaja tipomovimientocaja
    ) {
        this.idmovimientocaja = idmovimientocaja;
        this.fechamovimiento = fechamovimiento;
        this.montototal = montototal;
        this.ispagohibrido = ispagohibrido;
        this.estacionpago = estacionpago;
        this.tipomovimientocaja = tipomovimientocaja;
    }


    // Definiendo los getter y setter de "idmovimientocaja"
    public long getIdmovimientocaja() {
        return idmovimientocaja;
    }
    public void setIdmovimientocaja(long idmovimientocaja) {
        this.idmovimientocaja = idmovimientocaja;
    }

    // Definiendo los getter y setter de "fechamovimiento"
    public LocalDateTime getFechamovimiento() {
        return fechamovimiento;
    }
    public void setFechamovimiento(LocalDateTime fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }

    // Definiendo los getter y setter de "montototal"
    public BigDecimal getMontototal() {
        return montototal;
    }
    public void setMontototal(BigDecimal montototal) {
        this.montototal = montototal;
    }

    // Definiendo los getter y setter de "ispagohibrido"
    public int getIspagohibrido() {
        return ispagohibrido;
    }
    public void setIspagohibrido(int ispagohibrido) {
        this.ispagohibrido = ispagohibrido;
    }

    // Definiendo los getter y setter de "estacionpago"
    public EstacionPago getEstacionpago() {
        return estacionpago;
    }
    public void setEstacionpago(EstacionPago estacionpago) {
        this.estacionpago = estacionpago;
    }

    // Definiendo los getter y setter de "tipomovimientocaja"
    public TipoMovimientoCaja getTipomovimientocaja() {
        return tipomovimientocaja;
    }
    public void setTipomovimientocaja(TipoMovimientoCaja tipomovimientocaja) {
        this.tipomovimientocaja = tipomovimientocaja;
    }
}