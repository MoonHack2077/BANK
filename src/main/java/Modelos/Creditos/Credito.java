/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Creditos;

import Modelos.Datos.Cliente;

/**
 *
 * @author USER
 */
public class Credito {
   protected Cliente clienteSolicitante;
   protected int numeroDeContrato;
   protected int cantidadCuotas;
   protected double montoTotal;
   protected double valorCuota;
   
   public Credito( int numeroDeContrato, double montoTotal, int cantidadCuotas, 
           Cliente clienteSolicitante )
   {
    this.numeroDeContrato = numeroDeContrato;
    this.montoTotal = montoTotal;
    this.cantidadCuotas = cantidadCuotas;
    this.valorCuota = montoTotal/cantidadCuotas;
    this.clienteSolicitante = clienteSolicitante;
   }

   
    /**
     * @return the numeroDeContrato
     */
    public int getNumeroDeContrato() {
        return numeroDeContrato;
    }

    /**
     * @param numeroDeContrato the numeroDeContrato to set
     */
    public void setNumeroDeContrato(int numeroDeContrato) {
        this.numeroDeContrato = numeroDeContrato;
    }

    /**
     * @return the montoTotal
     */
    public double getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the cantidadCuotas
     */
    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    /**
     * @param cantidadCuotas the cantidadCuotas to set
     */
    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    /**
     * @return the clienteSolicitante
     */
    public Cliente getClienteSolicitante() {
        return clienteSolicitante;
    }

    /**
     * @param clienteSolicitante the clienteSolicitante to set
     */
    public void setClienteSolicitante(Cliente clienteSolicitante) {
        this.clienteSolicitante = clienteSolicitante;
    }

    /**
     * @return the valorCuota
     */
    public double getValorCuota() {
        return valorCuota;
    }

    /**
     * @param valorCuota the valorCuota to set
     */
    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }
}
