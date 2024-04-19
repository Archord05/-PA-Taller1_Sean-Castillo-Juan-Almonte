package Model;

public class ListaVideojuego {
    private Videojuego[] arregloVideojuego;
    private  int cantidadMaxima;
    private  int cantidadMinima;

    public ListaVideojuego(int cantidadMaxima) {
       if(cantidadMaxima<=0){
           throw new IllegalArgumentException("La cantidad no puede ser cero");
       }
        this.cantidadMaxima = cantidadMaxima;
        this.arregloVideojuego=new Videojuego[this.cantidadMaxima];
        this.cantidadMinima=0;
    }

    public Videojuego[] getArregloVideojuego() {
        return arregloVideojuego;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }
}
