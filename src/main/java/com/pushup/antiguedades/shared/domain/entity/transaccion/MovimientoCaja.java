package com.pushup.antiguedades.shared.domain.entity.transaccion;

// Importando las clases y paquetes necesarios
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "movimientocaja")
public class MovimientoCaja {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimientocaja", columnDefinition = "INT UNSIGNED", unique = true, nullable = false)
    private long idmovimientocaja;

    @Column(name = "fechamovimiento", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'fechamovimiento' no puede ser nulo, ingrese información.")
    private LocalDateTime fechamovimiento;

    @Column(name = "montototal", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotBlank(message = "'montototal' no puede estar vacío.")
    @DecimalMin(value = "0.01", inclusive = true, message = "El montototal debe ser mayor o igual a 0.01.")
    @DecimalMax(value = "100000000.0", inclusive = true, message = "El montototal debe tener un máximo de 10 dígitos enteros y 2 dígitos decimales.")
    private BigDecimal montototal;

    @Column(name = "ispagohibrido", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    @NotBlank(message = "'ispagohibrido' no puede estar vacío.")
    @Min(value = 0, message = "El valor numérico ingresado no puede ser negativo o menor a 0.")
    @Max(value = 1, message = "El valor numérico ingresado no puede ser mayor a 1.")
    private int ispagohibrido;

    // Agregando las llaves Forágneas
    @ManyToOne
    @JoinColumn(name = "idestacionpago", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_estacionpago' no puede ser nulo, ingrese información.")
    private EstacionPago estacionpago;

    @ManyToOne
    @JoinColumn(name = "idtipomovimientocaja", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_tipomovimientocaja' no puede ser nulo, ingrese información.")
    private TipoMovimientoCaja tipomovimientocaja;


    // Creando los constructores de la clase
    public MovimientoCaja() {
    
    }


    // Definiendo los getter y setter de "idmovimientocaja"
    public long getIdmovimientocaja() {
        return idmovimientocaja;
    }
    public void setIdmovimientocaja(long idmovimientocaja) {
        this.idmovimientocaja = idmovimientocaja;
    }

    // Definiendo los getter y setter de "fechamovimiento"
    public LocalDateTime getFechamovimiento() {
        return fechamovimiento;
    }
    public void setFechamovimiento(LocalDateTime fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }

    // Definiendo los getter y setter de "montototal"
    public BigDecimal getMontototal() {
        return montototal;
    }
    public void setMontototal(BigDecimal montototal) {
        this.montototal = montototal;
    }

    // Definiendo los getter y setter de "ispagohibrido"
    public int getIspagohibrido() {
        return ispagohibrido;
    }
    public void setIspagohibrido(int ispagohibrido) {
        this.ispagohibrido = ispagohibrido;
    }

    // Definiendo los getter y setter de "estacionpago"
    public EstacionPago getEstacionpago() {
        return estacionpago;
    }
    public void setEstacionpago(EstacionPago estacionpago) {
        this.estacionpago = estacionpago;
    }

    // Definiendo los getter y setter de "tipomovimientocaja"
    public TipoMovimientoCaja getTipomovimientocaja() {
        return tipomovimientocaja;
    }
    public void setTipomovimientocaja(TipoMovimientoCaja tipomovimientocaja) {
        this.tipomovimientocaja = tipomovimientocaja;
    }
}