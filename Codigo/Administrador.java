package Codigo;
public class Administrador extends Usuario{

    public Usuario crearUsuarioConRol(String usuario, String contraseña) {
        Usuario usuarioConRol = new Usuario();
        return usuarioConRol;
    };
    public void asignarPermiso(String usuario) {};
    public void actualizarSoftware() {};
    public void asignarResponsable(Curso Curso, Profesor responsable) {};

}
