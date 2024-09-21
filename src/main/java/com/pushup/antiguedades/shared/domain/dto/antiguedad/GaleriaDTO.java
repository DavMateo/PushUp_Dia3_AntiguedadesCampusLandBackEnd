package com.pushup.antiguedades.shared.domain.dto.antiguedad;

import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;

public class GaleriaDTO {
    // Agregando los atributos necesarios
    private long idgaleria;
    private String nombregaleriaimg;
    private String descripciongaleriaimg;
    private String url;
    private String formatoimg;
    private Antiguedades antiguedades;


    // Creando los constructores de la clase
    public GaleriaDTO() {

    }

    public GaleriaDTO(
        long idgaleria, String nombregaleriaimg, String descripciongaleriaimg, 
        String url, String formatoimg, Antiguedades antiguedades
    ) {
        this.idgaleria = idgaleria;
        this.nombregaleriaimg = nombregaleriaimg;
        this.descripciongaleriaimg = descripciongaleriaimg;
        this.url = url;
        this.formatoimg = formatoimg;
        this.antiguedades = antiguedades;
    }


    // Definiendo los getter y setter de "idgaleria"
    public long getIdgaleria() {
        return idgaleria;
    }
    public void setIdgaleria(long idgaleria) {
        this.idgaleria = idgaleria;
    }

    // Definiendo los getter y setter de "nombregaleriaimg"
    public String getNombregaleriaimg() {
        return nombregaleriaimg;
    }
    public void setNombregaleriaimg(String nombregaleriaimg) {
        this.nombregaleriaimg = nombregaleriaimg;
    }

    // Definiendo los getter y setter de "descripciongaleriaimg"
    public String getDescripciongaleriaimg() {
        return descripciongaleriaimg;
    }
    public void setDescripciongaleriaimg(String descripciongaleriaimg) {
        this.descripciongaleriaimg = descripciongaleriaimg;
    }

    // Definiendo los getter y setter de "url"
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    // Definiendo los getter y setter de "formatoimg"
    public String getFormatoimg() {
        return formatoimg;
    }
    public void setFormatoimg(String formatoimg) {
        this.formatoimg = formatoimg;
    }

    // Definiendo los getter y setter de "antiguedades"
    public Antiguedades getAntiguedades() {
        return antiguedades;
    }
    public void setAntiguedades(Antiguedades antiguedades) {
        this.antiguedades = antiguedades;
    }
}