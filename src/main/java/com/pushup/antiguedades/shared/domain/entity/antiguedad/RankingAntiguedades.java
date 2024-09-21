package com.pushup.antiguedades.shared.domain.entity.antiguedad;

// Importando las clases y paquetes necesarios
import java.math.BigInteger;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "rankingantiguedades")
public class RankingAntiguedades {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrankingantiguedades", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idrankingantiguedades;

    @Column(name = "cantvisitas", columnDefinition = "BIGINT UNSIGNED", nullable = false)
    @NotBlank(message = "'cant_visitas' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo.")
    @Max(value = Integer.MAX_VALUE)
    private BigInteger cantvisitas;

    @Column(name = "cantconsultas", columnDefinition = "BIGINT UNSIGNED", nullable = false)
    @NotBlank(message = "'cant_consultas' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo.")
    @Max(value = Integer.MAX_VALUE)
    private BigInteger cantonsultas;

    @Column(name = "nombrerankingantiguedades", columnDefinition = "VARCHAR(50)", nullable = false)
    @NotBlank(message = "'nombre_ranking_antiguedades' no puede estar vacío.")
    @Size(min = 2, max = 50, message = "El nombre_ranking_antiguedades debe tener una longitud de 2 a 50 caracteres.")
    private String nombrerankingantiguedades;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idantiguedades", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_antiguedades' no puede ser nulo, ingrese información.")
    private Antiguedades antiguedades;


    // Creando los constructores de la clase
    public RankingAntiguedades() {

    }


    // Definiendo los getter y setter de "idrankingantiguedades"
    public long getIdrankingantiguedades() {
        return idrankingantiguedades;
    }
    public void setIdrankingantiguedades(long idrankingantiguedades) {
        this.idrankingantiguedades = idrankingantiguedades;
    }

    // Definiendo los getter y setter de "cantvisitas"
    public BigInteger getCantvisitas() {
        return cantvisitas;
    }
    public void setCantvisitas(BigInteger cantvisitas) {
        this.cantvisitas = cantvisitas;
    }

    // Definiendo los getter y setter de "cantonsultas"
    public BigInteger getCantonsultas() {
        return cantonsultas;
    }
    public void setCantonsultas(BigInteger cantonsultas) {
        this.cantonsultas = cantonsultas;
    }

    // Definiendo los getter y setter de "nombrerankingantiguedades"
    public String getNombrerankingantiguedades() {
        return nombrerankingantiguedades;
    }
    public void setNombrerankingantiguedades(String nombrerankingantiguedades) {
        this.nombrerankingantiguedades = nombrerankingantiguedades;
    }

    // Definiendo los getter y setter de "antiguedades"
    public Antiguedades getAntiguedades() {
        return antiguedades;
    }
    public void setAntiguedades(Antiguedades antiguedades) {
        this.antiguedades = antiguedades;
    }   
}