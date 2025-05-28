package co.edu.frontend.model;

public class AulaResponse {
    private Integer capacidad;
    private String ubicacion;
    private Integer dimensiones;
    private String tipo;
    private String estado;

    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public Integer getDimensiones() { return dimensiones; }
    public void setDimensiones(Integer dimensiones) { this.dimensiones = dimensiones; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
