/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Creditos;

import Modelos.Datos.Cliente;

/**
 *
 * @author USER
 */
public class creditoLibre extends Credito {
    private double valorDataCredito;
    
    public creditoLibre(int numeroDeContrato, double montoTotal, int cantidadCuotas, Cliente clienteSolicitante ){
        super(numeroDeContrato, montoTotal, cantidadCuotas, clienteSolicitante);
        this.valorDataCredito = clienteSolicitante.getValorDataCredito();
    }

    /**
     * @return the valorDataCredito
     */
    public double getValorDataCredito() {
        return valorDataCredito;
    }

    /**
     * @param valorDataCredito the valorDataCredito to set
     */
    public void setValorDataCredito(double valorDataCredito) {
        this.valorDataCredito = valorDataCredito;
    }
}
