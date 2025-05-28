package co.edu.frontend.model;

public class CursoRequest {
    private String nombre;
    private Long semestreId;
    private String jornada;


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Long getSemestreId() { return semestreId; }
    public void setSemestreId(Long semestreId) { this.semestreId = semestreId; }

    public String getJornada() { return jornada; }
    public void setJornada(String jornada) { this.jornada = jornada; }

}
