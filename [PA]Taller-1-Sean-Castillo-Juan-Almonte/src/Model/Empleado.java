package Model;

public class Empleado {
    private String usuario;
    private  String contrasena;

    /**
     * Constructor de la clase Empleado
     * @param usuario Usuario del empleado
     * @param contrasena Contraseña del empleado
     */
    public Empleado(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    /**
     *
     * @return Retorna el usuario del emppleado
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @return retorna la contraseña del empleado
     */
    public String getContrasena() {
        return contrasena;
    }
}
