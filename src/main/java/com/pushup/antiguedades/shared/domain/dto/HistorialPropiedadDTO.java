package com.pushup.antiguedades.shared.domain.dto;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.transaccion.Transacciones;

public class HistorialPropiedadDTO {
    // Agregando los atributos necesarios
    private long iddespachos;
    private String nombredespacho;
    private String tipodespacho;
    private int capacidad;
    private Transacciones transacciones;


    // Creando los constructores de la clase    
    public HistorialPropiedadDTO() {

    }

    public HistorialPropiedadDTO(
        long iddespachos, String nombredespacho, String tipodespacho, 
        int capacidad, Transacciones transacciones
    ) {
        this.iddespachos = iddespachos;
        this.nombredespacho = nombredespacho;
        this.tipodespacho = tipodespacho;
        this.capacidad = capacidad;
        this.transacciones = transacciones;
    }

    
    // Definiendo los getter y setter de "iddespachos"
    public long getIddespachos() {
        return iddespachos;
    }
    public void setIddespachos(long iddespachos) {
        this.iddespachos = iddespachos;
    }

    // Definiendo los getter y setter de "nombredespacho"
    public String getNombredespacho() {
        return nombredespacho;
    }
    public void setNombredespacho(String nombredespacho) {
        this.nombredespacho = nombredespacho;
    }

    // Definiendo los getter y setter de "tipodespacho"
    public String getTipodespacho() {
        return tipodespacho;
    }
    public void setTipodespacho(String tipodespacho) {
        this.tipodespacho = tipodespacho;
    }

    // Definiendo los getter y setter de "capacidad"
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Definiendo los getter y setter de "transacciones"
    public Transacciones getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }
}