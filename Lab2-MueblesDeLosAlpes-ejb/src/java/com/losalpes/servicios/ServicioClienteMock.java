/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dito
 */
public class ServicioClienteMock  implements IServicioCliente{
    
    /**
     * Arreglo con los clientes del sistema
     */
    private List<Cliente> clientes;
    
    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioClienteMock(){
        //Inicializa el arreglo de los muebles
        clientes=new ArrayList<Cliente>();

        //Agrega los clientes del sistema
        clientes.add(new Cliente("CC", 123456789, "Eduardo Arèvalo Forero", 6333812, 31838692, "Calle 1 ·1-1", "Bogota", "Bogota", "Colombia", "Ing. Sistemas", "e.arevalo@uniandes.edu.co", "Natural", "0-0"));
    }
    
     //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    @Override
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
    public List<Cliente> darClientes(){
        return clientes;
    }
    
}
