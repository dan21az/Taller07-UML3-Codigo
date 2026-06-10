package Codigo;
import java.util.ArrayList;

public class PersonalAcademico extends Usuario{

    protected ArrayList<Incidente> incidentes;

    public void reportarError(String email, String contenido){};
    public void solicitarAsesoriamientoDelSistema(String email, String contenido){};
    public void comentarEnForo(Foro foro, String comentario){};

}
