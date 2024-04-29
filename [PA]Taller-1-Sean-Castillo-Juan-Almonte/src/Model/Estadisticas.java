package Model;

import ucn.StdOut;

public class Estadisticas {
    private String videojuegoIngresado;
    private String plataforma;
    private String ClientePremium;
    private double dineroRecaudado;
    private String trabajadorConMasVentas;
    private double comision;

    private int videojuegoMasVendido;

    /**
     * Constructor de la clase Estadisticas
     * @param videojuegoIngresado Videojuego Ingresado para la compra
     * @param plataforma Plataforma del videojuego ingresado para la compra
     * @param clientePremium Cliente premium verificado y registrado
     * @param dineroRecaudado Dinero recaudado por las ventas
     * @param trabajadorConMasVentas Trabajador con mas ventas mientras el programa esta activo
     * @param comision Comisión del 2% por venta para el trabajador
     */
    public Estadisticas(String videojuegoIngresado,String plataforma, String clientePremium, double dineroRecaudado, String trabajadorConMasVentas, double comision) {
        this.videojuegoIngresado = videojuegoIngresado;
        this.plataforma=plataforma;
        this.ClientePremium = clientePremium;
        this.dineroRecaudado = dineroRecaudado;
        this.trabajadorConMasVentas = trabajadorConMasVentas;
        this.comision = comision;
    }

    /**
     *
     * @return Retorna el videojuego ingresado para la compra
     */
    public String getVideojuegoIngresado() {
        return videojuegoIngresado;
    }

    /**
     *
     * @return Retorna el clientre premium registrado
     */
    public String getClientePremium() {
        return ClientePremium;
    }

    /**
     *
     * @return Retorna el dinero recaudado por las ventas
     */
    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    /**
     *
     * @return Retorna el trabajador con mas ventas mientras el programa esta activo
     */
    public String getTrabajadorConMasVentas() {
        return trabajadorConMasVentas;
    }

    /**
     *
     * @return Retorna la comisión del 2% por venta para el trabajador
     */
    public double getComision() {
        return comision;
    }

    /**
     *
     * @return Retorna la plataforma del videojuego ingresado para la compra
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     *
     * @return Retorna el videojuego mas vendido
     */
    public int getVideojuegoMasVendido() {
        return videojuegoMasVendido;
    }
}
