/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Creditos;

import Modelos.Datos.Cliente;
import Modelos.Datos.Domicilio;
import java.util.Date;

/**
 *
 * @author USER
 */
public class CreditoHipotecario extends Credito {
    private Date fechaDeSolicitud;
    private Domicilio domicilio;
    
    public CreditoHipotecario(int numeroDeContrato, double montoTotal, int cantidadCuotas, 
            Cliente clienteSolicitante, Date fechaDeSolicitud, Domicilio domicilio, String tipo )
    {
        super(numeroDeContrato, montoTotal, cantidadCuotas, clienteSolicitante, tipo);
        this.fechaDeSolicitud = fechaDeSolicitud;
        this.domicilio = domicilio;
    }
    
    /**
     * @return the fechaDeSolicitud
     */
    public Date getFechaDeSolicitud() {
        return fechaDeSolicitud;
    }

    /**
     * @param fechaDeSolicitud the fechaDeSolicitud to set
     */
    public void setFechaDeSolicitud(Date fechaDeSolicitud) {
        this.fechaDeSolicitud = fechaDeSolicitud;
    }

    /**
     * @return the domicilio
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
