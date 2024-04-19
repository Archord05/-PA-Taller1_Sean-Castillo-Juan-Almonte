package Services;

import ucn.StdIn;
import ucn.StdOut;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    configuracion();

        }


        public static void configuracion(){
        menu();

        menuPrincipal();
    }
    public static void menu(){
        boolean llave=true;

        while (llave) {
            StdOut.println("*******************************");
            StdOut.println("Bienvenido al sistema de ventas");
            StdOut.println("*******************************");
            StdOut.println("Identificate");
            StdOut.println("*******************************");
            StdOut.println("1-Iniciar Sesión");
            StdOut.println("2-Cerrar Programa");

          String opcion= StdIn.readLine();
            switch (opcion){

                case "1":menuPrincipal();
                case "2":llave=false;
                default:StdOut.println("Ingrese opcion valida");
            }
        }
    }

    public static void menuPrincipal(){
        boolean llave2=true;

        while (llave2) {
            StdOut.println("*******************************");
            StdOut.println("Menu Principal");
            StdOut.println("Ingrese su opción");
            StdOut.println("1)vender videojuego");
            StdOut.println("2)Buscar Model.Videojuego");
            StdOut.println("3)Menú estadisticas");
            StdOut.println("4)cerrar sesion");

            String opcion= StdIn.readLine();
            switch (opcion){


               // case "1":vendervideojuegos();
               // case "2":buscarvideojuegos
                case "3":menuEstadisticas();
                case "4":menu();
                default:StdOut.println("Ingrese opcion valida");
            }
        }

    }
    public static void menuEstadisticas(){
        boolean llave3=true;

        while (llave3) {
            StdOut.println("*******************************");
            StdOut.println("Menu Estadisticas");
            StdOut.println("Ingrese su opción");
            StdOut.println("1)Model.Videojuego más vendido");
            StdOut.println("2)Plataforma con mayor ventas");
            StdOut.println("3)Ventas a clientes registrados");
            StdOut.println("4)Imprimir ventas totales");
            StdOut.println("4)Trabajador con mas ventas");
            StdOut.println("4)menú anterior");

        }
    }
    }
