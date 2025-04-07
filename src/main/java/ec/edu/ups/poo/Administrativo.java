package ec.edu.ups.poo;
import java.util.List;

public class Administrativo {
    private List<String> cargo;
    private List<String> responsabilidad;

    public Administrativo(List<String> cargos, List<String> responsabilidad) {
        this.cargo = cargos;
        this.responsabilidad = responsabilidad;
    }
    public Administrativo() {
    }

    public List<String> getCargo() {
        return cargo;
    }
    public void setCargo(List<String> cargo) {
        this.cargo = cargo;
    }
    public List<String> getResponsabilidad() {
        return responsabilidad;
    }
    public void setResponsabilidad(List<String> responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    @Override
    public String toString() {
        return "\nCargo=" + cargo +
                "\nResponsabilidad=" + responsabilidad;
    }
}
