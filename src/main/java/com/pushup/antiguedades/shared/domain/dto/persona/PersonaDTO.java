package com.pushup.antiguedades.shared.domain.dto.persona;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import com.pushup.antiguedades.shared.domain.entity.empresa.Sucursal;
import com.pushup.antiguedades.shared.domain.entity.persona.EstadoPersona;
import com.pushup.antiguedades.shared.domain.entity.persona.Genero;

public class PersonaDTO {
    // Agregando los atributos necesarios
    private long idpersona;
    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String segundoapellido;
    private int edad;
    private LocalDateTime fechanacimiento;
    private int numeroidentificacion;
    private String tipoidentidad;
    private Genero genero;
    private Sucursal sucursal;
    private EstadoPersona estadopersona;
    
    
    // Creando los constructores de la clase
    public PersonaDTO() {
    
    }
    
    public PersonaDTO(long idpersona, String primernombre, String segundonombre, String primerapellido,
            String segundoapellido, int edad, LocalDateTime fechanacimiento, int numeroidentificacion,
            String tipoidentidad, Genero genero, Sucursal sucursal, EstadoPersona estadopersona) {
        this.idpersona = idpersona;
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.edad = edad;
        this.fechanacimiento = fechanacimiento;
        this.numeroidentificacion = numeroidentificacion;
        this.tipoidentidad = tipoidentidad;
        this.genero = genero;
        this.sucursal = sucursal;
        this.estadopersona = estadopersona;
    }


    // Definiendo los getter y setter de ""
    public long getIdpersona() {
        return idpersona;
    }
    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
    }

    // Definiendo los getter y setter de ""
    public String getPrimernombre() {
        return primernombre;
    }
    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    // Definiendo los getter y setter de ""
    public String getSegundonombre() {
        return segundonombre;
    }
    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    // Definiendo los getter y setter de ""
    public String getPrimerapellido() {
        return primerapellido;
    }
    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    // Definiendo los getter y setter de ""
    public String getSegundoapellido() {
        return segundoapellido;
    }
    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    // Definiendo los getter y setter de ""
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Definiendo los getter y setter de ""
    public LocalDateTime getFechanacimiento() {
        return fechanacimiento;
    }
    public void setFechanacimiento(LocalDateTime fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    // Definiendo los getter y setter de ""
    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }
    public void setNumeroidentificacion(int numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    // Definiendo los getter y setter de ""
    public String getTipoidentidad() {
        return tipoidentidad;
    }
    public void setTipoidentidad(String tipoidentidad) {
        this.tipoidentidad = tipoidentidad;
    }

    // Definiendo los getter y setter de ""
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Definiendo los getter y setter de ""
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    // Definiendo los getter y setter de ""
    public EstadoPersona getEstadopersona() {
        return estadopersona;
    }
    public void setEstadopersona(EstadoPersona estadopersona) {
        this.estadopersona = estadopersona;
    }
}