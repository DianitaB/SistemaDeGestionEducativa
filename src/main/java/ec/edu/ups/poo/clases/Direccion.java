package ec.edu.ups.poo.clases;
import ec.edu.ups.poo.enums.TipoDireccion;

public class Direccion {

    private TipoDireccion tipoDireccion;
    private String callePrincipal;
    private String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;

    public Direccion(TipoDireccion tipoDireccion,String callePrincipal, String numeracion, String ciudad, String provincia, String pais) {

        this.callePrincipal = callePrincipal;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.tipoDireccion = tipoDireccion;
    }

    public Direccion() {

    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }
    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }
    public String getCallePrincipal() {
        return callePrincipal;
    }
    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }
    public String getNumeracion() {
        return numeracion;
    }
    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {

        return  "\nTipo de Direccion: " +tipoDireccion +
                "\nCalle Principal :" + callePrincipal +
                "\nNumeración :" + numeracion +
                "\nCiudad: " + ciudad +
                "\nProvincia: " + provincia +
                "\nPaís: " + pais;
    }
}
// Relacion de mucho a muchos, y en esta relacion tengo informacion
// Tengo que crear una clase intermedia

