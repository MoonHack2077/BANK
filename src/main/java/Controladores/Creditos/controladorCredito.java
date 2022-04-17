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
    public ControladorCredito( ){}
       
    /**
     * Metodo para calcular el valor total de la cuota
     * @param credito
     */
    public abstract void calcularValorCuota(Credito credito);
    
    
    /**
     * Metodo para abonar una cuota
     * @param credito, cuota
     * @return true si se abonó, de lo contrario false
     */
    public boolean abonarCuota(Credito credito, Cuota cuota){
        int contador = 1;
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
     * @param credito
     * @return true si aun faltan cuotas, de lo contrario false
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

    /**
     * Metodo para recopilar la info de las cuotas abonadas
     * @param credito
     * @return Un String con los datos de las cuotas abonadas
     */
    public String obtenerCuotasAbonadas(Credito credito){
        Cuota[] cuotas = credito.getCuotas();
        String infoCuotas = "";
        for (int i = 0; i < cuotas.length; i++) {
            if(cuotas[i] != null){
                infoCuotas += 
            "Numero de cuota: "+ String.valueOf(cuotas[i].getNumeroCuota())+ "\n" +
            "Fecha de cancelacion: "+ cuotas[i].getFechaCancelacion().toString()+ "\n" +
            "Valor de la cuota: "+String.valueOf(credito.getValorCuota())+ "\n" +
            "Monto abonado: "+ String.valueOf(cuotas[i].getMontoAbonado())+ "\n\n\n";
            }
        }
        
        return infoCuotas;
    }
}
