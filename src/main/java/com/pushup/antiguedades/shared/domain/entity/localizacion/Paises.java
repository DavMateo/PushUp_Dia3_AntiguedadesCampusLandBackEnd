package com.pushup.antiguedades.shared.domain.entity.localizacion;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "paises")
public class Paises {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaises", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idpaises;

    @Column(name = "nombrepais", columnDefinition = "VARCHAR(45)", nullable = false)
    @NotBlank(message = "'nombrepais no puede estar vacío.")
    @Size(min = 2, max = 45, message = "El nombrepais debe tener una longitud de 2 a 45 caracteres.")
    private String nombrepais;

    @Column(name = "sufijo", columnDefinition = "CHAR(3)", nullable = false)
    @NotBlank(message = "'sufijo no puede estar vacío.")
    @Size(min = 1, max = 3, message = "El sufijo debe tener una longitud de 1 a 3 caracteres.")
    private String sufijo;

    @Column(name = "prefijo", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    @NotBlank(message = "'prefijo' no puede estar vacío.")
    @Min(value = 1, message = "El valor numérico ingresado no puede ser negativo o menor a 1.")
    @Max(value = 3, message = "El valor numérico ingresado no puede ser mayor a 3.")
    private int prefijo;


    // Creando los constructores de la clase
    public Paises() {

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