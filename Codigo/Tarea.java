package Codigo;
import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa {

    private LocalDateTime fechaDePublicacion;

    public Tarea() {
    }

    public LocalDateTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}