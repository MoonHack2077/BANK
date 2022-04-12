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
   protected int numeroDeContrato;
   protected double montoTotal;
   protected int cantidadCuotas;
   protected double valorCuota;
   protected Cliente clienteSolicitante;
   
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
}
