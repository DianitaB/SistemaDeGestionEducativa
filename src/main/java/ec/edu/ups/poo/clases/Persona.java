package ec.edu.ups.poo.clases;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private List<Direccion> direcciones;

    public Persona(String cedula, String nombre,String apellido, String telefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direcciones = new ArrayList<Direccion>();

    }
    public Persona () {
        this.direcciones = new ArrayList<Direccion>();
    }

    public String getCedula() {return cedula;}
    public void setCedula(String cedula) {this.cedula = cedula;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getCorreoElectronico() {return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico) {this.correoElectronico = correoElectronico;}

    public void addDireccion(Direccion direccion) {
        // objetivo: ir agregando la direccion una a una a la lista de direcciones
        direcciones.add(direccion);
    }
    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Persona{Cedula='" + cedula +
                "', Nombre='" + nombre +
                "', Apellido='" + apellido +
                "', Telefono='" + telefono +
                "', CorreoElectronico='" + correoElectronico +
                "', Direcciones=" + direcciones + "}";
    }
}

// cuando es agregacion y composicion - no puedo pasar la lista a los getter y setters
// solo cuando es ASOCIACION