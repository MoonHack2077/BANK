/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Cuota;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Cuota {
    private double montoAbonado;
    private int numeroCuota;
    private Date fechaCancelacion;
    
    public Cuota(Date fechaCancelacion, double monto){
        this.fechaCancelacion = fechaCancelacion;
        this.montoAbonado = monto;
    }

    /**
     * @return the fechaCancelacion
     */
    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    /**
     * @param fechaCancelacion the fechaCancelacion to set
     */
    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    /**
     * @return the numeroCuota
     */
    public int getNumeroCuota() {
        return numeroCuota;
    }

    /**
     * @param numeroCuota the numeroCuota to set
     */
    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    /**
     * @return the monto
     */
    public double getMontoAbonado() {
        return montoAbonado;
    }

    /**
     * @param monto the monto to set
     */
    public void setMontoAbonado(double montoAbonado) {
        this.montoAbonado = montoAbonado;
    }
}
