/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Creditos;

import Modelos.Datos.Cliente;
import java.util.Date;

/**
 *
 * @author USER
 */
public class creditoHipotecario extends Credito {
    private Date fechaDeSolicitud;
    
    public creditoHipotecario(int numeroDeContrato, double montoTotal, int cantidadCuotas, Cliente clienteSolicitante, Date fechaDeSolicitud ){
        super(numeroDeContrato, montoTotal, cantidadCuotas, clienteSolicitante);
        this.fechaDeSolicitud = fechaDeSolicitud;
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
}
