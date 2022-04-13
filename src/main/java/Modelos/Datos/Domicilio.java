/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Datos;

/**
 *
 * @author USER
 */
public class Domicilio extends Datos {
    protected String direccion;
    private double avaluoComercial;
    
    public Domicilio( double avaluoComercial, String direccion, int estrato, 
            String nombre, int documentoTitular )
    {
        super(estrato, nombre, documentoTitular);
        this.direccion = direccion;
        this.avaluoComercial = avaluoComercial;
    }

    /**
     * @return the avaluoComercial
     */
    public double getAvaluoComercial() {
        return avaluoComercial;
    }

    /**
     * @param avaluoComercial the avaluoComercial to set
     */
    public void setAvaluoComercial(double avaluoComercial) {
        this.avaluoComercial = avaluoComercial;
    }
}
