package ec.edu.ups.poo;

import java.util.GregorianCalendar;

public class Institucion {
    private String identificacion;
    private GregorianCalendar fechaInicio;
    private String rol;

    public Institucion(String identificacion, GregorianCalendar fechaInicio, String rol) {
        this.identificacion = identificacion;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }
    public Institucion() {

    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "\nIdentificacion: " + identificacion +
                "\nFecha de Inicio: " + fechaInicio +
                "\nRol: " + rol;
    }
}
