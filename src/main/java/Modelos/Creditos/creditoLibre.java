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
public class CreditoLibre extends Credito {
    private int valorDataCredito;
    
    public CreditoLibre(int numeroDeContrato, double montoTotal, int cantidadCuotas, 
            Cliente clienteSolicitante, String tipo ){
        super(numeroDeContrato, montoTotal, cantidadCuotas, clienteSolicitante, tipo);
        this.valorDataCredito = clienteSolicitante.getValorDataCredito();
    }

    /**
     * @return the valorDataCredito
     */
    public int getValorDataCredito() {
        return valorDataCredito;
    }

    /**
     * @param valorDataCredito the valorDataCredito to set
     */
    public void setValorDataCredito(int valorDataCredito) {
        this.valorDataCredito = valorDataCredito;
    }
}
