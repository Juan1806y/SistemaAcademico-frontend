package co.edu.frontend.model;

import java.util.Date;

public class CalificacionRequest {
    private String nombre;
    private Long estudianteCursoId;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Long getEstudianteCursoId() { return estudianteCursoId; }
    public void setEstudianteCursoId(Long estudianteCursoId) { this.estudianteCursoId = estudianteCursoId; }
}
