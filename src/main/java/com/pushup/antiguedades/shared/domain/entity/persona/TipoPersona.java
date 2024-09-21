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
@Table(name = "tipopersona")
public class TipoPersona {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipopersona", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idtipopersona;

    @Column(name = "nombretipopersona", columnDefinition = "VARCHAR(45)", nullable = false)
    @NotBlank(message = "'nombretipopersona no puede estar vacío.")
    @Size(min = 4, max = 45, message = "El nombretipopersona debe tener una longitud de 4 a 45 caracteres.")
    private String nombretipopersona;


    // Creando los constructores de la clase
    public TipoPersona() {

    }


    // Definiendo los getter y setter de "idtipopersona"
    public long getIdtipopersona() {
        return idtipopersona;
    }
    public void setIdtipopersona(long idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    // Definiendo los getter y setter de "nombretipopersona"
    public String getNombretipopersona() {
        return nombretipopersona;
    }
    public void setNombretipopersona(String nombretipopersona) {
        this.nombretipopersona = nombretipopersona;
    }
}