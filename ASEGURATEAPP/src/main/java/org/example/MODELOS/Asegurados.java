package org.example.MODELOS;

import java.time.LocalDate;

public class Asegurados {
    private String nombre;                     // Nombre de la aseguradora
    private String tipo;                       // Tipo de seguro (salud, vida, auto, etc.)
    private String direccion;                  // Dirección de la sede
    private String telefono;                   // Número de contacto
    private String email;                      // Correo electrónico
    private String sitioWeb;                   // Página web
    private String pais;                       // País de operación
    private String ciudad;                     // Ciudad de operación
    private String codigoPostal;
    private LocalDate fechaFundacion;
    private String numeroLicencia;             // Número de licencia de operación
    private double capitalSocial;              // Capital social de la aseguradora
    private String nombreRepresentante;        // Nombre del representante legal
    private String emailRepresentante;         // Correo electrónico del representante
    private String telefonoRepresentante;      // Teléfono del representante
    private String politicaPrivacidad;         // Política de privacidad

    // Constructor


    public Asegurados() {
    }

    public Asegurados(String nombre, String tipo, String direccion, String telefono, String email, String sitioWeb, String pais, String ciudad, String codigoPostal, LocalDate fechaFundacion, String numeroLicencia, double capitalSocial, String nombreRepresentante, String emailRepresentante, String telefonoRepresentante, String politicaPrivacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.sitioWeb = sitioWeb;
        this.pais = pais;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.fechaFundacion = fechaFundacion;
        this.numeroLicencia = numeroLicencia;
        this.capitalSocial = capitalSocial;
        this.nombreRepresentante = nombreRepresentante;
        this.emailRepresentante = emailRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
        this.politicaPrivacidad = politicaPrivacidad;
    }

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

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    public void setEmailRepresentante(String emailRepresentante) {
        this.emailRepresentante = emailRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getPoliticaPrivacidad() {
        return politicaPrivacidad;
    }

    public void setPoliticaPrivacidad(String politicaPrivacidad) {
        this.politicaPrivacidad = politicaPrivacidad;
    }

    @Override
    public String toString() {
        return "Asegurados{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", numeroLicencia='" + numeroLicencia + '\'' +
                ", capitalSocial=" + capitalSocial +
                ", nombreRepresentante='" + nombreRepresentante + '\'' +
                ", emailRepresentante='" + emailRepresentante + '\'' +
                ", telefonoRepresentante='" + telefonoRepresentante + '\'' +
                ", politicaPrivacidad='" + politicaPrivacidad + '\'' +
                '}';
    }
}

