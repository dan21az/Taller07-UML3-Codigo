package Codigo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    protected Integer id;
    protected Date fecha_reportado;
    protected String estado;    
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    private Usuario responsable;

    public PersonalAcademico getBeneficiario() {
        return beneficiario;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getEstado() {
        return estado;
    }

    public Date getFecha_cerrado() {
        return fecha_cerrado;
    }

    public Date getFecha_reportado() {
        return fecha_reportado;
    }

    public Integer getId() {
        return id;
    }

    public List<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setBeneficiario(PersonalAcademico beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void setFecha_cerrado(Date fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public void setFecha_reportado(Date fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLog_actualizaciones(List<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}