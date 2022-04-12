/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Datos;

/**
 *
 * @author USER
 */
public class Datos {
    protected String direccion;
    protected int estrato;
    protected String nombre;
    protected int documento;
    
    public Datos ( String direccion, int estrato, String nombre, int documentoTitular ){
        this.direccion = direccion;
        this.estrato = estrato;
        this.nombre = nombre;
        this.documento = documentoTitular;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the estrato
     */
    public int getEstrato() {
        return estrato;
    }

    /**
     * @param estrato the estrato to set
     */
    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the documentoTitular
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * @param documentoTitular the documentoTitular to set
     */
    public void setDocumento(int documentoTitular) {
        this.documento = documentoTitular;
    }
}
