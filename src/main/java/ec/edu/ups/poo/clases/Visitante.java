package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class Visitante {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    public Visitante() {

    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "\nMotivo: " + motivo +
                "\nFecha de Entrada: " + fechaEntrada +
                "\nFecha de Salida: " + fechaSalida;
    }
}

