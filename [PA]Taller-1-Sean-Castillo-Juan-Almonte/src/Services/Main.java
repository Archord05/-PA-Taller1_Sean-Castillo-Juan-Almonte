package Services;
import Model.*;
import ucn.StdIn;
import ucn.StdOut;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
    configuracion();
        }

        public static void configuracion() throws IOException {

        //Los datos son fijos bajo los criterios del enunciado por ende no es necesario preguntar por el tamaño

        ListaEmpleados datosEmpleados= new ListaEmpleados(30);
        ListaVideojuego datosVideojuego = new ListaVideojuego(30);
        ListaClientes datosClientes = new ListaClientes(30);
        ListaEstadisticas datosEstadisticas=new ListaEstadisticas(999);

             String Archivo1=("Juegos.txt");
            String Archivo2=("Trabajadores.txt");
        datosVideojuego.lecturaArchivo(Archivo1);
        datosEmpleados.lecturaArchivo(Archivo2);
        datosVideojuego.GeneradorDeDescuento();
            menu(datosEmpleados, datosVideojuego, datosClientes,datosEstadisticas);
        datosVideojuego.GeneradorDeDescuento();

    }

    public static void menu(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
        boolean llave=true;

        while (llave) {
            StdOut.println("╔═══════════════════════════════════════════╗");
            StdOut.println("║      Bienvenido al sistema de ventas      ║");
            StdOut.println("╠═══════════════════════════════════════════╣");
            StdOut.println("║ Ingrese la opción para continuar          ║");
            StdOut.println("║ (1) - Iniciar Sesión                      ║");
            StdOut.println("║ (2) - Cerrar Programa                     ║");
            StdOut.println("╚═══════════════════════════════════════════╝");
            StdOut.print("* : ");
            String opcion= StdIn.readLine();
            switch (opcion){

                case "1" -> iniciarSesion(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
                case "2" -> llave=false;
                default -> StdOut.println("Ingrese opcion valida");
            }
        }
        System.out.println("Adios Usuario tenga buen dia");
    }

    //Inicio de sesion utiliza la Listaempleados la cual nombre datosEmpleados
    public static void iniciarSesion(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuego, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
        System.out.println("Bienvenido, Ingrese sus credenciales para acceder");

        System.out.print("Usuario: ");
        String usuarioTeclado = StdIn.readLine();
        int posicion = datosEmpleados.buscarEmpleadoUsuario(usuarioTeclado);

        if (posicion != -1){

            Empleado usuario = datosEmpleados.obtenerPosicion(posicion);
            datosEmpleados.EmpleadoActual(usuarioTeclado);
            System.out.println("Bienvenido " + usuario.getUsuario()+ " porfavor ingrese su contraseña:");
        }
        else {
            System.out.println("Usuario incorrecto pruebe denuevo");
            iniciarSesion(datosEmpleados, datosVideojuego, datosClientes,datosEstadisticas);
        }

        System.out.print("Contraseña: ");
        String contraseniaTeclado = StdIn.readLine();
        int posicion2 = datosEmpleados.buscarEmpleadoContrasenia(contraseniaTeclado,posicion);

        if (posicion2 != -1){
            Empleado contrasenia = datosEmpleados.obtenerPosicion(posicion2);

            System.out.println("Ingresaste");
            System.out.println("Bienvenido elija una de las siguiente opciones");
            menuPrincipal(datosEmpleados, datosVideojuego, datosClientes,datosEstadisticas);
        }
        else {
            System.out.println("Contraseña incorrecta pruebe denuevo");
            iniciarSesion(datosEmpleados, datosVideojuego, datosClientes,datosEstadisticas);
    }



    }

    public static void menuPrincipal(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuego, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
        boolean llave2=true;

        while (llave2) {
            StdOut.println("╔════════════════════════╗");
            StdOut.println("║      Menu Principal    ║");
            StdOut.println("╠════════════════════════╣");
            StdOut.println("║ Ingrese su opción:     ║");
            StdOut.println("║ 1) Vender Videojuego   ║");
            StdOut.println("║ 2) Buscar Videojuego   ║");
            StdOut.println("║ 3) Menú de Estadísticas║");
            StdOut.println("║ 4) Cerrar Sesión       ║");
            StdOut.println("╚════════════════════════╝");

            StdOut.print("* : ");
            String opcion= StdIn.readLine();
            switch (opcion){

                case "1":vendervideojuegos(datosEmpleados, datosVideojuego, datosClientes,datosEstadisticas);  //excepcion si pongo numero se muere
                case "2":buscarvideojuegos(datosEmpleados, datosVideojuego, datosClientes,datosEstadisticas);
                case "3":menuEstadisticas(datosEmpleados,datosVideojuego,datosClientes,datosEstadisticas);
                case "4":llave2 = false;
                default:StdOut.println("Ingrese opcion valida");
            }
        }

    }

    //buscarVideojuego:
    //Se le pide al usuario ingresar por teclado el codigo unico o nombre(Aun no funciona correctamente pero esta es
    // la estructura), consecuentemente utiliza el dato ingresado para comparar dentro de la "ListaVideojuego" en base a
    // "BuscarVideojuego"
    // Si lo encuentra declaramos a la clase "Videojuego" y la nombramos en este caso "codigo" a continuación
    // printea los datos dentro de la clase llamandolos por ejemplo con la funcion "codigo.getCodigounico()"
    // cabe añadir que los datos son obtenidos del documento de texto (Juegos.txt)
    public static void buscarvideojuegos(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
        System.out.println("Ingrese el nombre o codigo unico del videojuego");
        String buscarDatoIngresado = StdIn.readLine();      //se muere
        int posicion = datosVideojuegos.BuscarVideojuegoCodigo(buscarDatoIngresado);
        int posicion2 = datosVideojuegos.BuscarVideojuegoNombre(buscarDatoIngresado);

        if (posicion != -1){
            Videojuego codigo = datosVideojuegos.obtenerPosicionVideojuego(posicion);

            StdOut.println("╔═══════════════════════╗");
            StdOut.println("║      Videojuego       ║");
            StdOut.println("╚═══════════════════════╝");
            StdOut.println(" Código:         " + codigo.getCodigoUnico());
            StdOut.println(" Nombre:         " + codigo.getNombre());
            StdOut.println(" Precio:         " + codigo.getPrecio());
            StdOut.println(" Género:         " + codigo.getGenero());
            StdOut.println(" Clasificación:  " + codigo.getClasificacionEdad());
            StdOut.println(" Desarrolladora: " + codigo.getCompañia());
            StdOut.println(" Plataforma:     " + codigo.getPlataforma());
            StdOut.println("╚══════════════════════════╝");


            menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
        }
        else if (posicion2 != -1){
            Videojuego nombre = datosVideojuegos.obtenerPosicionVideojuego(posicion2);
            StdOut.println("╔════════════════════════════════════╗");
            StdOut.println("║           Videojuego               ║");
            StdOut.println("╚════════════════════════════════════╝");
            StdOut.println(" Código:            " + nombre.getCodigoUnico());
            StdOut.println(" Nombre:            " + nombre.getNombre());
            StdOut.println(" Precio:            " + nombre.getPrecio());
            StdOut.println(" Género:            " + nombre.getGenero());
            StdOut.println(" Clasificación:     " + nombre.getClasificacionEdad());
            StdOut.println(" Desarrolladora:    " + nombre.getCompañia());
            StdOut.println(" Plataforma:        " + nombre.getPlataforma());
            StdOut.println("╚═══════════════════════════════════");

            menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
        }
        else {
            System.out.println("Videojuego no encontrado intente denuevo");
            buscarvideojuegos(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
        }
    }
    public static void vendervideojuegos(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
      String videojuegoporTeclado;
      String rutPorTeclado;
        StdOut.println("*******************************");
        StdOut.print("* : ");
        StdOut.println("Ingrese el videojuego que se desea  vender");
        videojuegoporTeclado=StdIn.readLine();
        String generoSeleccionado = "";
        double precioConDescuento = 0;
        double comision=0;
        String plataforma=" ";
        int posicion = datosVideojuegos.BuscarVideojuegoNombre(videojuegoporTeclado);
        Videojuego nombre = datosVideojuegos.obtenerPosicionVideojuego(posicion);
         if (posicion != -1){
             StdOut.println("╔════════════════════════════════════╗");
             StdOut.println("║           Videojuego               ║");
             StdOut.println("╚════════════════════════════════════╝");
             StdOut.println(" Código:            " + nombre.getCodigoUnico());
             StdOut.println(" Nombre:            " + nombre.getNombre());
             StdOut.println(" Precio:            " + nombre.getPrecio());
             StdOut.println(" Género:            " + nombre.getGenero());
             StdOut.println(" Clasificación:     " + nombre.getClasificacionEdad());
             StdOut.println(" Desarrolladora:    " + nombre.getCompañia());
             StdOut.println(" Plataforma:        " + nombre.getPlataforma());
             StdOut.println("╚═══════════════════════════════════");
            generoSeleccionado = nombre.getGenero();
            precioConDescuento = nombre.getPrecio();
             plataforma= nombre.getPlataforma();
        }
         else {
             System.out.println("Ingrese un nombre valido");
             vendervideojuegos(datosEmpleados, datosVideojuegos,datosClientes,datosEstadisticas);
         }

        StdOut.print("Ingrese su rut: ");
        StdOut.print("* : ");
        rutPorTeclado=StdIn.readLine();

        if(datosClientes.validacion(rutPorTeclado)){
            StdOut.println("╔════════════════════════════════════════╗");
            StdOut.println("║           Estimado Cliente             ║");
            StdOut.println("╚════════════════════════════════════════╝");
            StdOut.println(" Contamos con descuentos increíbles    ");
            StdOut.println(" todos los días.                        ");
            StdOut.println(" Hoy en GameTech contamos con            ");
            StdOut.println(" " + datosVideojuegos.getDescuentoAleatorio() + " al 30%. ");
            StdOut.println(" ¿Desea registrarse en nuestra tienda?   ");
            StdOut.println(" Ingrese la opción para continuar          ");
            StdOut.println("   (1)-Si                                  ");
            StdOut.println("   (2)-No                                  ");
            StdOut.println("╚════════════════════════════════════════╝");
            StdOut.print("* : ");
            String opcion=StdIn.readLine();
            if (opcion.equalsIgnoreCase("1")){
                AgregarCliente(datosClientes);
            }
            else if (opcion.equalsIgnoreCase("2")){
                System.out.println("Se continuara con el proceso de compra");
            }
            else {
                StdOut.println("////Ingrese una opcion valida////");menuPrincipal(datosEmpleados, datosVideojuegos,datosClientes,datosEstadisticas);
            }
        }
        StdOut.println("Desea confirmar la compra del videojuego: "+videojuegoporTeclado);
        StdOut.println("╔══════════════════════════════════════════════════╗");
        StdOut.println("║     ¿Desea confirmar la compra del videojuego?   ║");
        StdOut.println("╠══════════════════════════════════════════════════╣");
        StdOut.println("║ " + videojuegoporTeclado + "                     ║");
        StdOut.println("║   (1)-Si                                         ║");
        StdOut.println("║   (2)-No                                         ║");
        StdOut.println("╚══════════════════════════════════════════════════╝");
        StdOut.print("* : ");
        String confirmar = StdIn.readLine();

        int posicion3 = datosClientes.buscarCliente(rutPorTeclado);

        if (posicion3 == -1){
            if (confirmar.equalsIgnoreCase("1")) {
                if (confirmar.equalsIgnoreCase("1")) {
                    System.out.println("Se realiza la compra de: ");
                    System.out.println(videojuegoporTeclado);
                    System.out.println(precioConDescuento);
                    comision = precioConDescuento * 0.02;
                    Estadisticas videojuegoComprado = new Estadisticas(videojuegoporTeclado, plataforma, "normal", precioConDescuento, datosEmpleados.getEmpleadoActivo(), comision);
                    registroventas(datosEstadisticas, videojuegoComprado);
                    System.out.println("Compra Realizada");
                }
            }
        }

        if(posicion3!=-1) {
            Cliente cliente = datosClientes.obtenerPosicionCliente(posicion3); //aqui muere debido a que busca en un arreglo vacio () deber arreglarlo

            if (confirmar.equalsIgnoreCase("1") && cliente.getRut().equalsIgnoreCase(rutPorTeclado)) {
                if (datosVideojuegos.getDescuentoAleatorio().equalsIgnoreCase(generoSeleccionado)) {
                    System.out.println("El nuevo precio del videojuego es: ");
                    precioConDescuento = precioConDescuento - precioConDescuento * 0.3;
                    System.out.println(videojuegoporTeclado);
                    System.out.println(precioConDescuento);
                    comision = precioConDescuento * 0.02;
                    Estadisticas videojuegoComprado = new Estadisticas(videojuegoporTeclado, plataforma, "registrado", precioConDescuento, datosEmpleados.getEmpleadoActivo(), comision);
                    registroventas(datosEstadisticas, videojuegoComprado);
                    System.out.println("Compra Realizada");
                }
                else {
                    System.out.println("Se realiza la compra de: ");
                    System.out.println(videojuegoporTeclado);
                    System.out.println(precioConDescuento);
                    comision = precioConDescuento * 0.02;
                    Estadisticas videojuegoComprado = new Estadisticas(videojuegoporTeclado, plataforma, "registrado", precioConDescuento, datosEmpleados.getEmpleadoActivo(), comision);
                    registroventas(datosEstadisticas, videojuegoComprado);
                    System.out.println("Compra Realizada");
                }

            }
        }
        if (confirmar.equalsIgnoreCase("2")){
            System.out.println("Compra Cancelada");
            menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
        }
        if(!confirmar.equalsIgnoreCase("1")&&!confirmar.equalsIgnoreCase("2")) {
            System.out.println("Ingrese una opcion valida");
            menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);

        }

        StdOut.println("Desea realizar la compra de otro videjuego?: ");
        StdOut.println("(1) Si             (2) No");
        String opcion=StdIn.readLine();
        switch (opcion){
            case "1": vendervideojuegos(datosEmpleados,datosVideojuegos, datosClientes,datosEstadisticas);
            case "2": menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
            default:StdOut.println("Ingrese opcion valida");menuPrincipal(datosEmpleados, datosVideojuegos,datosClientes,datosEstadisticas);
        }
    }

    public static void AgregarCliente(ListaClientes datosClientes){


        StdOut.println("Ingrese su rut");
        String rutPorTeclado = StdIn.readLine();
        StdOut.println("Ingrese su nombre Completo");
        String nombrePorTeclado = StdIn.readLine();
        StdOut.println("correo lectronico");
        String correoPorTeclado = StdIn.readLine();
        Cliente cliente = new Cliente(rutPorTeclado, nombrePorTeclado, correoPorTeclado);
        datosClientes.agregarClientes(cliente);
    }
    public static void menuEstadisticas(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
        int posicion = datosEstadisticas.getCantidadActual();
        if (posicion == 0){
            System.out.println("No hay datos en las estadisticas");
            menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
        }
            StdOut.println("╔═══════════════════════════════════╗");
            StdOut.println("║        Menu Estadisticas          ║");
            StdOut.println("╠═══════════════════════════════════╣");
            StdOut.println("║ Ingrese una opción:               ║");
            StdOut.println("║ (1) Videojuego más vendido        ║");
            StdOut.println("║ (2) Plataforma con mayor ventas   ║");
            StdOut.println("║ (3) Ventas a clientes registrados ║");
            StdOut.println("║ (4) Imprimir ventas totales       ║");
            StdOut.println("║ (5) Trabajador con más ventas     ║");
            StdOut.println("║ (6) Menú anterior                 ║");
            StdOut.println("╚═══════════════════════════════════╝");
            StdOut.print("* : ");
            String opcion9=StdIn.readLine();
            switch (opcion9){
               case "1" -> videojuegoMasVendido4(datosEmpleados, datosVideojuegos, datosClientes, datosEstadisticas);
               case "2" -> plataformaConMasVentas(datosEmpleados, datosVideojuegos, datosClientes, datosEstadisticas);
               case "3" -> ventaClientesRegistrados(datosEmpleados, datosVideojuegos, datosClientes, datosEstadisticas);
               case "4" -> imprimirVentasTotales(datosEmpleados, datosVideojuegos, datosClientes, datosEstadisticas);
               case "5" -> trabajadorConMasVentas(datosEmpleados, datosVideojuegos, datosClientes, datosEstadisticas);
               case "6" -> menuPrincipal(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
                default -> System.out.println("Ingrese una opción valida");
            }
    }
    public static void registroventas(ListaEstadisticas DatosEstadisticas,Estadisticas videojuegoComprado){
        DatosEstadisticas.agregarEstadistica(videojuegoComprado);
    }
   public static void videojuegoMasVendido4(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){

        String mayorVenta = datosEstadisticas.cantidadVideojuegoVendido(datosEstadisticas);
       System.out.println(mayorVenta);

       menuEstadisticas(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);

    }
    public static void plataformaConMasVentas(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){
        String plataforma = datosEstadisticas.PlataformaConMayorVentas(datosEstadisticas);
        System.out.println(plataforma);
        menuEstadisticas(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
    }
    public static void ventaClientesRegistrados(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){

        int clientesRegistrados = datosEstadisticas.ventasAClientesRegistrados(datosEstadisticas);
        System.out.println("La cantidad de clientes registrados atendidos fue de: " + clientesRegistrados);
        menuEstadisticas(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
    }
    public static void imprimirVentasTotales(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){

        double sumaTotalVentas = datosEstadisticas.imprimirVentasTotales(datosEstadisticas);
        System.out.println("La cantidad de dinero recaudado por las ventas es de: "+ sumaTotalVentas);

        menuEstadisticas(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
    }
    public static void trabajadorConMasVentas(ListaEmpleados datosEmpleados, ListaVideojuego datosVideojuegos, ListaClientes datosClientes, ListaEstadisticas datosEstadisticas){

        menuEstadisticas(datosEmpleados, datosVideojuegos, datosClientes,datosEstadisticas);
    }
    }
