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
@Table(name = "genero")
public class Genero {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgenero", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idgenero;

    @Column(name = "sexo", columnDefinition = "CHAR(1)", nullable = false)
    @NotBlank(message = "'sexo no puede estar vacío.")
    @Size(min = 1, max = 1, message = "El sexo debe tener una longitud de 1 a 1 caracteres.")
    private String sexo;


    // Creando los constructores de la clase
    public Genero() {

    }


    // Definiendo los getter y setter de "idgenero"
    public long getIdgenero() {
        return idgenero;
    }
    public void setIdgenero(long idgenero) {
        this.idgenero = idgenero;
    }

    // Definiendo los getter y setter de "sexo"
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}