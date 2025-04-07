package ec.edu.ups.poo;
import java.util.List;

public class Docente {
    private List<String> tituloAcademico;
    private List<String> areaDeEspecializacion;

    public Docente(List<String> tituloAcademico, List<String> areaDeEspecializacion) {
        this.tituloAcademico = tituloAcademico;
        this.areaDeEspecializacion = areaDeEspecializacion;
    }
    public Docente() {

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
        return "\nTítulos Académicos : " + tituloAcademico +
                "\nArea de Especializacion : " + areaDeEspecializacion;
    }
}
