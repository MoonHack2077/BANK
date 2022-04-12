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
    private Cuota[] cuotas;
    private double valorSolicitado;
    private int numeroContrato;
    protected ControladorBanco cB;
    
    public ControladorCredito( Credito credito ){
        cuotas = new Cuota[credito.getCantidadCuotas()];
        this.valorSolicitado = credito.getMontoTotal();
        this.numeroContrato = credito.getNumeroDeContrato();
        cB = new ControladorBanco();
    }
    
    
    /**
     * Metodo para calcular el valor total de la cuota
     */
    public abstract double calcularValorCuota();
    
    
    public boolean pagarCuota(){
        
        
        return false;
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
