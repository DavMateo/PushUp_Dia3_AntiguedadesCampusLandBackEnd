package com.pushup.antiguedades.shared.domain.dto.persona;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.persona.ClaseContacto;
import com.pushup.antiguedades.shared.domain.entity.persona.Persona;

public class ContactoPersonaDTO {
    // Agregando los atributos necesarios
    private long idcontactopersona;
    private String emailUsername;
    private String emailDominio;
    private int numerocelular;
    private int numerotelefonofijo;
    private ClaseContacto clasecontacto;
    private Persona persona;


    // Creando los constructores de la clase
    public ContactoPersonaDTO() {

    }

    public ContactoPersonaDTO(
        long idcontactopersona, String emailUsername, String emailDominio, int numerocelular,
        int numerotelefonofijo, ClaseContacto clasecontacto, Persona persona
    ) {
        this.idcontactopersona = idcontactopersona;
        this.emailUsername = emailUsername;
        this.emailDominio = emailDominio;
        this.numerocelular = numerocelular;
        this.numerotelefonofijo = numerotelefonofijo;
        this.clasecontacto = clasecontacto;
        this.persona = persona;
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