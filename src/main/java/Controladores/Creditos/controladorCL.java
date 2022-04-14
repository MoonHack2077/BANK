/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

import Modelos.Creditos.Credito;
import Modelos.Creditos.CreditoLibre;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ControladorCL extends ControladorCredito {

  
    private ArrayList<CreditoLibre> creditosLibres;
    
    public ControladorCL(){
        creditosLibres = new ArrayList<>();
    }
    
    /**
     * Metodo para saber si un credito de libre inversion ya está almacenado
     * @param numeroContrato
     * @return credito de libre inversion si ya esta almacenado, de lo contrario null
     */
    public CreditoLibre buscarCreditoL( int numeroContrato ){
        
        for (CreditoLibre creditoL : creditosLibres) {
            if( creditoL.getNumeroDeContrato() == numeroContrato ) return creditoL;
        }
        
        return null;
    }
    
    /**
     * Metodo para añadir un credito libre
     * @param creditoL
     * @return true si se añadió, de lo contrario false
     */
    public boolean añadirCreditoL(CreditoLibre creditoL){
        CreditoLibre aux = buscarCreditoL(creditoL.getNumeroDeContrato());
        
        if( aux == null ){
            creditosLibres.add(creditoL);
            return true;
        }
        
        return false;
    }
    
    
    /**
     * Metodo para calcular el valor de la cuota del credito de libre expresion
     * @return 
     */
    @Override
    public void calcularValorCuota(Credito credito){
        CreditoLibre creditoL = buscarCreditoL(credito.getNumeroDeContrato());
        double soli = creditoL.getMontoTotal();
        int valorData = creditoL.getValorDataCredito();
        double valorTotal = creditoL.getValorCuota();
        
        if( valorData>=250 && valorData<=320 ){ 
            soli= (soli*1.6)/100;
        }
        else soli= (soli*1.9)/100;
        
        valorTotal+=soli;
        creditoL.setValorCuota(valorTotal);
    }

    /**
     * @return the creditosLibres
     */
    public ArrayList<CreditoLibre> getCreditosLibres() {
        return creditosLibres;
    }

    /**
     * @param creditosLibres the creditosLibres to set
     */
    public void setCreditosLibres(ArrayList<CreditoLibre> creditosLibres) {
        this.creditosLibres = creditosLibres;
    }
    
}
