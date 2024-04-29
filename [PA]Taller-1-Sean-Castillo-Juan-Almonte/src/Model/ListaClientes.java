package Model;

import ucn.StdOut;

public class ListaClientes {
    private Cliente[] arregloClientes;
    private  int cantidadMaxima;
    private  int cantidadActual;

    /**
     * Constructor de la clase ListaClientes
     * @param cantidadMaxima Corresponde a la cantidad maxima que tendra la lista
     */
    public ListaClientes(int cantidadMaxima){

        this.cantidadMaxima = cantidadMaxima;
        this.arregloClientes = new Cliente[this.cantidadMaxima];
        this.cantidadActual = 0;
    }

    /**
     * Método que permite agregar un nuevo cliente registrado a la lista
     * @param cliente Nuevo cliente
     * @return Retorna un booleano que indica si se logro agregar al cliente
     */
   public  boolean agregarClientes(Cliente cliente) {
       if (this.cantidadActual == 0) {
           this.arregloClientes[0] = cliente;
           this.cantidadActual++;
           return true;
       }
       this.arregloClientes[cantidadActual] = cliente;
       this.cantidadActual++;
       return true;
   }

    /**
     * Método que permite validar si el cliente ya esta registrado o presente en la lista
     * @param rut Rut del cliente
     * @return Retorna un booleano que indica si el cliente existe o no dentro de la lista
     */
   public boolean validacion(String rut){
       for (int i = 0; i < cantidadActual; i++) {
           if (this.arregloClientes[i].getRut().equalsIgnoreCase(rut)) {
               StdOut.println("El cliente ya existe en el registro");
               return false;
           }
       }
        return true;

   }

    /**
     * Método que permite buscar un cliente dentro de la lista
     * @param rut Rut del cliente
     * @return Retorna la posición del cliente
     */
    public int buscarCliente(String rut){
        for (int i = 0; i < cantidadActual; i++) {
            if (this.arregloClientes[i].getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que permite obtener la posición dentro de la lista clientes
     * @param posicion Posición de la lista
     * @return Retorna la posición de la lista clientes
     */
    public Cliente obtenerPosicionCliente(int posicion){
        return this.arregloClientes[posicion];
    }

    /**
     *
     * @return retorna la lista clientes
     */
    public Cliente[] getArregloClientes() {
        return arregloClientes;
    }

    /**
     *
     * @return retorna la cantidad maxima de la lista
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     *
     * @return retorna la cantidad actual de la lista
     */
    public int getCantidadActual() {
        return cantidadActual;
    }


}
