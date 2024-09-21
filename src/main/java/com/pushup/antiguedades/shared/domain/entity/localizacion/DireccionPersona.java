package com.pushup.antiguedades.shared.domain.entity.localizacion;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;
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
@Table(name = "direccionpersona")
public class DireccionPersona {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccionpersona", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long iddireccionpersona;

    @Column(name = "tipovia", columnDefinition = "VARCHAR(40)", nullable = false)
    @NotBlank(message = "'tipovia no puede estar vacío.")
    @Size(min = 2, max = 40, message = "El tipovia debe tener una longitud de 2 a 40 caracteres.")
    private String tipovia;

    @Column(name = "nombrevia", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message = "'nombrevia no puede estar vacío.")
    @Size(min = 5, max = 100, message = "El nombrevia debe tener una longitud de 5 a 100 caracteres.")
    private String nombrevia;

    @Column(name = "numeroresidencia", columnDefinition = "VARCHAR(20)", nullable = false)
    @NotBlank(message = "'numeroresidencia no puede estar vacío.")
    @Size(min = 2, max = 20, message = "El numeroresidencia debe tener una longitud de 2 a 20 caracteres.")
    private String numeroresidencia;

    @Column(name = "pisoapartamento", columnDefinition = "VARCHAR(15)", nullable = false)
    @NotBlank(message = "'pisoapartamento no puede estar vacío.")
    @Size(min = 2, max = 15, message = "El pisoapartamento debe tener una longitud de 2 a 15 caracteres.")
    private String pisoapartamento;

    @Column(name = "indicacionesadicionales", columnDefinition = "VARCHAR(255)", nullable = true)
    @NotBlank(message = "'indicacionesadicionales no puede estar vacío.")
    @Size(min = 4, max = 255, message = "El indicacionesadicionales debe tener una longitud de 4 a 255 caracteres.")
    private String indicacionesadicionales;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idtipodireccion", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_tipodireccion' no puede ser nulo, ingrese información.")
    private TipoDireccion tipodireccion;

    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;


    // Creando los constructores de la clase
    public DireccionPersona() {

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