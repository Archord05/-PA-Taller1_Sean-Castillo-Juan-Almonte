package Model;
import ucn.ArchivoEntrada;
import ucn.Registro;

import java.io.IOException;

public class ListaVideojuego {
    private Videojuego[] arregloVideojuego;
    private  int cantidadMaxima;
    private  int cantidadActual;
    private String descuentoAleatorio;
    private  String ventaVidejuego;
    private  int cantidadMaximaVentas;
    private  int cantidadActualDeDatosVendidos;

    /**
     * Constructor de la clase ListaVideojuego
     * @param cantidadMaxima Corresponde a la cantidad maxima que posee la lista
     */
    public ListaVideojuego(int cantidadMaxima) {
       if(cantidadMaxima<=0){
           throw new IllegalArgumentException("La cantidad no puede ser cero");
       }
        this.cantidadMaxima = cantidadMaxima;
        this.arregloVideojuego=new Videojuego[this.cantidadMaxima];
        this.cantidadActual =0;
    }

    //Verificar la lectura de archivos principalmente la forma de ingresar los mismos


    /**
     * Método que permite la lectura de archivos
     * @param nombreArchivo Nombre del archivo de texto
     * @throws IOException Excepción para el método
     */
     public void lecturaArchivo(String nombreArchivo) throws IOException {
         // creamos un arreglo con una excesiva cantidad para que no se llene el arreglo
         // declaramos el archivo entrada
     ArchivoEntrada archivoEntrada = new ArchivoEntrada(nombreArchivo);

     while (!archivoEntrada.isEndFile()) {

         //creamos enl registro para poder extraer datos
         Registro Videojuego=archivoEntrada.getRegistro();
         String codigoUnico = Videojuego.getString();
         String nombre=Videojuego.getString();
         //sacamaos el precio como double del programa
         double precio =Videojuego.getDouble();
         String genero = Videojuego.getString();
         String compañia= Videojuego.getString();
         String clasificacionEdad =Videojuego.getString();
         String plataforma = Videojuego.getString();

         Videojuego juego = new Videojuego(codigoUnico,nombre, precio, genero, compañia, clasificacionEdad,plataforma);
         this.agregarVideojuego(juego);

     }
     archivoEntrada.close();
     }

    /**
     * Método que permite buscar un videojuego dentro de la lista via el codigo
     * @param codigoUnico Codigo unico del videojuego
     * @return Retorna la posicion del codigo unico
     */
    public int BuscarVideojuegoCodigo(String codigoUnico){

        for (int i = 0; i < this.cantidadActual; i++) {
            if (this.arregloVideojuego[i].getCodigoUnico().equals(codigoUnico)){
                return i;

            }
        }
        return -1;
    }

    /**
     * Método que permite buscar un videojuego dentro de la lista via el nombre
     * @param nombre Nombre del videojuego
     * @return Retorna la posición del nombre
     */
    public int BuscarVideojuegoNombre(String nombre){
           for (int i = 0; i < cantidadActual; i++) {
            if (this.arregloVideojuego[i].getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que permite obtener la posición dentro de la lista videojuego
     * @param posicion Posicion de la lista
     * @return Retorna la posicion de la lista videojuego
     */
    //Retorna la posicion dentro de la lista para su posterior uso en el main.
    //Try and catch para la validación del dato ingresado
    public Videojuego obtenerPosicionVideojuego(int posicion){
        try {
            return this.arregloVideojuego[posicion];
        }catch (Exception ArrayIndexOutOfBoundsException){
            System.out.println("Ingrese correctamente el nombre del videojuego porfavor");
        }
        return null;
    }

    /**
     *
     * @return Retorna la lista videojuego
     */
    public Videojuego[] getArregloVideojuego() {
        return arregloVideojuego;
    }

    /**
     *
     * @return Retorna la cantidad maxima de la lista
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     *
     * @return Retorna la cantidad actual de la lista
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Método que permite agregar un videojuego a la lista
     * @param juego Juego el cual se agregara
     * @return Retorna un booleano que indica si se logro agregar
     */
    public boolean agregarVideojuego(Videojuego juego){
        if (cantidadMaxima == cantidadActual) {
            return false;
        }

        for (int i = 0; i < this.cantidadActual; i++) {

            if (this.arregloVideojuego[i].getCodigoUnico().equalsIgnoreCase(juego.getCodigoUnico())) {
                return false;
            }
        }

        this.arregloVideojuego[cantidadActual] = juego;
        cantidadActual++;
        return true;
    }


    /**
     * Método vacio para la selección aletoria de un genero dentro de la lista
     */
    public void GeneradorDeDescuento(){
       String[] arreglodescuento=new String[this.cantidadMaxima];
       double numeroAleatorio=0;
       int numeroadevolver=0;

        for (int i = 0; i < this.cantidadActual; i++) {

            arreglodescuento[i]=(this.arregloVideojuego[i].getGenero());

            }
        numeroAleatorio=Math.random()*this.cantidadActual;
        numeroadevolver= (int) numeroAleatorio;
        this.descuentoAleatorio=arreglodescuento[numeroadevolver];
    }


    /**
     *
     * @return Retorna el genero aletorio seleccionado
     */
    public String getDescuentoAleatorio() {
        return descuentoAleatorio;
    }
}
