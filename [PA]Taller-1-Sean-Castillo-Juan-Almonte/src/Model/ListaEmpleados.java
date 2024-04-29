package Model;

import ucn.ArchivoEntrada;
import ucn.Registro;

import java.io.IOException;

public class ListaEmpleados {
    private Empleado[] arregloEmpleado;
    private  int cantidadMaxima;
    private  int cantidadActual;
    private String empleadoActivo;

    /**
     * Constructor de la clase ListaEmpleados
     * @param cantidadMaxima Corresponde a la cantidad maxima que posee la lista
     */
    public ListaEmpleados(int cantidadMaxima){

        this.cantidadMaxima = cantidadMaxima;
        this.arregloEmpleado = new Empleado[this.cantidadMaxima];
        this.cantidadActual = 0;
    }

    /**
     * Método que permite la lectura de archivos
     * @param nombreArchivo Nombre del archivo de texto
     * @throws IOException Excepción para el metodo
     */
    public void lecturaArchivo(String nombreArchivo) throws IOException {
        Empleado Empleado;
        int cont = 0;
        int iteraciones = 0;
        int cantidadAgregada=0;
        String[] linea = new String[500];
        ArchivoEntrada archivoEntrada = new ArchivoEntrada(nombreArchivo);

        while (!archivoEntrada.isEndFile()) {   //misma explicacion dem videoojuegos se aplica aqui

            Registro empleado = archivoEntrada.getRegistro();
            String codigoUnico = empleado.getString();
            String nombre = empleado.getString();

                linea[cont] = codigoUnico;
                linea[cont + 1] = nombre;
                cont=cont+2;
                iteraciones++;
        }
        for (int i = 0; i < iteraciones; i++) {
         this.arregloEmpleado[i]=new Empleado(linea[cantidadAgregada],linea[cantidadAgregada+1]);
            cantidadAgregada=cantidadAgregada+2;
            this.cantidadActual++;
        }
        archivoEntrada.close();
    }
    //Metodos relacionados con el login


    /**
     * Método que permite buscar en la lista para iniciar sesion
     * @param usuario Usuario dentro del archivo de texto
     * @return Retorna la posició del usuario
     * @throws IllegalArgumentException Excepción para la lectura de archivos
     */
    public int buscarEmpleadoUsuario(String usuario) throws IllegalArgumentException {
        for (int i = 0; i < this.cantidadActual; i++) {
                if (this.arregloEmpleado[i].getUsuario().equals(usuario)) {
                    return i;

                }
        }
        return -1;
    }

    /**
     * Método que permite buscar la contraseña en la lista para iniciar sesion
     * @param contrasena Contraseña dentro del archivo de texto
     * @param posicion Posicion especifica en la que se encuentra usuario adyacente a la contraseña
     * @return Retorna la posición de la contraseña
     */
    public int buscarEmpleadoContrasenia(String contrasena,int posicion){
        for (int i = 0; i < cantidadActual; i++) {
            if (this.arregloEmpleado[posicion].getContrasena().equals(contrasena)){       //modifique metodo equals , estaba mal que fuera equalsignorecase por que
                                                                                    //ejemplo: pedro en una contraseña no es lo mismo que PEdro
                return i;
            }
        }
        return -1;
    }


    /**
     * Método que permite obtener la posición dentro de la lista empleado
     * @param posicion Posición de la lista
     * @return Retorna la posición en la lista empleado
     */
    //No se porque se usa esto pero sin el no funca el buscar xd
    public Empleado obtenerPosicion(int posicion){
        return this.arregloEmpleado[posicion];
    }

    /**
     * Método para determinar cual es el empleado que inicio sesión
     * @param empleado Usuario del empleado
     * @return Retorna el empleado activo durante la sesión
     */
    public String EmpleadoActual(String empleado){
       this.empleadoActivo=empleado;
       return this.empleadoActivo;
    }

    /**
     *
     * @return Retorna la lista Empleado
     */
    public Empleado[] getArregloEmpleado() {
        return arregloEmpleado;
    }

    /**
     *
     * @return Retorna la caopaidad maxima del arreglo
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     *
     * @return Retorna la cantidad actual del arreglo
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     *
     * @return Retorna el empleado activo
     */
    public String getEmpleadoActivo() {
        return empleadoActivo;
    }
}
