/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Datos;

/**
 *
 * @author USER
 */
public class Cliente extends Datos{
    private double valorDataCredito;
    private int edad;
    private boolean creditoActivo;

    public Cliente( double valorDataCredito, String direccion, int estrato, 
            String nombre, int documentoTitular, boolean creditoActivo, int edad )
    {
        super(direccion, estrato, nombre, documentoTitular);
        this.valorDataCredito = valorDataCredito;
        this.creditoActivo = creditoActivo;
        this.edad = edad;
    }

    /**
     * @return the valorDataCredito
     */
    public double getValorDataCredito() {
        return valorDataCredito;
    }

    /**
     * @param valorDataCredito the valorDataCredito to set
     */
    public void setValorDataCredito(double valorDataCredito) {
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
    public boolean isCreditoActivo() {
        return creditoActivo;
    }

    /**
     * @param creditoActivo the creditoActivo to set
     */
    public void setCreditoActivo(boolean creditoActivo) {
        this.creditoActivo = creditoActivo;
    }
}
