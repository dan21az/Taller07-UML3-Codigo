package Codigo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    protected Integer id;
    protected Date fecha_reportado;
    protected String estado;    
    protected String descripcion;
    protected List log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    private Usuario responsable;

}