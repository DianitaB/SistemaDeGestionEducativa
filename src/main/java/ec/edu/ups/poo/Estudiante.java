package ec.edu.ups.poo;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula, String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "\nCarrera: " + carrera;
    }
}

