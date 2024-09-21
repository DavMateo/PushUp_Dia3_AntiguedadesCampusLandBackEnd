package com.pushup.antiguedades.shared.domain.entity.transaccion;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tipomovimientocaja")
public class TipoMovimientoCaja {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipomovimientocaja", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idtipomovimientocaja;

    @Column(name = "nombretipomovimiento", columnDefinition = "VARCHAR(45)", nullable = false)
    @NotBlank(message = "'nombretipomovimiento no puede estar vacío.")
    @Size(min = 4, max = 45, message = "El nombretipomovimiento debe tener una longitud de 4 a 45 caracteres.")
    private String nombretipomovimiento;


    // Creando los constructores de la clase
    public TipoMovimientoCaja() {
        
    }


    // Definiendo los getter y setter de "idtipomovimientocaja"
    public long getIdtipomovimientocaja() {
        return idtipomovimientocaja;
    }
    public void setIdtipomovimientocaja(long idtipomovimientocaja) {
        this.idtipomovimientocaja = idtipomovimientocaja;
    }

    // Definiendo los getter y setter de "nombretipomovimiento"
    public String getNombretipomovimiento() {
        return nombretipomovimiento;
    }
    public void setNombretipomovimiento(String nombretipomovimiento) {
        this.nombretipomovimiento = nombretipomovimiento;
    }
}