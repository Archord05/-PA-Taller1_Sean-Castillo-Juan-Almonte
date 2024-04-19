package Model;

public class Cliente {
    private String rut;
    private  String nombreCompleto;
    private String correoElectronico;
    private  String estado;

    public Cliente(String rut, String nombreCompleto, String correoElectronico) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.estado="Normal";
    }

    public Cliente(String rut, String nombreCompleto, String correoElectronico, String estado) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
    }

    public String getRut() {
        return rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getEstado() {
        return estado;
    }
}
