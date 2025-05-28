package co.edu.frontend.model;

import java.util.Date;

public class AsistenciaRequest {
    private Long estudianteCursoId;
    private Date fecha;

    public Long getEstudianteCursoId() { return estudianteCursoId; }
    public void setEstudianteCursoId(Long estudianteCursoId) { this.estudianteCursoId = estudianteCursoId; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

}
