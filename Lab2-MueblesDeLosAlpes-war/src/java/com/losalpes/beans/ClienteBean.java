/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.ServicioClienteMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Dito
 */
@ManagedBean(name = "ClienteBean")
@RequestScoped
public class ClienteBean {

    private Cliente cliente;
    
    private IServicioCliente clientes;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
        cliente = new Cliente();
        clientes=new ServicioClienteMock();
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    /**
     * Devuelve una lista con todos los muebles del sistema
     * @return muebles Muebles del sistema
     */
    public List<Cliente> getClientes(){
        return clientes.darClientes();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo mueble al sistema
     */
    public void agregarCliente(){
        clientes.agregarCliente(cliente);
        cliente=new Cliente();
    }

    /**
     * Elimina la información del mueble
     */
    public void limpiar(){
        cliente=new Cliente();
    }

    public String irMenuAdmin(){
        System.out.println("Llego a irMenuAdmin");
        return "menu-administrador.xhtml";
    }
}
