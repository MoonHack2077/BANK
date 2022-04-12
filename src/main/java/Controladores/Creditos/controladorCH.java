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
    
    public 
    
    @Override
    double calcularValorCuota(){
        CreditoHipotecario creditoH = this.cB.buscarCreditoH(this.getNumeroContrato());
        int estrato = creditoH.getDomicilio().getEstrato();
        double bonificacion = 1;
        if( estrato<=3 ) bonificacion+= 0.2;
        else bonificacion+= 0.4;
        return 0;
    }
}
