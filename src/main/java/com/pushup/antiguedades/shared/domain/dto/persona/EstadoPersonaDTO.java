package com.pushup.antiguedades.shared.domain.dto.persona;

public class EstadoPersonaDTO {
    // Agregando los atributos necesarios
    private long idestadopersona;
    private String nombreestadopersona;
    

    // Creando los constructores de la clase
    public EstadoPersonaDTO() {

    }

    public EstadoPersonaDTO(long idestadopersona, String nombreestadopersona) {
        this.idestadopersona = idestadopersona;
        this.nombreestadopersona = nombreestadopersona;
    }


    // Definiendo los getter y setter de "idestadopersona"
    public long getIdestadopersona() {
        return idestadopersona;
    }
    public void setIdestadopersona(long idestadopersona) {
        this.idestadopersona = idestadopersona;
    }

    // Definiendo los getter y setter de "nombreestadopersona"
    public String getNombreestadopersona() {
        return nombreestadopersona;
    }
    public void setNombreestadopersona(String nombreestadopersona) {
        this.nombreestadopersona = nombreestadopersona;
    }
}
