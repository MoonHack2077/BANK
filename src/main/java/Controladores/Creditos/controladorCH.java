/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

import Modelos.Creditos.Credito;
import Modelos.Creditos.CreditoHipotecario;

/**
 *
 * @author USER
 */
public abstract class ControladorCH extends ControladorCredito{
    public ControladorCH( Credito credito ){
        super(credito);

    }
    
    @Override
    public double calcularValorCuota(){
        CreditoHipotecario creditoH = this.cB.buscarCreditoH(this.getNumeroContrato());
        int estrato = creditoH.getDomicilio().getEstrato();
        double valorTotal = creditoH.getValorCuota();
        
        if( estrato<=3 ) valorTotal+= 0.2;
        else valorTotal+= 0.4;
        
        creditoH.setValorCuota(valorTotal);
        
        return valorTotal;
    }
}
