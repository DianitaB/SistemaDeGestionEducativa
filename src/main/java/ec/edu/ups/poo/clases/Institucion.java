package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;


public class Institucion{
    private int identificacion;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sedes = new ArrayList<>();
        this.asignaciones = new ArrayList<>();

    }
    public Institucion (){
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre(){
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
    public void addDireccion(TipoDireccion tipoDireccion,String callePrincipal, String numeracion, String ciudad, String provincia, String pais){
        this.direccion = new Direccion(tipoDireccion, callePrincipal, numeracion, ciudad, provincia, pais);
    }
    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }
    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "Institución { ID: " + identificacion + ", Nombre: '" + nombre +
                "', Sedes: " + sedes + ", Direcciones: " + direccion +
                ", Asignaciones: " + asignaciones + " }";
    }
}