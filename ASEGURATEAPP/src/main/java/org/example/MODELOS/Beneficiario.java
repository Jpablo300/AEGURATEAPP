package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {
    private String nombre;               // Nombre del beneficiario
    private String apellido;
    private LocalDate fechaNacimiento;
    private String relacion;             // Relación con el asegurado
    private String id;                  // Documento de identidad
    private String direccion;            // Dirección del beneficiario
    private String telefono;             // Número de contacto
    private String email;                // Correo electrónico
    private double porcentajeBeneficio;  // Porcentaje del beneficio asignado
    private boolean estado;              // Estado del beneficiario (activo, inactivo)

    public Beneficiario() {
    }

    public Beneficiario(String nombre, String apellido, LocalDate fechaNacimiento, String relacion, String id, String direccion, String telefono, String email, double porcentajeBeneficio, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.relacion = relacion;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", relacion='" + relacion + '\'' +
                ", id='" + id + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                ", estado=" + estado +
                '}';
    }
}
