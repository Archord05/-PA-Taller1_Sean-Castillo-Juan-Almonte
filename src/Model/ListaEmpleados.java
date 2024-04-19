package Model;

import Model.Empleado;

public class ListaEmpleados {
    private Empleado[] arregloEmpleado;
    private  int cantidadMaxima;
    private  int cantidadMinima;

    public ListaEmpleados(Empleado[] arregloEmpleado, int cantidadMaxima, int cantidadMinima) {
        this.arregloEmpleado = arregloEmpleado;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadMinima = cantidadMinima;
    }

    public Empleado[] getArregloEmpleado() {
        return arregloEmpleado;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }
}
