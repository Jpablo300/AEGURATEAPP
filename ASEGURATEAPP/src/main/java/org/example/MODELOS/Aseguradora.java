package org.example.MODELOS;

public class Aseguradora {

    private String nombre;                   // Nombre de la aseguradora
    private String tipo;                     // Tipo de seguros ofrecidos (vida, salud, auto, etc.)
    private String direccion;                // Dirección de la sede
    private String telefono;                 // Número de contacto
    private String email;                    // Correo electrónico
    private String sitioWeb;                 // Página web de la aseguradora
    private String pais;                     // País de operación
    private String ciudad;                   // Ciudad donde está ubicada
    private String codigoPostal;             // Código postal
    private String numeroLicencia;           // Número de licencia de operación

    // Constructor

    public Aseguradora() {
    }

    public Aseguradora(String nombre, String tipo, String direccion,
                       String telefono, String email, String sitioWeb,
                       String pais, String ciudad, String codigoPostal,
                       String numeroLicencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.sitioWeb = sitioWeb;
        this.pais = pais;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.numeroLicencia = numeroLicencia;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public String toString() {
        return "Aseguradora: " +
                "Nombre: " + nombre + ", " +
                "Tipo: " + tipo + ", " +
                "Dirección: " + direccion + ", " +
                "Teléfono: " + telefono + ", " +
                "Email: " + email + ", " +
                "Sitio Web: " + sitioWeb + ", " +
                "País: " + pais + ", " +
                "Ciudad: " + ciudad + ", " +
                "Código Postal: " + codigoPostal + ", " +
                "Número de Licencia: " + numeroLicencia;
    }
}
