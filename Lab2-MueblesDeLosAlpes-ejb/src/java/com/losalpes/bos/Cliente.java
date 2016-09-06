/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author Dito
 */
public class Cliente {
    
    private String tipoDocumento;
    private int numeroDocumento;
    private String nombreCompleto;
    private int telefonoResidencia;
    private long telefonoCelular;
    private String direccion;
    private String ciudadResidencia;
    private String departamento;
    private String pais;
    private String profesion;
    private String email;
    private String tipoCliente;  //Juridica o natural
    private String nit;

    public Cliente() {
    }

    
    public Cliente(String tipoDocumento, int numeroDocumento, String nombreCompleto, int telefonoResidencia, long telefonoCelular, String direccion, String ciudadResidencia, String departamento, String pais, String profesion, String email, String tipoCliente, String nit) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.telefonoResidencia = telefonoResidencia;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
        this.departamento = departamento;
        this.pais = pais;
        this.profesion = profesion;
        this.email = email;
        this.tipoCliente = tipoCliente;
        this.nit = nit;
    }
    
    

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getTelefonoResidencia() {
        return telefonoResidencia;
    }

    public void setTelefonoResidencia(int telefonoResidencia) {
        this.telefonoResidencia = telefonoResidencia;
    }

    public long getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(long telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
            
    
}
