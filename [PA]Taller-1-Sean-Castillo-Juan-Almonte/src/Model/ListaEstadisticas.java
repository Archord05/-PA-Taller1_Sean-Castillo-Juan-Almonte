package Model;

public class ListaEstadisticas {
        private Estadisticas[] arregloEstadisticas;
        private  int cantidadMaxima;
        private  int cantidadActual;

    /**
     * Constructor de la clase ListaEstadisticas
     * @param cantidadMaxima Corresponde a la cantidad maxima que posee la lista
     */
    public ListaEstadisticas(int cantidadMaxima) {
            this.cantidadMaxima = cantidadMaxima;
            this.arregloEstadisticas = new Estadisticas[this.cantidadMaxima];
            this.cantidadActual = 0;
        }

    public ListaEstadisticas(Estadisticas[] arregloEstadisticas) {
        this.arregloEstadisticas = arregloEstadisticas;
    }

    /**
     * Metodo que permite agregar datos a la lista estadisticas
     * @param estadisticas Dato de estadistica el cual se agregara
     * @return Retorna un boleeano que indica si se pudo agregar
     */
    public boolean agregarEstadistica(Estadisticas estadisticas){
            if (this.cantidadActual == 0) {
                this.arregloEstadisticas[0] = estadisticas;
                this.cantidadActual++;
                return true;
            }
            this.arregloEstadisticas[cantidadActual] = estadisticas;
            this.cantidadActual++;
            return true;
        }

    /**
     * Método que permite comparar los videojuegos comprados y seleccionar el con mayor ventas
     * @param estadisticas datos de la clase Estadistica para el metodo
     * @return Retorna un mensaje con los datos del videojuego con mayor ventas
     */
    public String cantidadVideojuegoVendido(ListaEstadisticas estadisticas){
            String videojuegoMasVendido = "";
            int cantidadVideojuego = 0;
            int cantidadPersona = 0;
            int cantidadLeft = 0;
            int cantidadYakuza = 0;
            int cantidadZelda = 0;
            int cantidadBloodborne = 0;
            int cantidadGears = 0;
            int cantidadDevilMayCry = 0;
            int cantidadPalworld = 0;
            int cantidadSpiderMan = 0;
            int cantidadFireEmblem = 0;

            for (int i = 0; i < this.cantidadActual; i++) {

                //Soy yandereDev omglul
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Persona 3 Reload")) {
                    cantidadPersona++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Left 4 Dead 2")) {
                    cantidadLeft++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Yakuza: Like a Dragon")) {
                    cantidadYakuza++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("The Legend of Zelda: Breath of the Wild")) {
                    cantidadZelda++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Bloodborne")) {
                    cantidadBloodborne++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Gears of War 5")) {
                    cantidadGears++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Devil may Cry V")) {
                    cantidadDevilMayCry++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Palworld")) {
                    cantidadPalworld++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Marvel’s Spider-Man 2")) {
                    cantidadSpiderMan++;
                }
                if (this.arregloEstadisticas[i].getVideojuegoIngresado().equalsIgnoreCase("Fire Emblem Engage")) {
                    cantidadFireEmblem++;
                }
            }

