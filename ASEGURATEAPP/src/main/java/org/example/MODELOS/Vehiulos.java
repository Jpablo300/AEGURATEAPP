package org.example.MODELOS;

public class Vehiulos {

    private String marca;                 // Marca del vehículo
    private String modelo;                // Modelo del vehículo
    private int ano;                      // Año de fabricación
    private String color;                 // Color del vehículo
    private String tipo;                  // Tipo de vehículo (sedán, SUV, etc.)
    private String numeroVin;             // Número de identificación del vehículo (VIN)
    private String placa;                 // Número de placa
    private double precio;                // Precio del vehículo
    private int kilometraje;              // Kilometraje recorrido
    private String combustible;           // Tipo de combustible (gasolina, diésel, eléctrico, etc.)
    private int puertas;                  // Número de puertas
    private boolean aireAcondicionado;    // Indica si tiene aire acondicionado
    private String transmision;            // Tipo de transmisión (manual, automática)
    private String tipoRegistro;          // Tipo de registro (nuevo, usado)
    private String nombrePropietario;     // Nombre del propietario del vehículo
    private String telefonoPropietario;   // Teléfono del propietario

    // Constructor

    public Vehiulos() {
    }

    public Vehiulos(String marca, String modelo, int ano, String color,
                    String tipo, String numeroVin, String placa,
                    double precio, int kilometraje, String combustible,
                    int puertas, boolean aireAcondicionado,
                    String transmision, String tipoRegistro,
                    String nombrePropietario, String telefonoPropietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.tipo = tipo;
        this.numeroVin = numeroVin;
        this.placa = placa;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.combustible = combustible;
        this.puertas = puertas;
        this.aireAcondicionado = aireAcondicionado;
        this.transmision = transmision;
        this.tipoRegistro = tipoRegistro;
        this.nombrePropietario = nombrePropietario;
        this.telefonoPropietario = telefonoPropietario;
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroVin() {
        return numeroVin;
    }

    public void setNumeroVin(String numeroVin) {
        this.numeroVin = numeroVin;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getTelefonoPropietario() {
        return telefonoPropietario;
    }

    public void setTelefonoPropietario(String telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    @Override
    public String toString() {
        return "Vehículo: " +
                "Marca: " + marca + ", " +
                "Modelo: " + modelo + ", " +
                "Año: " + ano + ", " +
                "Color: " + color + ", " +
                "Tipo: " + tipo + ", " +
                "Número VIN: " + numeroVin + ", " +
                "Placa: " + placa + ", " +
                "Precio: $" + precio + ", " +
                "Kilometraje: " + kilometraje + " km, " +
                "Combustible: " + combustible + ", " +
                "Número de Puertas: " + puertas + ", " +
                "Aire Acondicionado: " + (aireAcondicionado ? "Sí" : "No") + ", " +
                "Transmisión: " + transmision + ", " +
                "Tipo de Registro: " + tipoRegistro + ", " +
                "Nombre del Propietario: " + nombrePropietario + ", " +
                "Teléfono del Propietario: " + telefonoPropietario;
    }
}
