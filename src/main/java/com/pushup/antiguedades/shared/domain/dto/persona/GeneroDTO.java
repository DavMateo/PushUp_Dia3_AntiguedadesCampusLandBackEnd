package com.pushup.antiguedades.shared.domain.dto.persona;

public class GeneroDTO {
    // Agregando los atributos necesarios
    private long idgenero;
    private String sexo;
    
    
    // Creando los constructores de la clase
    public GeneroDTO() {
    
    }

    public GeneroDTO(long idgenero, String sexo) {
        this.idgenero = idgenero;
        this.sexo = sexo;
    }


    // Definiendo los getter y setter de "idgenero"
    public long getIdgenero() {
        return idgenero;
    }
    public void setIdgenero(long idgenero) {
        this.idgenero = idgenero;
    }

    // Definiendo los getter y setter de "sexo"
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}