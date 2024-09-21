package com.pushup.antiguedades.shared.domain.dto.antiguedad;

public class CategoriasDTO {
    // Agregando los atributos necesarios
    private long idcategorias;
    private String nombrecategoria;
    private String descripcioncategoria;


    // Creando los constructores de la clase
    public CategoriasDTO() {

    }

    public CategoriasDTO(long idcategorias, String nombrecategoria, String descripcioncategoria) {
        this.idcategorias = idcategorias;
        this.nombrecategoria = nombrecategoria;
        this.descripcioncategoria = descripcioncategoria;
    }


    // Definiendo los getter y setter de "idcategorias"
    public long getIdcategorias() {
        return idcategorias;
    }
    public void setIdcategorias(long idcategorias) {
        this.idcategorias = idcategorias;
    }

    // Definiendo los getter y setter de "nombrecategoria"
    public String getNombrecategoria() {
        return nombrecategoria;
    }
    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    // Definiendo los getter y setter de "descripcioncategoria"
    public String getDescripcioncategoria() {
        return descripcioncategoria;
    }
    public void setDescripcioncategoria(String descripcioncategoria) {
        this.descripcioncategoria = descripcioncategoria;
    }
}