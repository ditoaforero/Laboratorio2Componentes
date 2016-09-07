/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioCatalogoMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementacion de los servicios del catalogo de muebles que se le prestan al sistema. [Mock Object]
 * 
 */

public class ServicioCarritoMock implements IServicioCarrito
{
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los muebles del sistema
     */
    private ArrayList<Mueble> carritos;
   

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioCarritoMock()
    {

        //Inicializa el arreglo  de los muebles comprados
        carritos=new ArrayList<Mueble>();

        //Agrega los muebles comprados del sistema
        carritos.add(new Mueble("RF1","Silla clásica","Una confortable silla con estilo del siglo XIX.",TipoMueble.Interior));
        carritos.add(new Mueble("RF2","Silla moderna","Lo último en la moda de interiores. Esta silla le brindará la comodidad e innovación que busca",TipoMueble.Interior));
      
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    @Override
    public void agregarMueble(Mueble mueble)
    {
        carritos.add(mueble);
    }

    /**
     * Devuelve los muebles del sistema
     * @return muebles Arreglo con todos los muebles del sistema
     */
    @Override
    public List<Mueble> darMuebles()
    {
        return carritos;
    }

}
