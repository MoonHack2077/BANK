/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

import Controladores.ControladorBanco;
import Modelos.Creditos.Credito;
import Modelos.Cuota.Cuota;

/**
 *
 * @author USER
 */
public abstract class ControladorCredito {
    protected Cuota[] cuotas;
    protected Credito credito;
    protected double valorSolicitado;
    protected int numeroContrato;
    protected ControladorBanco cB;
    
    public ControladorCredito( Credito credito ){
        this.credito = credito;
        cuotas = credito.getCuotas();
        this.valorSolicitado = credito.getMontoTotal();
        this.numeroContrato = credito.getNumeroDeContrato();
        cB = new ControladorBanco();
    }
    
    
    /**
     * Metodo para calcular el valor total de la cuota
     */
    public abstract double calcularValorCuota();
    
    
    /**
     * Metodo para abonar una cuota
     * @param cuota
     * @return true si se abonó, de lo contrario false
     */
    public boolean abonarCuota(Cuota cuota){
        
        //LOOK OUT THIS PART
        if( cuota.getMontoAbonado() < this.credito.getValorCuota() ) return false;
        
        for (int i = 0; i < cuotas.length; i++) {
            if( cuotas[i] == null ){
                cuotas[i] = cuota;
                return true;
            } 
        }
        
        return false;
    }
    
    /**
     * Metodo para saber la cantidad de cuotas restantes
     * @return la cantidad de cuotas restantes
     */
    public int cuotasRestantes(){
        int contador = 0;
        for (int i = 0; i < cuotas.length; i++) {
            if( cuotas[i] == null ){
                contador++;
            } 
        }
        
        return contador;
    }

    /**
     * @return the cuotas
     */
    public Cuota[] getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(Cuota[] cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * @return the valorSolicitado
     */
    public double getValorSolicitado() {
        return valorSolicitado;
    }

    /**
     * @param valorSolicitado the valorSolicitado to set
     */
    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    /**
     * @return the numeroContrato
     */
    public int getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * @param numeroContrato the numeroContrato to set
     */
    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
}
