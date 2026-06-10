package Codigo;
import java.util.ArrayList;
import java.util.List;
public class Estudiante {

    private List<Curso> cursos;

    public Estudiante() {
        this.cursos = new ArrayList<>();
    }

    public void solicitarInscripcionCurso(Curso curso) {

    }

    public void realizarActividadSumativa(Curso curso,
                                          ActividadSumativa actividadSumativa) {

    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}