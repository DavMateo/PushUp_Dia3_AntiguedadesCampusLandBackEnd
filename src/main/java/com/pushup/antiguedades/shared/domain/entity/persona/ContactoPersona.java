package com.pushup.antiguedades.shared.domain.entity.persona;

// Importando las clases y paquetes necesarios
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
@Table(name = "contactopersona")
public class ContactoPersona {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontactopersona", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idcontactopersona;

    @Column(name = "emailUsername", columnDefinition = "VARCHAR(40)", nullable = false)
    @NotBlank(message = "'emailUsername no puede estar vacío.")
    @Size(min = 2, max = 40, message = "El emailUsername debe tener una longitud de 2 a 40 caracteres.")
    private String emailUsername;

    @Column(name = "emailDominio", columnDefinition = "VARCHAR(30)", nullable = false)
    @NotBlank(message = "'emailDominio no puede estar vacío.")
    @Size(min = 4, max = 30, message = "El emailDominio debe tener una longitud de 4 a 30 caracteres.")
    private String emailDominio;

    @Column(name = "numerocelular", columnDefinition = "BIGINT UNSIGNED", nullable = false)
    @NotBlank(message = "'numerocelular' no puede estar vacío.")
    @Min(value = 4, message = "El valor numérico ingresado no puede ser negativo o menor a 4.")
    @Max(value = 22, message = "El valor numérico ingresado no puede ser mayor a 22.")
    private int numerocelular;

    @Column(name = "numerotelefonofijo", columnDefinition = "BIGINT UNSIGNED", nullable = true)
    @NotBlank(message = "'numerotelefonofijo' no puede estar vacío.")
    @Min(value = 4, message = "El valor numérico ingresado no puede ser negativo o menor a 4.")
    @Max(value = 14, message = "El valor numérico ingresado no puede ser mayor a 14.")
    private int numerotelefonofijo;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idclasecontacto", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_clasecontacto' no puede ser nulo, ingrese información.")
    private ClaseContacto clasecontacto;

    @ManyToOne
    @JoinColumn(name = "idpersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_persona' no puede ser nulo, ingrese información.")
    private Persona persona;


    // Creando los constructores de la clase
    public ContactoPersona() {

    }


    // Definiendo los getter y setter de "idcontactopersona"
    public long getIdcontactopersona() {
        return idcontactopersona;
    }
    public void setIdcontactopersona(long idcontactopersona) {
        this.idcontactopersona = idcontactopersona;
    }

    // Definiendo los getter y setter de "emailUsername"
    public String getEmailUsername() {
        return emailUsername;
    }
    public void setEmailUsername(String emailUsername) {
        this.emailUsername = emailUsername;
    }

    // Definiendo los getter y setter de "emailDominio"
    public String getEmailDominio() {
        return emailDominio;
    }
    public void setEmailDominio(String emailDominio) {
        this.emailDominio = emailDominio;
    }

    // Definiendo los getter y setter de "numerocelular"
    public int getNumerocelular() {
        return numerocelular;
    }
    public void setNumerocelular(int numerocelular) {
        this.numerocelular = numerocelular;
    }

    // Definiendo los getter y setter de "numerotelefonofijo"
    public int getNumerotelefonofijo() {
        return numerotelefonofijo;
    }
    public void setNumerotelefonofijo(int numerotelefonofijo) {
        this.numerotelefonofijo = numerotelefonofijo;
    }

    // Definiendo los getter y setter de "clasecontacto"
    public ClaseContacto getClasecontacto() {
        return clasecontacto;
    }
    public void setClasecontacto(ClaseContacto clasecontacto) {
        this.clasecontacto = clasecontacto;
    }

    // Definiendo los getter y setter de "persona"
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}