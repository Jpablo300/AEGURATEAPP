package org.example.MODELOS;

import java.time.LocalDate;

public class Accidente {

    private LocalDate fecha;
    private String lugar;                     // Lugar donde ocurrió el accidente
    private String tipoVehiculoInvolucrado;  // Tipo de vehículo involucrado
    private String descripcion;                // Descripción del accidente
    private int numeroInvolucrados;           // Número de personas involucradas
    private String estado;                     // Estado de las personas involucradas (heridos, fallecidos, etc.)
    private double danosMateriales;            // Daños materiales estimados
    private String reportePolicial;            // Número o referencia del reporte policial
    private String causas;
    private String nombreTestigos;


    public Accidente() {
    }

    public Accidente(LocalDate fecha, String lugar, String tipoVehiculoInvolucrado, String descripcion, int numeroInvolucrados, String estado, double danosMateriales, String reportePolicial, String causas, String nombreTestigos) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.tipoVehiculoInvolucrado = tipoVehiculoInvolucrado;
        this.descripcion = descripcion;
        this.numeroInvolucrados = numeroInvolucrados;
        this.estado = estado;
        this.danosMateriales = danosMateriales;
        this.reportePolicial = reportePolicial;
        this.causas = causas;
        this.nombreTestigos = nombreTestigos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoVehiculoInvolucrado() {
        return tipoVehiculoInvolucrado;
    }

    public void setTipoVehiculoInvolucrado(String tipoVehiculoInvolucrado) {
        this.tipoVehiculoInvolucrado = tipoVehiculoInvolucrado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroInvolucrados() {
        return numeroInvolucrados;
    }

    public void setNumeroInvolucrados(int numeroInvolucrados) {
        this.numeroInvolucrados = numeroInvolucrados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDanosMateriales() {
        return danosMateriales;
    }

    public void setDanosMateriales(double danosMateriales) {
        this.danosMateriales = danosMateriales;
    }

    public String getReportePolicial() {
        return reportePolicial;
    }

    public void setReportePolicial(String reportePolicial) {
        this.reportePolicial = reportePolicial;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getNombreTestigos() {
        return nombreTestigos;
    }

    public void setNombreTestigos(String nombreTestigos) {
        this.nombreTestigos = nombreTestigos;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "fecha=" + fecha +
                ", lugar='" + lugar + '\'' +
                ", tipoVehiculoInvolucrado='" + tipoVehiculoInvolucrado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroInvolucrados=" + numeroInvolucrados +
                ", estado='" + estado + '\'' +
                ", danosMateriales=" + danosMateriales +
                ", reportePolicial='" + reportePolicial + '\'' +
                ", causas='" + causas + '\'' +
                ", nombreTestigos='" + nombreTestigos + '\'' +
                '}';
    }
}



