package Model;

public class Videojuego {
    private String codigoUnico;
    private  String nombre;
    private double precio;
    private  String genero;
    private String  clasificacionEdad;
    private  String compañia;
    private  String plataforma;
    private String generoDescuento;
    private  int descuento;

    /**
     * Constructor de la clase videojuego
     * @param codigoUnico Codigo unico del videojuego
     * @param nombre Nombre del videojuego
     * @param precio Precio del videojuego
     * @param genero Genero del videojuego
     * @param clasificacionEdad Clasificación por edad del videojuego
     * @param compañia Compañia del videojuego
     * @param plataforma Plataforma del videojuego
     */
    public Videojuego(String codigoUnico, String nombre, double precio, String genero, String clasificacionEdad, String compañia, String plataforma) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.clasificacionEdad = clasificacionEdad;
        this.compañia = compañia;
        this.plataforma = plataforma;
    }

    /**
     *
     * @return Retorna el codigo unico del videojuego
     */
    public String getCodigoUnico() {
        return codigoUnico;
    }

    /**
     *
     * @return Retorna el nombre del videojuego
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return Retorna el precio del videojuego
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @return Retorna el genero del videojuego
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @return Retorna la clasificación por edad
     */
    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    /**
     *
     * @return Retorna la compañia del videojuego
     */
    public String getCompañia() {
        return compañia;
    }

    /**
     *
     * @return Retorna la plataforma del videojuego
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     *
     * @return Retorna el descuento del videojuego
     */
    public String getGeneroDescuento() {
        return generoDescuento;
    }

    /**
     *
     * @return Retorna el descuento del videojuego
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     *
     * @param codigoUnico modifica el codigo unico del videojuego
     */
    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    /**
     *
     * @param nombre modifica el nombre del videojuego
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param precio modifica el precio del videojuego
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @param genero modifica el genero del videojuego
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @param clasificacionEdad modifica la clasificación por edad del videojuego
     */
    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    /**
     *
     * @param compañia modifica la compañia del videojuego
     */
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    /**
     *
     * @param plataforma modifica la plataforma del videojuego
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     *
     * @param generoDescuento modifica el descuento por genero del videojuego
     */
    public void setGeneroDescuento(String generoDescuento) {
        this.generoDescuento = generoDescuento;
    }

    /**
     *
     * @param descuento modifica el descuento del videojuego
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
