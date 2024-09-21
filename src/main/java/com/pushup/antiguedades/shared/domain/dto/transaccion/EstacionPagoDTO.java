package com.pushup.antiguedades.shared.domain.dto.transaccion;

public class EstacionPagoDTO {
    // Agregando los atributos necesarios
    private long idestacionpago;
    private String ubicacion;
    private String nombreestacionpago;

    
    // Creando los constructores de la clase
    public EstacionPagoDTO() {
        
    }

    public EstacionPagoDTO(long idestacionpago, String ubicacion, String nombreestacionpago) {
        this.idestacionpago = idestacionpago;
        this.ubicacion = ubicacion;
        this.nombreestacionpago = nombreestacionpago;
    }


    // Definiendo los getter y setter de "idestacionpago"
    public long getIdestacionpago() {
        return idestacionpago;
    }
    public void setIdestacionpago(long idestacionpago) {
        this.idestacionpago = idestacionpago;
    }

    // Definiendo los getter y setter de "ubicacion"
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Definiendo los getter y setter de "nombreestacionpago"
    public String getNombreestacionpago() {
        return nombreestacionpago;
    }
    public void setNombreestacionpago(String nombreestacionpago) {
        this.nombreestacionpago = nombreestacionpago;
    }
}