package ec.edu.ups.poo;
import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private List<Direccion> direcciones;

    public Persona(String cedula, String nombre,String apellido, String telefono, String correoElectronico, List<Direccion> direcciones) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direcciones = direcciones;
    }
    public Persona () {
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
    public List<Direccion> getDirecciones() {return direcciones;}
    public void setDirecciones(List<Direccion> direcciones) {this.direcciones = direcciones;}

    @Override
    public String toString() {
        return "\nCédula: " + cedula +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nTeléfono: " + telefono +
                "\nCorreo Eléctronico: " + correoElectronico +
                "\nDirecciones: " + direcciones;
    }
}

