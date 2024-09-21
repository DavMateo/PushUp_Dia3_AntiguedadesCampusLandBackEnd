package com.pushup.antiguedades.shared.domain.entity.empresa;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.localizacion.Ciudades;
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
@Table(name = "sucursal")
public class Sucursal {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsucursal", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idsucursal;

    @Column(name = "nombresucursal", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message = "'nombresucursal no puede estar vacío.")
    @Size(min = 4, max = 100, message = "El nombresucursal debe tener una longitud de 4 a 100 caracteres.")
    private String nombresucursal;

    @Column(name = "isprincipal", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    @NotBlank(message = "'isprincipal' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo o menor a 0.")
    @Max(value = 1, message = "El valor numérico ingresado no puede ser mayor a 1.")
    private int isprincipal;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idempresa", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_empresa' no puede ser nulo, ingrese información.")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "idciudades", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_ciudades' no puede ser nulo, ingrese información.")
    private Ciudades ciudades;


    // Creando los constructores de la clase
    public Sucursal() {

    }


    // Definiendo los getter y setter de "idsucursal"
    public long getIdsucursal() {
        return idsucursal;
    }
    public void setIdsucursal(long idsucursal) {
        this.idsucursal = idsucursal;
    }

    // Definiendo los getter y setter de "nombresucursal"
    public String getNombresucursal() {
        return nombresucursal;
    }
    public void setNombresucursal(String nombresucursal) {
        this.nombresucursal = nombresucursal;
    }

    // Definiendo los getter y setter de "isprincipal"
    public int getIsprincipal() {
        return isprincipal;
    }
    public void setIsprincipal(int isprincipal) {
        this.isprincipal = isprincipal;
    }

    // Definiendo los getter y setter de "empresa"
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // Definiendo los getter y setter de "ciudades"
    public Ciudades getCiudades() {
        return ciudades;
    }
    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }
}