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
    private boolean creditoActivo;
    private int valorDataCredito;
    private int edad;

    public Cliente( int valorDataCredito, String direccion, int estrato, 
            String nombre, int documentoTitular, int edad )
    {
        super(direccion, estrato, nombre, documentoTitular);
        this.valorDataCredito = valorDataCredito;
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
