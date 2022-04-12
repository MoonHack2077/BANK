/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

import Modelos.Creditos.Credito;
import Modelos.Creditos.CreditoLibre;

/**
 *
 * @author USER
 */
public abstract class ControladorCL extends ControladorCredito {

  
    public ControladorCL(Credito credito ){
        super(credito);
    }
    
    @Override
    public double calcularValorCuota(){
        CreditoLibre creditoL = this.cB.buscarCreditoL(this.getNumeroContrato());
        int valorData = creditoL.getValorDataCredito();
        double valorTotal = creditoL.getValorCuota();
        if( valorData>=250 && valorData<=320 ) valorTotal+= 1.6;
        else valorTotal+= 1.9;
        creditoL.setValorCuota(valorTotal);
        return valorTotal;
    }
    
}
