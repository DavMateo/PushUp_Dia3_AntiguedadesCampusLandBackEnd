package com.pushup.antiguedades.shared.domain.dto.localizacion;

public class PaisesDTO {
    // Agregando los atributos necesarios
    private long idpaises;
    private String nombrepais;
    private String sufijo;
    private int prefijo;


    // Creando los constructores de la clase
    public PaisesDTO() {
        
    }

    public PaisesDTO(long idpaises, String nombrepais, String sufijo, int prefijo) {
        this.idpaises = idpaises;
        this.nombrepais = nombrepais;
        this.sufijo = sufijo;
        this.prefijo = prefijo;
    }

    
    // Definiendo los getter y setter de "idpaises"
    public long getIdpaises() {
        return idpaises;
    }
    public void setIdpaises(long idpaises) {
        this.idpaises = idpaises;
    }

    // Definiendo los getter y setter de "nombrepais"
    public String getNombrepais() {
        return nombrepais;
    }
    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    // Definiendo los getter y setter de "sufijo"
    public String getSufijo() {
        return sufijo;
    }
    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }

    // Definiendo los getter y setter de "prefijo"
    public int getPrefijo() {
        return prefijo;
    }
    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }
}