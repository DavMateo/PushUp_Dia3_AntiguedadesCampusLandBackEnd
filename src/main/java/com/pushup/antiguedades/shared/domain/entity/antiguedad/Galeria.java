package com.pushup.antiguedades.shared.domain.entity.antiguedad;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "galeria")
public class Galeria {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgaleria", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idgaleria;

    @Column(name = "nombregaleriaimg", columnDefinition = "VARCHAR(45)", nullable = false)
    @NotBlank(message = "'nombre_galeria_img' no puede estar vacío.")
    @Size(min = 4, max = 45, message = "El nombre_galeria_img debe tener una longitud de 4 a 45 caracteres.")
    private String nombregaleriaimg;

    @Column(name = "descripciongaleriaimg", columnDefinition = "VARCHAR(255)", nullable = true)
    @NotBlank(message = "'descripcion_galeria_img' no puede estar vacío.")
    @Size(min = 14, max = 255, message = "El descripcion_galeria_img debe tener una longitud de 14 a 255 caracteres.")
    private String descripciongaleriaimg;

    @Column(name = "url", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'url' no puede estar vacío.")
    @Size(min= 10, max = 255, message = "La url debe tener una longitud de 10 a 255 caracteres.")
    private String url;

    @Column(name = "formatoimg", columnDefinition = "CHAR(10)", nullable = false)
    @NotBlank(message = "'formato_img' no puede estar vacío.")
    @Size(min = 2, max = 10, message = "El formato_img debe tener una longitud de 2 a 10 caracteres.")
    private String formatoimg;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idantiguedades", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_antiguedades' no puede ser nulo, ingrese información.")
    private Antiguedades antiguedades;


    // Creando los constructores de la clase
    public Galeria() {

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