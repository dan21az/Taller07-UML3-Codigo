import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private List<Curso> cursosACargo;

    public Profesor() {
        this.cursosACargo = new ArrayList<>();
    }

    public void cargarActividadSumativa(
            Curso curso,
            ActividadSumativa actividadSumativa) {

    }

    public void calificarActividadSumativa(
            Curso curso,
            Estudiante estudiante,
            ActividadSumativa actividadSumativa) {

    }

    public void aceptarInscripcion(
            Curso curso,
            String usuarioEstudiante) {

    }

    public void crearNuevoForo(Foro foro) {

    }

    public List<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(List<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
}