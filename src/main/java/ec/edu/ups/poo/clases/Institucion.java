package ec.edu.ups.poo.clases;


import java.util.List;

public class Institucion{
    private int identificacion;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;

    public Institucion(int identificacion, String nombre, List<String> sedes, Direccion direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sedes = sedes;
        this.direccion = direccion;
    }
    public Institucion (){

    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "Identificacion=" + identificacion +
                ", Nombre='" + nombre + '\'' +
                ", Sedes=" + sedes +
                ", Direccion=" + direccion +
                '}';
    }
}