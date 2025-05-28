package co.edu.frontend.model;

import java.util.Date;

public class AsistenciaResponse {
    private Long estudianteCursoId;
    private Date fecha;
    private String estado;
    private String excusa;

    public Long getEstudianteCursoId() { return estudianteCursoId; }
    public void setEstudianteCursoId(Long estudianteCursoId) { this.estudianteCursoId = estudianteCursoId; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getExcusa() { return excusa; }
    public void setExcusa(String excusa) { this.excusa = excusa; }
}
