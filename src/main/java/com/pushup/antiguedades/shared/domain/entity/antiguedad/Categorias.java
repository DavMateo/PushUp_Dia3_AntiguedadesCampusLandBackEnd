package com.pushup.antiguedades.shared.domain.entity.antiguedad;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "categorias")
public class Categorias {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategorias", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idcategorias;

    @Column(name = "nombrecategoria", columnDefinition = "VARCHAR(50)", nullable = false)
    @NotBlank(message = "'nombre_categoria' no puede estar vacío.")
    @Size(min = 4, max = 50, message = "El nombre debe tener una longitud de 4 a 50 caracteres.")
    private String nombrecategoria;

    @Column(name = "descripcioncategoria", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "'descripcion_categoria' no puede estar vacío.")
    @Size(min = 20, max = 1000, message = "El nombre debe tener una longitud de 20 a 1000 caracteres.")
    private String descripcioncategoria;


    // Creando los constructores de la clase
    public Categorias() {

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