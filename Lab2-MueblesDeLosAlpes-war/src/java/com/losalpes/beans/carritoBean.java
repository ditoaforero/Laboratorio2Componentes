/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CatalogoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import com.losalpes.servicios.IServicioCarrito;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.ServicioCarritoMock;
import com.losalpes.servicios.ServicioCatalogoMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;


/**
 * Managed bean encargado del catálogo de carrito en el sistema
 * 
 */
@ManagedBean
public class carritoBean
{
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo mueble a ingresar
     */
    private Mueble mueble;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioCatalogo catalogo;
    private IServicioCarrito  catalogoCarrito;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public carritoBean()
    {
        mueble = new Mueble();
        catalogo = new ServicioCatalogoMock();
        catalogoCarrito  = new ServicioCarritoMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve el objeto mueble
     * @return mueble Objeto mueble
     */
    public Mueble getMueble()
    {
        return mueble;
    }

    /**
     * Modifica el objeto mueble
     * @param mueble Nuevo mueble
     */
    public void setMueble(Mueble mueble)
    {
        this.mueble = mueble;
    }

    /**
     * Devuelve una lista con todos los muebles del sistema
     * @return muebles Muebles del sistema
     */
    public List<Mueble> getMuebles()
    {
        return catalogo.darMuebles();
    }
    
    
     /**
     * Devuelve una lista con todos los muebles del sistema
     * @return muebles Muebles del sistema
     */
    public List<Mueble> getCarritos()
    {
        return catalogoCarrito.darMuebles();
    }
    
    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    /**
     * Devuelve los tipos de muebles
     * @return sitems Tipos de muebles en el sistema
     */
    public SelectItem[] getTiposMuebles()
    {
        TipoMueble[] tipos=  TipoMueble.values();
        SelectItem[] sitems = new SelectItem[tipos.length];
        
        for (int i = 0; i < sitems.length; i++)
        {
             sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }
    
    /**
     * Funcion para ir a la pantalla de login
    */
    public String irLogin(){
        System.out.println("Llego a irMenuAdmin");
        return "index.xhtml";
    }

    /**
     * Agrega un nuevo mueble al carrito
    */
    public void comprar(Mueble mueble){
      //  clientes.eliminarCliente(clienteEliminar);
      //  cliente=new Cliente();
    }
}
