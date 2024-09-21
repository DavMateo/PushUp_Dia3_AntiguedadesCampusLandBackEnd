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
@Table(name = "tipotransaccion")
public class TipoTransaccion {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipotransaccion", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idtipotransaccion;

    @Column(name = "nombretipotransaccion", columnDefinition = "VARCHAR(45)", nullable = false)
    @NotBlank(message = "'nombretipotransaccion no puede estar vacío.")
    @Size(min = 4, max = 45, message = "El nombretipotransaccion debe tener una longitud de 4 a 45 caracteres.")
    private String nombretipotransaccion;


    // Creando los constructores de la clase
    public TipoTransaccion() {
    
    }


    // Definiendo los getter y setter de "idtipotransaccion"
    public long getIdtipotransaccion() {
        return idtipotransaccion;
    }
    public void setIdtipotransaccion(long idtipotransaccion) {
        this.idtipotransaccion = idtipotransaccion;
    }

    // Definiendo los getter y setter de "nombretipotransaccion"
    public String getNombretipotransaccion() {
        return nombretipotransaccion;
    }
    public void setNombretipotransaccion(String nombretipotransaccion) {
        this.nombretipotransaccion = nombretipotransaccion;
    }
}