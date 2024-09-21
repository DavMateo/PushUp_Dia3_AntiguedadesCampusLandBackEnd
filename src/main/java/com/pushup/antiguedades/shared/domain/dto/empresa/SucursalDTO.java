package com.pushup.antiguedades.shared.domain.dto.empresa;

// Importando las clases y paquetes necesarios
import com.pushup.antiguedades.shared.domain.entity.empresa.Empresa;
import com.pushup.antiguedades.shared.domain.entity.localizacion.Ciudades;

public class SucursalDTO {
    // Agregando los atributos necesarios
    private long idsucursal;
    private String nombresucursal;
    private int isprincipal;
    private Empresa empresa;
    private Ciudades ciudades;


    // Creando los constructores de la clase
    public SucursalDTO() {

    }

    public SucursalDTO(
        long idsucursal, String nombresucursal, int isprincipal, 
        Empresa empresa, Ciudades ciudades
    ) {
        this.idsucursal = idsucursal;
        this.nombresucursal = nombresucursal;
        this.isprincipal = isprincipal;
        this.empresa = empresa;
        this.ciudades = ciudades;
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