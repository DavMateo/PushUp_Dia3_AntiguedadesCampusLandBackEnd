package com.pushup.antiguedades.shared.domain.dto.persona;

public class TipoPersonaDTO {
    // Agregando los atributos necesarios
    private long idtipopersona;
    private String nombretipopersona;

    
    // Creando los constructores de la clase    
    public TipoPersonaDTO() {

    }

    public TipoPersonaDTO(long idtipopersona, String nombretipopersona) {
        this.idtipopersona = idtipopersona;
        this.nombretipopersona = nombretipopersona;
    }

    
    // Definiendo los getter y setter de "idtipopersona"
    public long getIdtipopersona() {
        return idtipopersona;
    }
    public void setIdtipopersona(long idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    // Definiendo los getter y setter de "nombretipopersona"
    public String getNombretipopersona() {
        return nombretipopersona;
    }
    public void setNombretipopersona(String nombretipopersona) {
        this.nombretipopersona = nombretipopersona;
    }
}