package org.example.MODELOS;

public class Enfermedad {
    private String nombre;                  // Nombre de la enfermedad
    private String descripcion;             // Descripción de la enfermedad
    private String sintomas;                 // Síntomas asociados
    private String causa;                    // Causas de la enfermedad
    private String tratamiento;              // Tratamientos recomendados
    private String diagnostico;              // Diagnóstico médico
    private boolean contagiosa;              // Indica si es contagiosa
    private String riesgoComplicaciones;     // Riesgo de complicaciones
    private String grupoEtarioAfectado;     // Grupo de edad más afectado
    private String prevencion;               // Medidas de prevención

    // Constructor

    public Enfermedad() {
    }

    public Enfermedad(String nombre, String descripcion, String sintomas,
                      String causa, String tratamiento, String diagnostico,
                      boolean contagiosa, String riesgoComplicaciones,
                      String grupoEtarioAfectado, String prevencion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sintomas = sintomas;
        this.causa = causa;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
        this.contagiosa = contagiosa;
        this.riesgoComplicaciones = riesgoComplicaciones;
        this.grupoEtarioAfectado = grupoEtarioAfectado;
        this.prevencion = prevencion;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isContagiosa() {
        return contagiosa;
    }

    public void setContagiosa(boolean contagiosa) {
        this.contagiosa = contagiosa;
    }

    public String getRiesgoComplicaciones() {
        return riesgoComplicaciones;
    }

    public void setRiesgoComplicaciones(String riesgoComplicaciones) {
        this.riesgoComplicaciones = riesgoComplicaciones;
    }

    public String getGrupoEtarioAfectado() {
        return grupoEtarioAfectado;
    }

    public void setGrupoEtarioAfectado(String grupoEtarioAfectado) {
        this.grupoEtarioAfectado = grupoEtarioAfectado;
    }

    public String getPrevencion() {
        return prevencion;
    }

    public void setPrevencion(String prevencion) {
        this.prevencion = prevencion;
    }

    @Override
    public String toString() {
        return "Enfermedad: " +
                "Nombre: " + nombre + ", " +
                "Descripción: " + descripcion + ", " +
                "Síntomas: " + sintomas + ", " +
                "Causa: " + causa + ", " +
                "Tratamiento: " + tratamiento + ", " +
                "Diagnóstico: " + diagnostico + ", " +
                "Contagiosa: " + (contagiosa ? "Sí" : "No") + ", " +
                "Riesgo de Complicaciones: " + riesgoComplicaciones + ", " +
                "Grupo Etario Afectado: " + grupoEtarioAfectado + ", " +
                "Prevención: " + prevencion;
    }
}


