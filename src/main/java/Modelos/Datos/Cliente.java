/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Datos;

import Modelos.Creditos.Credito;

/**
 *
 * @author USER
 */
public class Cliente extends DatosClienteDomicilio{
    private Credito credito;
    private boolean creditoActivo;
    private int valorDataCredito;
    private int edad;

    public Cliente( int estrato, 
            String nombre, int documentoTitular, int edad )
    {
        super(estrato, nombre, documentoTitular);
        this.creditoActivo = false;
        this.edad = edad;
    }

    /**
     * @return the valorDataCredito
     */
    public int getValorDataCredito() {
        return valorDataCredito;
    }

    /**
     * @param valorDataCredito the valorDataCredito to set
     */
    public void setValorDataCredito(int valorDataCredito) {
        this.valorDataCredito = valorDataCredito;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the creditoActivo
     */
    public boolean hasCreditoActivo() {
        return creditoActivo;
    }

    /**
     * @param creditoActivo the creditoActivo to set
     */
    public void setCreditoActivo(boolean creditoActivo) {
        this.creditoActivo = creditoActivo;
    }

    /**
     * @return the credito
     */
    public Credito getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}
