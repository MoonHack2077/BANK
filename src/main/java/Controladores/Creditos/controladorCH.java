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
public class ControladorCH extends ControladorCredito{
    public ControladorCH( Credito credito ){
        super(credito);
    }
    
    /**
     * Metodo para calcular el valor de la cuota del credito Hipotecario
     * @return 
     */
    @Override
    public void calcularValorCuota(){
        CreditoHipotecario creditoH = this.cB.buscarCreditoH(this.getNumeroContrato());
        double soli = this.getValorSolicitado();
        int estrato = creditoH.getDomicilio().getEstrato();
        double valorTotal = creditoH.getValorCuota();
        
        if( estrato<=3 ){ 
            soli = (soli*1.2)/100;
        }
        else { 
            soli = (soli*1.4)/100;
        }
        valorTotal+=soli;
        creditoH.setValorCuota(valorTotal);
    }
    
}
