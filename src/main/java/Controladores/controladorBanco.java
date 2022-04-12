/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Creditos.creditoHipotecario;
import Modelos.Creditos.creditoLibre;
import Modelos.Datos.Cliente;
import Modelos.Datos.Domicilio;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class controladorBanco {
    private ArrayList<creditoHipotecario> creditosHipotecarios;
    private ArrayList<creditoLibre> creditosLibres;
    private ArrayList<Cliente> clientes;
    private ArrayList<Domicilio> domicilios;
    
    public controladorBanco(){
        creditosHipotecarios = new ArrayList<>();
        creditosLibres = new ArrayList<>();
        clientes = new ArrayList<>();
        domicilios = new ArrayList<>();
    }

    
    /************** CRUD DE CLIENTES ***************/
    
    /**
     * Metodo para saber si un cliente ya está almacenado
     * @param documento
     * @return cliente si ya esta almacenado, de lo contrario null
     */
    public Cliente buscarCliente( int documento ){
        
        for (Cliente cliente : clientes) {
            if( cliente.getDocumento() == documento ) return cliente;
        }
        
        return null;
    }
    
    /**
     * Metodo para añadir un cliente
     * @param cliente
     * @return true si se añadió, de lo contrario false
     */
    public boolean añadirCliente(Cliente cliente){
        Cliente aux = buscarCliente(cliente.getDocumento());
        
        if( aux == null ){
             clientes.add(cliente);
             return true;
        }
        
        return false;
    }
    
    
    /**
     * Metodo para eliminar un cliente almacenado
     * @param documento
     * @return true si se eliminó, de lo contrario false
     */
    public boolean eliminarCliente( int documento ){
        Cliente aux = buscarCliente(documento);
        
        if( aux != null ){
            for (int i = 0; i < clientes.size(); i++) {
                if( clientes.get(i).getDocumento() == documento ){
                    clientes.remove(i);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Metodo para editar la informacion de un cliente almacenado
     * @param documento
     * @return true si se editó, de lo contrario false
     */
    public boolean editarCliente( Cliente cliente ){
        Cliente aux = buscarCliente(cliente.getDocumento());
        
        if( aux != null ){
            for (int i = 0; i < clientes.size(); i++) {
                if( clientes.get(i).getDocumento() == cliente.getDocumento() ){
                    
                    //El valor de data credito debe ser un valor entre 250 y 400
                    if( cliente.getValorDataCredito()<250 || cliente.getValorDataCredito()>400 ) return false;
                    
                    //Inyectando los nuevos valores
                    clientes.get(i).setDireccion(cliente.getDireccion());
                    clientes.get(i).setEstrato(cliente.getEstrato());
                    clientes.get(i).setNombre(cliente.getNombre());
                    clientes.get(i).setValorDataCredito(cliente.getValorDataCredito());
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**************** GETTERS *******************/
    
    /**
     * @return the creditosHipotecarios
     */
    public ArrayList<creditoHipotecario> getCreditosHipotecarios() {
        return creditosHipotecarios;
    }

    /**
     * @return the creditosLibres
     */
    public ArrayList<creditoLibre> getCreditosLibres() {
        return creditosLibres;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @return the domicilios
     */
    public ArrayList<Domicilio> getDomicilios() {
        return domicilios;
    }
}
