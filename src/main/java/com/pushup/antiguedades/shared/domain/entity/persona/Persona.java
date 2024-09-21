package com.pushup.antiguedades.shared.domain.entity.persona;

// Importando las clases y paquetes necesarios
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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class Persona {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idpersona;

    @Column(name = "primernombre", columnDefinition = "VARCHAR(20)", nullable = false)
    @NotBlank(message = "'primernombre no puede estar vacío.")
    @Size(min = 2, max = 20, message = "El primernombre debe tener una longitud de 2 a 20 caracteres.")
    private String primernombre;

    @Column(name = "segundonombre", columnDefinition = "VARCHAR(20)", nullable = true)
    @NotBlank(message = "'segundonombre no puede estar vacío.")
    @Size(min = 2, max = 20, message = "El segundonombre debe tener una longitud de 2 a 20 caracteres.")
    private String segundonombre;

    @Column(name = "primerapellido", columnDefinition = "VARCHAR(20)", nullable = false)
    @NotBlank(message = "'primerapellido no puede estar vacío.")
    @Size(min = 2, max = 20, message = "El primerapellido debe tener una longitud de 2 a 20 caracteres.")
    private String primerapellido;

    @Column(name = "segundoapellido", columnDefinition = "VARCHAR(20)", nullable = true)
    @NotBlank(message = "'segundoapellido no puede estar vacío.")
    @Size(min = 2, max = 20, message = "El segundoapellido debe tener una longitud de 2 a 20 caracteres.")
    private String segundoapellido;

    @Column(name = "edad", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    @NotBlank(message = "'edad' no puede estar vacío.")
    @Min(value = 12, message = "El valor numérico ingresado no puede ser negativo o menor a 12.")
    @Max(value = 200, message = "El valor numérico ingresado no puede ser mayor a 200.")
    private int edad;

    @Column(name = "fechanacimiento", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechanacimiento' no puede ser nulo, ingrese información.")
    private LocalDateTime fechanacimiento;

    @Column(name = "numeroidentificacion", columnDefinition = "BIGINT UNSIGNED", nullable = false)
    @NotBlank(message = "'numeroidentificacion' no puede estar vacío.")
    @Min(value = 1000, message = "El valor numérico ingresado no puede ser negativo o menor a 1000.")
    @Max(value = Integer.MAX_VALUE, message = "El valor numérico ingresado no puede ser mayor a Integer.MAX_VALUE.")
    private int numeroidentificacion;

    @Column(name = "tipoidentidad", columnDefinition = "VARCHAR(15)", nullable = false)
    @NotBlank(message = "'tipoidentidad no puede estar vacío.")
    @Size(min = 3, max = 15, message = "El tipoidentidad debe tener una longitud de 3 a 15 caracteres.")
    private String tipoidentidad;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idgenero", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_genero' no puede ser nulo, ingrese información.")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "idsucursal", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_sucursal' no puede ser nulo, ingrese información.")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "idestadopersona", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_estadopersona' no puede ser nulo, ingrese información.")
    private EstadoPersona estadopersona;


    // Creando los constructores de la clase
    public Persona() {
    
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