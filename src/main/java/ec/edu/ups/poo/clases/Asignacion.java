package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.enums.Rol;
import java.util.GregorianCalendar;


public class Asignacion {
    private Persona persona;
    private GregorianCalendar fechaInicio;
    private Rol rol;

    public Asignacion(Persona persona, GregorianCalendar fechaInicio, Rol rol) {
        this.persona = persona;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Persona getPersona() {
        return persona;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public Rol getRol() {
        return rol;
    }



    @Override
    public String toString() {
        return "Asignación{" +
                "Persona=" + persona +
                ", FechaInicio=" + fechaInicio +
                ", Rol=" + rol +
                '}';
    }
}
