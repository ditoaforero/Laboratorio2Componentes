/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Dito
 */
@ManagedBean(name = "AdminBean")
public class AdminBean {

    /**
     * Creates a new instance of AdminBean
     */
    public AdminBean() {
    }
    
    public String irAdminCatalogo(){
        System.out.println("Llego a irAdminCatalogo");
        return "catalogo.xhtml";
    }
    
    public String irAdminCliente(){
        System.out.println("Llego a irAdminCliente");
        return "cliente.xhtml";
    }
    
    public String irLogin(){
        System.out.println("Llego a irMenuAdmin");
        return "index.xhtml";
    }
}
