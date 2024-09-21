package com.pushup.antiguedades.shared.domain.dto.transaccion;

public class TipoTransaccionDTO {
    // Agregando los atributos necesarios
    private long idtipotransaccion;
    private String nombretipotransaccion;


    // Creando los constructores de la clase
    public TipoTransaccionDTO() {
    
    }

    public TipoTransaccionDTO(long idtipotransaccion, String nombretipotransaccion) {
        this.idtipotransaccion = idtipotransaccion;
        this.nombretipotransaccion = nombretipotransaccion;
    }


    // Definiendo los getter y setter de "idtipotransaccion"
    public long getIdtipotransaccion() {
        return idtipotransaccion;
    }
    public void setIdtipotransaccion(long idtipotransaccion) {
        this.idtipotransaccion = idtipotransaccion;
    }

    // Definiendo los getter y setter de "nombretipotransaccion"
    public String getNombretipotransaccion() {
        return nombretipotransaccion;
    }
    public void setNombretipotransaccion(String nombretipotransaccion) {
        this.nombretipotransaccion = nombretipotransaccion;
    }
}