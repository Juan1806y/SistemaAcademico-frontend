package co.edu.frontend.model;

public class CursoResponse {
    private String nombre;
    private String descripcion;
    private String jornada;
    private String modalidad;
    private Boolean vacacional;
    private String nombreAsignatura;
    private String nombrePrograma;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getJornada() { return jornada; }
    public void setJornada(String jornada) { this.jornada = jornada; }
    public String getModalidad() { return modalidad; }
    public void setModalidad(String modalidad) { this.modalidad = modalidad; }
    public Boolean getVacacional() { return vacacional; }
    public void setVacacional(Boolean vacacional) { this.vacacional = vacacional; }
    public String getNombreAsignatura() { return nombreAsignatura; }
    public void setNombreAsignatura(String nombreAsignatura) { this.nombreAsignatura = nombreAsignatura; }
    public String getNombrePrograma() { return nombrePrograma; }
    public void setNombrePrograma(String nombrePrograma) { this.nombrePrograma = nombrePrograma; }
}
