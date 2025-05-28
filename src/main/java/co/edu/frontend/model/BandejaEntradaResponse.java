package co.edu.frontend.model;

public class BandejaEntradaResponse {
    private Integer mensajesNoLeidos;
    private String nombrePersona;
    private Integer capacidad;

    public Integer getMensajesNoLeidos() { return mensajesNoLeidos; }
    public void setMensajesNoLeidos(Integer mensajesNoLeidos) { this.mensajesNoLeidos = mensajesNoLeidos; }
    public String getNombrePersona() { return nombrePersona; }
    public void setNombrePersona(String nombrePersona) { this.nombrePersona = nombrePersona; }
    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
}
