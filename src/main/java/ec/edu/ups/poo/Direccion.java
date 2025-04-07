package ec.edu.ups.poo;

public class Direccion {
    private String tipo;
    private String callePrincipal;
    private String numeracion;
    private String ciudad;
    private String provincia;
    private String pais;

    public Direccion(String tipo, String callePrincipal, String numeracion, String ciudad, String provincia, String pais) {
        this.tipo = tipo;
        this.callePrincipal = callePrincipal;
        this.numeracion = numeracion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Direccion() {

    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "\nDireccion :" + tipo +
                "\nCalle Principal :" + callePrincipal +
                "\nNumeración :" + numeracion +
                "\nCiudad: " + ciudad +
                "\nProvincia: " + provincia +
                "\nPaís: " + pais;
    }
}


