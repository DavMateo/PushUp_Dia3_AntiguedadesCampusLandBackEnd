package com.pushup.antiguedades.shared.domain.entity.persona;

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
@Table(name = "clasecontacto")
public class ClaseContacto {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclasecontacto", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idclasecontacto;

    @Column(name = "nombre", columnDefinition = "VARCHAR(35)", nullable = false)
    @NotBlank(message = "'nombre no puede estar vacío.")
    @Size(min = 3, max = 35, message = "El nombre debe tener una longitud de 3 a 35 caracteres.")
    private String nombre;


    // Creando los constructores de la clase
    public ClaseContacto() {
        
    }


    // Definiendo los getter y setter de "idclasecontacto"
    public long getIdclasecontacto() {
        return idclasecontacto;
    }
    public void setIdclasecontacto(long idclasecontacto) {
        this.idclasecontacto = idclasecontacto;
    }

    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}