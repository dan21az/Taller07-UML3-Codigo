package Codigo;
import java.util.ArrayList;

public class Usuario {
    
    protected String usuario; 
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    protected Boolean logIn() {return true;};

    protected Boolean logOut() {return false;};

}
