package com.pushup.antiguedades.shared.domain.dto.antiguedad;

public class EpocaAntiguedadDTO {
    // Agregando los atributos necesarios
    private long idepocaantiguedad;
    private String nombreepocaantiguedad;
    private String periodoinicio;
    private String periodofin;


    // Creando los constructores de la clase
    public EpocaAntiguedadDTO() {

    }

    public EpocaAntiguedadDTO(
        long idepocaantiguedad, String nombreepocaantiguedad, 
        String periodoinicio, String periodofin
    ) {
        this.idepocaantiguedad = idepocaantiguedad;
        this.nombreepocaantiguedad = nombreepocaantiguedad;
        this.periodoinicio = periodoinicio;
        this.periodofin = periodofin;
    }


    // Definiendo los getter y setter de "idepocaantiguedad"
    public long getIdepocaantiguedad() {
        return idepocaantiguedad;
    }
    public void setIdepocaantiguedad(long idepocaantiguedad) {
        this.idepocaantiguedad = idepocaantiguedad;
    }

    // Definiendo los getter y setter de "nombreepocaantiguedad"
    public String getNombreepocaantiguedad() {
        return nombreepocaantiguedad;
    }
    public void setNombreepocaantiguedad(String nombreepocaantiguedad) {
        this.nombreepocaantiguedad = nombreepocaantiguedad;
    }

    // Definiendo los getter y setter de "periodoinicio"
    public String getPeriodoinicio() {
        return periodoinicio;
    }
    public void setPeriodoinicio(String periodoinicio) {
        this.periodoinicio = periodoinicio;
    }

    // Definiendo los getter y setter de "periodofin"
    public String getPeriodofin() {
        return periodofin;
    }
    public void setPeriodofin(String periodofin) {
        this.periodofin = periodofin;
    }
}