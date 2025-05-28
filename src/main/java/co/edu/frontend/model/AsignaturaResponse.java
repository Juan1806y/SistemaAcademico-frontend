package co.edu.frontend.model;

public class AsignaturaResponse {
    private Long codigo;
    private String nombre;
    private Integer semestre;
    private Integer creditos;
    private Integer horas;
    private String tipoAsignatura;
    private Long pensumId;

    public Long getCodigo() { return codigo; }
    public void setCodigo(Long codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getSemestre() { return semestre; }
    public void setSemestre(Integer semestre) { this.semestre = semestre; }

    public Integer getCreditos() { return creditos; }
    public void setCreditos(Integer creditos) { this.creditos = creditos; }

    public Integer getHoras() { return horas; }
    public void setHoras(Integer horas) { this.horas = horas; }

    public String getTipoAsignatura() { return tipoAsignatura; }
    public void setTipoAsignatura(String tipoAsignatura) { this.tipoAsignatura = tipoAsignatura; }

    public Long getPensumId() { return pensumId; }
    public void setPensumId(Long pensumId) { this.pensumId = pensumId; }
}
