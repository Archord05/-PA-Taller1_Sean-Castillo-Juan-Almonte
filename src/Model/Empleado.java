package Model;

public class Empleado {
    private String usuario;
    private  String contrasena;
    private String codigoUnico;
    private  int bono;

    public Empleado(String usuario, String contrasena, String codigoUnico, int bono) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codigoUnico = codigoUnico;
        this.bono = bono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public int getBono() {
        return bono;
    }
}
