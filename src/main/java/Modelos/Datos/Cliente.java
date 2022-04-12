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

    public Cliente( double valorDataCredito, String direccion, int estrato, String nombre, int documentoTitular ){
        super(direccion, estrato, nombre, documentoTitular);
        this.valorDataCredito = valorDataCredito;
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
}
