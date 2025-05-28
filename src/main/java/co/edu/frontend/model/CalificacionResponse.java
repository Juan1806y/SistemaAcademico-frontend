import java.util.Date;

public class CalificacionResponse {
    private String nombre;
    private Date fecha;
    private String tipo;
    private Float nota;
    private String nombreEstudiante;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Float getNota() { return nota; }
    public void setNota(Float nota) { this.nota = nota; }
    public String getNombreEstudiante() { return nombreEstudiante; }
    public void setNombreEstudiante(String nombreEstudiante) { this.nombreEstudiante = nombreEstudiante; }
}
