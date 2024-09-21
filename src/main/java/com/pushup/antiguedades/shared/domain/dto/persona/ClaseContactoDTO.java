package com.pushup.antiguedades.shared.domain.dto.persona;

public class ClaseContactoDTO {
    // Agregando los atributos necesarios
    private long idclasecontacto;
    private String nombre;
    

    // Creando los constructores de la clase
    public ClaseContactoDTO() {
    
    }

    public ClaseContactoDTO(long idclasecontacto, String nombre) {
        this.idclasecontacto = idclasecontacto;
        this.nombre = nombre;
    }


    // Definiendo los getter y setter de "idclasecontacto"
    public long getIdclasecontacto() {
        return idclasecontacto;
    }
    public void setIdclasecontacto(long idclasecontacto) {
        this.idclasecontacto = idclasecontacto;
    }

    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
