package com.pushup.antiguedades.shared.domain.dto.transaccion;

public class TipoMovimientoCajaDTO {
    // Agregando los atributos necesarios
    private long idtipomovimientocaja;
    private String nombretipomovimiento;

    
    // Creando los constructores de la clase
    public TipoMovimientoCajaDTO() {

    }

    public TipoMovimientoCajaDTO(long idtipomovimientocaja, String nombretipomovimiento) {
        this.idtipomovimientocaja = idtipomovimientocaja;
        this.nombretipomovimiento = nombretipomovimiento;
    }


    // Definiendo los getter y setter de "idtipomovimientocaja"
    public long getIdtipomovimientocaja() {
        return idtipomovimientocaja;
    }
    public void setIdtipomovimientocaja(long idtipomovimientocaja) {
        this.idtipomovimientocaja = idtipomovimientocaja;
    }

    // Definiendo los getter y setter de "nombretipomovimiento"
    public String getNombretipomovimiento() {
        return nombretipomovimiento;
    }
    public void setNombretipomovimiento(String nombretipomovimiento) {
        this.nombretipomovimiento = nombretipomovimiento;
    }    
}
