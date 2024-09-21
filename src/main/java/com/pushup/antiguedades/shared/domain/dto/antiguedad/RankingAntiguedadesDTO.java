package com.pushup.antiguedades.shared.domain.dto.antiguedad;

// Importando las clases y paquetes necesarios
import java.math.BigInteger;
import com.pushup.antiguedades.shared.domain.entity.antiguedad.Antiguedades;

public class RankingAntiguedadesDTO {
    // Agregando los atributos necesarios
    private long idrankingantiguedades;
    private BigInteger cantvisitas;
    private BigInteger cantconsultas;
    private String nombrerankingantiguedades;
    private Antiguedades antiguedades;
    
    
    // Creando los constructores de la clase
    public RankingAntiguedadesDTO() {

    }

    public RankingAntiguedadesDTO(
        long idrankingantiguedades, BigInteger cantvisitas, BigInteger cantconsultas,
        String nombrerankingantiguedades, Antiguedades antiguedades
    ) {
        this.idrankingantiguedades = idrankingantiguedades;
        this.cantvisitas = cantvisitas;
        this.cantconsultas = cantconsultas;
        this.nombrerankingantiguedades = nombrerankingantiguedades;
        this.antiguedades = antiguedades;
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

    // Definiendo los getter y setter de "cantconsultas"
    public BigInteger getCantconsultas() {
        return cantconsultas;
    }
    public void setCantconsultas(BigInteger cantconsultas) {
        this.cantconsultas = cantconsultas;
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