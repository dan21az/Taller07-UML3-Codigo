package Codigo;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Profesor responsable;

    private String id;
    private String nombre;
    private Boolean estadoDisponible;

    private List<Foro> foros;
    private List<ActividadSumativa> actividadesSumativas;

        private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;

        public Curso() {
        this.foros = new ArrayList<>();
        this.actividadesSumativas = new ArrayList<>();
        this.estudiantesInscritos = new ArrayList<>();
        this.estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    }

    public Curso(String id, String nombre, Boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(Boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public List<Foro> getForos() {
        return foros;
    }

    public void setForos(List<Foro> foros) {
        this.foros = foros;
    }
    public Profesor getResponsable() {
    return responsable;
}

public void setResponsable(Profesor responsable) {
    this.responsable = responsable;
}
}