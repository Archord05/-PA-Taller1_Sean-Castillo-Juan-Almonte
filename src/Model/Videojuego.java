package Model;

public class Videojuego {
    private String codigoUnico;
    private  String nombre;
    private Double precio;
    private  String genero;
    private int clasificacionEdad;
    private  String plataforma;
    private String generoDescuento;
    private  int descuento;

    public Videojuego(String codigoUnico,String nombre, Double precio,String genero, int clasificacionEdad, String plataforma, String generoDescuento, int descuento) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.clasificacionEdad = clasificacionEdad;
        this.plataforma = plataforma;
        this.generoDescuento = generoDescuento;
        this.descuento = descuento;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getGenero() {
        return genero;
    }

    public int getClasificacionEdad() {
        return clasificacionEdad;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGeneroDescuento() {
        return generoDescuento;
    }

    public int getDescuento() {
        return descuento;
    }
}
