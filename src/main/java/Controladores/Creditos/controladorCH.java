/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

import Modelos.Creditos.Credito;
import Modelos.Creditos.CreditoHipotecario;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorCH extends ControladorCredito{
    
    private ArrayList<CreditoHipotecario> creditosHipotecarios;
    
    public ControladorCH(){
        creditosHipotecarios = new ArrayList<>();
    }   
    
    /**
     * Metodo para saber si un credito hipotecario ya está almacenado
     * @param numeroContrato
     * @return credito hipotecario si ya esta almacenado, de lo contrario null
     */
    public CreditoHipotecario buscarCreditoH( int numeroContrato ){
        
        for (CreditoHipotecario creditoH : creditosHipotecarios) {
            if( creditoH.getNumeroDeContrato() == numeroContrato ) return creditoH;
        }
        
        return null;
    }
    
    /**
     * Metodo para añadir un credito hipotecario
     * @param creditoH
     * @return true si se añadió, de lo contrario false
     */
    public boolean añadirCreditoH(CreditoHipotecario creditoH){
        CreditoHipotecario aux = buscarCreditoH(creditoH.getNumeroDeContrato());
        
        if( aux == null ){
            creditosHipotecarios.add(creditoH);
            return true;
        }
        
        return false;
    }
    
    /**
     * Metodo para calcular el valor de la cuota del credito Hipotecario
     * @return 
     */
    @Override
    public void calcularValorCuota(Credito credito){
        CreditoHipotecario creditoH = buscarCreditoH(credito.getNumeroDeContrato());
        double valorSolicitado = creditoH.getMontoTotal();
        int estrato = creditoH.getDomicilio().getEstrato();
        double valorTotal = creditoH.getValorCuota();
        
        if( estrato<=3 ){ 
            valorSolicitado = ( valorSolicitado * 1.2 ) / 100;
        }
        else { 
            valorSolicitado = ( valorSolicitado * 1.4 ) / 100;
        }
        valorTotal += valorSolicitado;
        creditoH.setValorCuota(valorTotal);
    }
    
    
    /**
     * @return the creditosHipotecarios
     */
    public ArrayList<CreditoHipotecario> getCreditosHipotecarios() {
        return creditosHipotecarios;
    }
    
}
