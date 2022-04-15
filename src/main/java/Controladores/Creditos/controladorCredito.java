/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

import Modelos.Creditos.Credito;
import Modelos.Cuota.Cuota;

/**
 *
 * @author USER
 */
public abstract class ControladorCredito {
    public ControladorCredito( ){
    }
    
    
    /**
     * Metodo para calcular el valor total de la cuota
     */
    public abstract void calcularValorCuota(Credito credito);
    
    
    /**
     * Metodo para abonar una cuota
     * @param cuota
     * @return true si se abonó, de lo contrario false
     */
    public boolean abonarCuota(Credito credito, Cuota cuota){
        int contador = 0;
        Cuota[] cuotas = credito.getCuotas();
        
        for (int i = 0; i < cuotas.length; i++) {
            if( cuotas[i] != null ) contador++;
            
            if( cuotas[i] == null ){
                cuotas[i] = cuota;
                cuotas[i].setNumeroCuota(contador);
                return true;
            } 
        }
        
        return false;
    }
    
    /**
     * Metodo para saber la cantidad de cuotas restantes
     * @return la cantidad de cuotas restantes
     */
    public boolean calcularCuotasRestantes(Credito credito){
        int contadorAbonadas = 0;
        int contadorRestantes = 0;
        Cuota[] cuotas = credito.getCuotas();
        for (int i = 0; i < cuotas.length; i++) {
            if( cuotas[i] == null ) contadorRestantes++;
            else contadorAbonadas++;
        }
        
        if( contadorRestantes==0 ){
            credito.getClienteSolicitante().setCreditoActivo(false);
            credito.getClienteSolicitante().setCredito(null);
            return false;
        }
        credito.setCuotasRestantes(contadorRestantes);
        credito.setCuotasAbonadas(contadorAbonadas);
        return true;
    }

}
