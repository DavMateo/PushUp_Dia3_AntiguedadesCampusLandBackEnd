package com.pushup.antiguedades.shared.domain.dto.localizacion;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.localizacion.TipoDireccion;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;

public class DireccionPersonaDTO {
    // Agregando los atributos necesarios
    private long iddireccionpersona;
    private String tipovia;
    private String nombrevia;
    private String numeroresidencia;
    private String pisoapartamento;
    private String indicacionesadicionales;
    private TipoDireccion tipodireccion;
    private Persona persona;

    
    // Creando los constructores de la clase
    public DireccionPersonaDTO() {
        
    }

    public DireccionPersonaDTO(
        long iddireccionpersona, String tipovia, String nombrevia, String numeroresidencia,
        String pisoapartamento, String indicacionesadicionales, TipoDireccion tipodireccion, 
        Persona persona
    ) {
        this.iddireccionpersona = iddireccionpersona;
        this.tipovia = tipovia;
        this.nombrevia = nombrevia;
        this.numeroresidencia = numeroresidencia;
        this.pisoapartamento = pisoapartamento;
        this.indicacionesadicionales = indicacionesadicionales;
        this.tipodireccion = tipodireccion;
        this.persona = persona;
    }
    

    // Definiendo los getter y setter de "iddireccionpersona"
    public long getIddireccionpersona() {
        return iddireccionpersona;
    }
    public void setIddireccionpersona(long iddireccionpersona) {
        this.iddireccionpersona = iddireccionpersona;
    }

    // Definiendo los getter y setter de "tipovia"
    public String getTipovia() {
        return tipovia;
    }
    public void setTipovia(String tipovia) {
        this.tipovia = tipovia;
    }

    // Definiendo los getter y setter de "nombrevia"
    public String getNombrevia() {
        return nombrevia;
    }
    public void setNombrevia(String nombrevia) {
        this.nombrevia = nombrevia;
    }

    // Definiendo los getter y setter de "numeroresidencia"
    public String getNumeroresidencia() {
        return numeroresidencia;
    }
    public void setNumeroresidencia(String numeroresidencia) {
        this.numeroresidencia = numeroresidencia;
    }

    // Definiendo los getter y setter de "pisoapartamento"
    public String getPisoapartamento() {
        return pisoapartamento;
    }
    public void setPisoapartamento(String pisoapartamento) {
        this.pisoapartamento = pisoapartamento;
    }

    // Definiendo los getter y setter de "indicacionesadicionales"
    public String getIndicacionesadicionales() {
        return indicacionesadicionales;
    }
    public void setIndicacionesadicionales(String indicacionesadicionales) {
        this.indicacionesadicionales = indicacionesadicionales;
    }

    // Definiendo los getter y setter de "tipodireccion"
    public TipoDireccion getTipodireccion() {
        return tipodireccion;
    }
    public void setTipodireccion(TipoDireccion tipodireccion) {
        this.tipodireccion = tipodireccion;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}