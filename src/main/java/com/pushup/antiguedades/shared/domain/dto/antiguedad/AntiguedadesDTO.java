package com.pushup.antiguedades.shared.domain.dto.antiguedad;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Categorias;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.EpocaAntiguedad;
import com.pushup.antiguedades.shared.domain.entity.empresa.Sucursal;

public class AntiguedadesDTO {
    // Agregando los atributos necesarios
    private Long idantiguedades;
    private String nombreantiguedad;
    private String descripcionantiguedad;
    private LocalDateTime fecharegistro;
    private BigDecimal valorestimado;
    private String estado;
    private int isdisponible;
    private Sucursal sucursal;
    private Categorias categorias;
    private EpocaAntiguedad epocaAntiguedad;
    private LocalDateTime actualizadoen;


    // Creando los constructores de la clase
    public AntiguedadesDTO() {

    }

    public AntiguedadesDTO(
        Long idantiguedades, String nombreantiguedad, String descripcionantiguedad, 
        LocalDateTime fecharegistro, BigDecimal valorestimado, String estado, int isdisponible, 
        Sucursal sucursal, Categorias categorias, EpocaAntiguedad epocaAntiguedad
    ) {
        this.idantiguedades = idantiguedades;
        this.nombreantiguedad = nombreantiguedad;
        this.descripcionantiguedad = descripcionantiguedad;
        this.fecharegistro = fecharegistro;
        this.valorestimado = valorestimado;
        this.estado = estado;
        this.isdisponible = isdisponible;
        this.sucursal = sucursal;
        this.categorias = categorias;
        this.epocaAntiguedad = epocaAntiguedad;
    }


    // Definiendo los getter y setter de "idantiguedades"
    public Long getIdantiguedades() {
        return idantiguedades;
    }
    public void setIdantiguedades(Long idantiguedades) {
        this.idantiguedades = idantiguedades;
    }

    // Definiendo los getter y setter de "nombreantiguedad"
    public String getNombreantiguedad() {
        return nombreantiguedad;
    }
    public void setNombreantiguedad(String nombreantiguedad) {
        this.nombreantiguedad = nombreantiguedad;
    }

    // Definiendo los getter y setter de "descripcion"
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
