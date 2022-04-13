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
    
    /**
     * Metodo para calcular el valor de la cuota del credito de libre expresion
     * @return 
     */
    @Override
    public double calcularValorCuota(){
        CreditoLibre creditoL = this.cB.buscarCreditoL(this.getNumeroContrato());
        double soli = this.getValorSolicitado();
        int valorData = creditoL.getValorDataCredito();
        double valorTotal = creditoL.getValorCuota();
        
        if( valorData>=250 && valorData<=320 ){ 
            soli= (soli*1.6)/100;
        }
        else soli= (soli*1.9)/100;
        
        valorTotal+=soli;
        creditoL.setValorCuota(valorTotal);
        return valorTotal;
    }
    
}
