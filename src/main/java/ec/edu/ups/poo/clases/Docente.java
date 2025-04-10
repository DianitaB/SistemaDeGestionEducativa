package ec.edu.ups.poo.clases;

import java.util.List;

public class Docente extends Persona {
    private List<String> tituloAcademico;
    private List<String> areaDeEspecializacion;

    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico,
                   List<String> tituloAcademico, List<String> areaDeEspecializacion) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.tituloAcademico = tituloAcademico;
        this.areaDeEspecializacion = areaDeEspecializacion;
    }

    public List<String> getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(List<String> tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public List<String> getAreaDeEspecializacion() {
        return areaDeEspecializacion;
    }

    public void setAreaDeEspecializacion(List<String> areaDeEspecializacion) {
        this.areaDeEspecializacion = areaDeEspecializacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Títulos Académicos: " + tituloAcademico +
                ", Área de Especialización: " + areaDeEspecializacion + "}";
    }
}
