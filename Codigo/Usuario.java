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

    public String getApellido() {
        return apellido;
    }
     public String getContraseña() {
         return contraseña;
     }
     
    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
