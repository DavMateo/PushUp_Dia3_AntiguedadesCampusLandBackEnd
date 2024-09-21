package com.pushup.antiguedades.shared.domain.dto.transaccion;

public class MedioPagoDTO {
    // Agregando los atributos necesarios
    private long idmediopago;
    private String nombremediopago;
    private int isdigital;

    
    // Creando los constructores de la clase
    public MedioPagoDTO() {
    
    }

    public MedioPagoDTO(long idmediopago, String nombremediopago, int isdigital) {
        this.idmediopago = idmediopago;
        this.nombremediopago = nombremediopago;
        this.isdigital = isdigital;
    }


    // Definiendo los getter y setter de "idmediopago"
    public long getIdmediopago() {
        return idmediopago;
    }
    public void setIdmediopago(long idmediopago) {
        this.idmediopago = idmediopago;
    }

    // Definiendo los getter y setter de "nombremediopago"
    public String getNombremediopago() {
        return nombremediopago;
    }
    public void setNombremediopago(String nombremediopago) {
        this.nombremediopago = nombremediopago;
    }

    // Definiendo los getter y setter de "isdigital"
    public int getIsdigital() {
        return isdigital;
    }
    public void setIsdigital(int isdigital) {
        this.isdigital = isdigital;
    }
}