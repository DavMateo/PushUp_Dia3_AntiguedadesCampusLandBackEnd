package com.pushup.antiguedades.shared.domain.dto.localizacion;

public class TipoDireccionDTO {
    // Agregando los atributos necesarios
    private long idtipodireccion;
    private String nombretipodireccion;
    

    // Creando los constructores de la clase
    public TipoDireccionDTO() {
    
    }

    public TipoDireccionDTO(long idtipodireccion, String nombretipodireccion) {
        this.idtipodireccion = idtipodireccion;
        this.nombretipodireccion = nombretipodireccion;
    }


    // Definiendo los getter y setter de "idtipodireccion"
    public long getIdtipodireccion() {
        return idtipodireccion;
    }
    public void setIdtipodireccion(long idtipodireccion) {
        this.idtipodireccion = idtipodireccion;
    }

    // Definiendo los getter y setter de "nombretipodireccion"
    public String getNombretipodireccion() {
        return nombretipodireccion;
    }
    public void setNombretipodireccion(String nombretipodireccion) {
        this.nombretipodireccion = nombretipodireccion;
    }
}