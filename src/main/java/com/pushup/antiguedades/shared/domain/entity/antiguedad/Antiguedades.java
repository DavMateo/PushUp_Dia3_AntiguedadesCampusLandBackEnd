package com.pushup.antiguedades.shared.domain.entity.antiguedad;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.empresa.Sucursal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "antiguedades")
public class Antiguedades {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idantiguedades", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idantiguedades;

    @Column(name = "nombreantiguedad", columnDefinition = "VARCHAR(150)", nullable = false)
    @NotBlank(message = "'nombre' no puede estar vacío.")
    @Size(min = 4, max = 150, message = "El nombre debe tener una longitud de 4 a 150 caracteres.")
    private String nombreantiguedad;

    @Column(name = "descripcionantiguedad", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "'descripcion_antiguedad' no puede estar vacío.")
    @Size(min = 14, max = 1000, message = "La descripción debe tener una longitud de 14 a 1000 caracteres.")
    private String descripcionantiguedad;

    @Column(name = "fecharegistro", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fecha_registro' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permiten fechas futuras.")
    private LocalDateTime fecharegistro;

    @Column(name = "valorestimado", columnDefinition = "DECIMAL(10,2) UNSIGNED", nullable = false)
    @NotBlank(message = "'valor_estimado' no puede estar vacío.")
    @DecimalMin(value = "0.0", inclusive = true, message = "El valor_estimado debe ser mayor o igual a 0.0")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El valor_estimado debe ser menor o igual a 100000000.0")
    @Digits(integer = 9, fraction = 2, message = "El valor_estimado debe tener máximo 9 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal valorestimado;

    @Column(name = "estado", columnDefinition= "VARCHAR(30)", nullable = false)
    @NotBlank(message = "'estado' no puede estar vacío.")
    @Size(min = 2, max = 30, message = "El estado debe tener una longitud de 2 a 30 caracteres.")
    private String estado;

    @Column(name = "isdisponible", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    @NotBlank(message = "'is_disponible' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativa.")
    @Max(value = 2, message = "El valor numérico ingresado no puede ser mayor a 2.")
    private int isdisponible;

    @Column(name = "actualizadoen", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizadoen' no puede ser nulo, ingrese información.")
    private LocalDateTime actualizadoen;

    
    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idsucursal", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_sucursal' no puede ser nulo, ingrese información.")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "idcategorias", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_categorias' no puede ser nulo, ingrese información.")
    private Categorias categorias;

    @ManyToOne
    @JoinColumn(name = "idepocaantiguedad", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_epoca_antiguedad' no puede ser nulo, ingrese información.")
    private EpocaAntiguedad epocaAntiguedad;


    // Creando los constructores de la clase
    public Antiguedades() {

    }


    // Definiendo los getter y setter de "idantiguedades"
    public long getIdantiguedades() {
        return idantiguedades;
    }
    public void setIdantiguedades(long idantiguedades) {
        this.idantiguedades = idantiguedades;
    }

    // Definiendo los getter y setter de "nombreantiguedad"
    public String getNombreantiguedad() {
        return nombreantiguedad;
    }
    public void setNombreantiguedad(String nombreantiguedad) {
        this.nombreantiguedad = nombreantiguedad;
    }

    // Definiendo los getter y setter de "descripcionantiguedad"
    public String getDescripcionantiguedad() {
        return descripcionantiguedad;
    }
    public void setDescripcionantiguedad(String descripcionantiguedad) {
        this.descripcionantiguedad = descripcionantiguedad;
    }

    // Definiendo los getter y setter de "fecharegistro"
    public LocalDateTime getFecharegistro() {
        return fecharegistro;
    }
    public void setFecharegistro(LocalDateTime fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    // Definiendo los getter y setter de "actualizadoen"
    public LocalDateTime getActualizadoen() {
        return actualizadoen;
    }
    public void setActualizadoen(LocalDateTime actualizadoen) {
        this.actualizadoen = actualizadoen;
    }

    // Definiendo los getter y setter de "valorestimado"
    public BigDecimal getValorestimado() {
        return valorestimado;
    }
    public void setValorestimado(BigDecimal valorestimado) {
        this.valorestimado = valorestimado;
    }

    // Definiendo los getter y setter de "estado"
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Definiendo los getter y setter de "isdisponible"
    public int getIsdisponible() {
        return isdisponible;
    }
    public void setIsdisponible(int isdisponible) {
        this.isdisponible = isdisponible;
    }

    // Definiendo los getter y setter de "sucursal"
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    // Definiendo los getter y setter de "categorias"
    public Categorias getCategorias() {
        return categorias;
    }
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    // Definiendo los getter y setter de "epocaAntiguedad"
    public EpocaAntiguedad getEpocaAntiguedad() {
        return epocaAntiguedad;
    }
    public void setEpocaAntiguedad(EpocaAntiguedad epocaAntiguedad) {
        this.epocaAntiguedad = epocaAntiguedad;
    }
}