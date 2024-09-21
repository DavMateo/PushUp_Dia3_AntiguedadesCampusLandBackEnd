package com.pushup.antiguedades.shared.domain.dto.localizacion;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.localizacion.Regiones;

public class CiudadesDTO {
    // Agregando los atributos necesarios
    private long idciudades;
    private String nombreciudad;
    private Regiones regiones;


    // Creando los constructores de la clase
    public CiudadesDTO() {

    }

    public CiudadesDTO(long idciudades, String nombreciudad, Regiones regiones) {
        this.idciudades = idciudades;
        this.nombreciudad = nombreciudad;
        this.regiones = regiones;
    }


    // Definiendo los getter y setter de "idciudades"
    public long getIdciudades() {
        return idciudades;
    }
    public void setIdciudades(long idciudades) {
        this.idciudades = idciudades;
    }

    // Definiendo los getter y setter de "nombreciudad"
    public String getNombreciudad() {
        return nombreciudad;
    }
    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    // Definiendo los getter y setter de "regiones"
    public Regiones getRegiones() {
        return regiones;
    }
    public void setRegiones(Regiones regiones) {
        this.regiones = regiones;
    }
}