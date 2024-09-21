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
@Table(name = "epocaantiguedad")
public class EpocaAntiguedad {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idepocaantiguedad", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idepocaantiguedad;

    @Column(name = "nombreepocaantiguedad", columnDefinition = "VARCHAR(50)", nullable = false)
    @NotBlank(message = "'nombre_epoca_antiguedad' no puede estar vacío.")
    @Size(min = 5, max = 50, message = "El nombre_epoca_antiguedad debe tener una longitud de 5 a 50 caracteres.")
    private String nombreepocaantiguedad;

    @Column(name = "periodoinicio", columnDefinition = "VARCHAR(16)", nullable = true)
    @NotBlank(message = "'periodo_inicio no puede estar vacío.")
    @Size(min = 4, max = 16, message = "El periodo_inicio debe tener una longitud de 4 a 16 caracteres.")
    private String periodoinicio;

    @Column(name = "periodofin", columnDefinition = "VARCHAR(16)", nullable = true)
    @NotBlank(message = "'periodo_fin no puede estar vacío.")
    @Size(min = 4, max = 16, message = "El periodo_fin debe tener una longitud de 4 a 16 caracteres.")
    private String periodofin;


    // Creando los constructores de la clase
    public EpocaAntiguedad() {

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