            for (int i = 0; i < this.cantidadActual; i++) {

                if (cantidadPersona > cantidadVideojuego) {
                    videojuegoMasVendido = "Persona 3 Reload";
                }
                if (cantidadLeft > cantidadVideojuego) {
                    videojuegoMasVendido = "Left 4 Dead 2";
                }
                if (cantidadYakuza > cantidadVideojuego) {
                    videojuegoMasVendido = "Yakuza: Like a Dragon";
                }
                if (cantidadZelda > cantidadVideojuego) {
                    videojuegoMasVendido = "The Legend of Zelda: Breath of the Wild";
                }
                if (cantidadBloodborne > cantidadVideojuego) {
                    videojuegoMasVendido = "Bloodborne";
                }
                if (cantidadGears > cantidadVideojuego) {
                    videojuegoMasVendido = "Gears of War 5";
                }
                if (cantidadDevilMayCry > cantidadVideojuego) {
                    videojuegoMasVendido = "Devil may Cry V";
                }
                if (cantidadPalworld > cantidadVideojuego) {
                    videojuegoMasVendido = "Palworld";
                }
                if (cantidadSpiderMan > cantidadVideojuego) {
                    videojuegoMasVendido = "Marvel’s Spider-Man 2";
                }
                if (cantidadFireEmblem > cantidadVideojuego) {
                    videojuegoMasVendido = "Fire Emblem Engage";
                }

            }
            return "El videojuego mas vendido fue: " + videojuegoMasVendido + "con la cantidad de: " + cantidadVideojuego;
        }


    /**
     * Método que permite comparar las plataformas de los videojeugos vendidos y seleccionar el con mayor ventas
     * @param estadisticas Datos de la Clase Estadistica para el metodo
     * @return Retorna un mensaje con los datos de la plataforma con mas ventas
     */

    //recorremos la lista de los articulos vendidos con un for i,/ revisamos que coincidan los resultados con las 3 opciones
    //multiplataforma sencillamente agregamos a cada uno uno
    public String PlataformaConMayorVentas(ListaEstadisticas estadisticas){
            int nintendo=0;
            int xbox=0;
            int playStation=0;
            int mayor=0;
            //conprobamos si se cumple que efectivamente el dato mayor es uno de los presentados
            String nombreMayor=" ";
            int multiplataforma = 0;

            for (int i = 0; i <this.cantidadActual ; i++) {
                if (this.arregloEstadisticas[i].getPlataforma().equalsIgnoreCase("nintendo")) {
                    nintendo++;

                }
                if (this.arregloEstadisticas[i].getPlataforma().equalsIgnoreCase("xbox")) {
                    xbox++;

                }
                if (this.arregloEstadisticas[i].getPlataforma().equalsIgnoreCase("PlayStation")) {
                    playStation++;

                }
                if (this.arregloEstadisticas[i].getPlataforma().equalsIgnoreCase("multiplataforma")) {
                    playStation++;
                    xbox++;
                    nintendo++;
                    multiplataforma++;

                }
            }
           if(xbox<playStation && playStation <nintendo){
               mayor=nintendo;
               nombreMayor=" nintendo";
           }
            if(xbox>playStation && playStation >nintendo){
                mayor=xbox;
                nombreMayor=" xbox";
            }
            if(xbox<playStation && playStation >nintendo){
                mayor=playStation;
                nombreMayor="playStation";
            }
            else {
                mayor = multiplataforma;
                nombreMayor ="Multiplaforma";
            }
        //retornamos la respuesta como string
       String elmayor=("La compañia que mas vendio fue: ")+nombreMayor+(" con las siguientes ventas: ")+(mayor);
            return elmayor;
        }

    /**
     * Método para obtener la cantidad de clientes registrados atendidos y con la venta concretada
     * @param estadisticas datos de la clase Estadistica para el metodo
     * @return Retorna la cantidad de ventas a los clientes registrados
     */
    //acomulador sencillo que guarda  las ventas los clientes registrados
        public int ventasAClientesRegistrados(ListaEstadisticas estadisticas){

          int cantidadVendidos=0;

            for (int i = 0; i <this.cantidadActual ; i++) {
               if(this.arregloEstadisticas[i].getClientePremium().equalsIgnoreCase("registrado")){
                   cantidadVendidos++;
               }
            }

            //devuelve el numero de ventas como int
            return cantidadVendidos;
        }

    /**
     * Método para obtener la cantidad de dinero recaudado por las ventas
     * @param estadisticas datos de la clase Estadistica para el metodo
     * @return Retorna la cantidad de dinero recaudado
     */
    //acomuladorque guarda el dinero vendido de las ventas totales
    public double imprimirVentasTotales(ListaEstadisticas estadisticas){

            double cantidadVentasTotales=0;
            double cantidadVentas=0;
            for (int i = 0; i <this.cantidadActual ; i++) {
               cantidadVentas=this.arregloEstadisticas[i].getDineroRecaudado();
                cantidadVentasTotales=cantidadVentasTotales+cantidadVentas;
                }
        //devuelve el dato como double
            return cantidadVentasTotales;
        }

    /**
     * Método para obtener el trabajador ocn mas ventas mientras el programa esta activo
     * @param estadisticas datos de la clase Estadistica para el metodo
     * @return Retorna la cantidad de dinero recaudado
     */

    public boolean trabajadorConMasVentas(ListaEstadisticas estadisticas){
        //TODO trabajador con mas ventas
            return true;


        }

    /**
     * Metodo para obtener la posición dentro de la lista estadistica
     * @param posicion Posición de la lista
     * @return Retorna la posición de la lista Estadisticas
     */
    public Estadisticas obtenerPosiciónEstadisticas(int posicion){
            return this.arregloEstadisticas[posicion];
        }

    /**
     *
     * @return Retorna la lista Estadistica
     */
    public Estadisticas[] getArregloEstadisticas() {
            return arregloEstadisticas;
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


    }


