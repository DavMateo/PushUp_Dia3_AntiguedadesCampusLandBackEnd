package com.pushup.antiguedades.shared.domain.dto.localizacion;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.localizacion.Paises;

public class RegionesDTO {
    // Agregando los atributos necesarios
    private long idregiones;
    private String nombreregiones;
    private Paises paises;
    
    
    // Creando los constructores de la clase
    public RegionesDTO() {

    }

    public RegionesDTO(long idregiones, String nombreregiones, Paises paises) {
        this.idregiones = idregiones;
        this.nombreregiones = nombreregiones;
        this.paises = paises;
    }


    // Definiendo los getter y setter de "idregiones"
    public long getIdregiones() {
        return idregiones;
    }
    public void setIdregiones(long idregiones) {
        this.idregiones = idregiones;
    }

    // Definiendo los getter y setter de "nombreregiones"
    public String getNombreregiones() {
        return nombreregiones;
    }
    public void setNombreregiones(String nombreregiones) {
        this.nombreregiones = nombreregiones;
    }

    // Definiendo los getter y setter de "paises"
    public Paises getPaises() {
        return paises;
    }
    public void setPaises(Paises paises) {
        this.paises = paises;
    }
}
