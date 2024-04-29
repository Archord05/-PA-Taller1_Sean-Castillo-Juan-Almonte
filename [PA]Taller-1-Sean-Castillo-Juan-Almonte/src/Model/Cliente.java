package Model;

public class Cliente {
    private String rut;
    private  String nombreCompleto;
    private String correoElectronico;
    private  String estado;

    /**
     * Constructor de la clase CLiente
     * @param rut Rut del cliente registrado
     * @param nombreCompleto Nombre completo del cliente registrado
     * @param correoElectronico Correo del cliente registrado
     */
    public Cliente(String rut, String nombreCompleto, String correoElectronico) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.estado="registado";
    }

    /**
     *
     * @return Retorna el rut del cliente registrado
     */
    public String getRut() {
        return rut;
    }

    /**
     *
     * @return Retorna el nombre completo del cliente
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     *
     * @return Retorna el correo electronico del cliente
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     *
     * @return Retorna el estado del cliente
     */
    public String getEstado() {
        return estado;
    }
}
