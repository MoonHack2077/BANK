/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.Creditos;

/**
 *
 * @author USER
 */
public abstract class controladorCredito {
    protected double valorCuota;
    
    public controladorCredito(){
        this.valorCuota = 0;
    }
    
    /**
     * Metodo para calcular el valor total de la cuota
     */
    public abstract void calcularValorCuota();
}
