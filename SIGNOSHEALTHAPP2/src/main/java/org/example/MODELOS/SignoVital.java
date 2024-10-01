package org.example.MODELOS;

public class SignoVital {
    public class SignosVitales {
        private int frecuenciaCardiaca; // en latidos por minuto
        private String presionArterial; // formato: "sistólica/diastólica"
        private double temperaturaCorporal; // en grados Celsius
        private int frecuenciaRespiratoria; // en respiraciones por minuto
        private double saturacionOxigeno; // en porcentaje
        private double glucosa; // en mg/dL
        private double colesterol; // en mg/dL
        private int peso; // en kilogramos
        private int altura; // en centímetros
        private double indiceMasaCorporal; // IMC

        // Constructor


        public SignosVitales() {
        }

        public SignosVitales(int frecuenciaCardiaca, String presionArterial,
                             double temperaturaCorporal, int frecuenciaRespiratoria,
                             double saturacionOxigeno, double glucosa,
                             double colesterol, int peso, int altura) {
            this.frecuenciaCardiaca = frecuenciaCardiaca;
            this.presionArterial = presionArterial;
            this.temperaturaCorporal = temperaturaCorporal;
            this.frecuenciaRespiratoria = frecuenciaRespiratoria;
            this.saturacionOxigeno = saturacionOxigeno;
            this.glucosa = glucosa;
            this.colesterol = colesterol;
            this.peso = peso;
            this.altura = altura;
            this.indiceMasaCorporal = calcularIMC(peso, altura);
        }

        // Método para calcular IMC
        private double calcularIMC(int peso, int altura) {
            double alturaMetros = altura / 100.0;
            return peso / (alturaMetros * alturaMetros);
        }

        // Métodos getters y setters
        public int getFrecuenciaCardiaca() {
            return frecuenciaCardiaca;
        }

        public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
            this.frecuenciaCardiaca = frecuenciaCardiaca;
        }

        public String getPresionArterial() {
            return presionArterial;
        }

        public void setPresionArterial(String presionArterial) {
            this.presionArterial = presionArterial;
        }

        public double getTemperaturaCorporal() {
            return temperaturaCorporal;
        }

        public void setTemperaturaCorporal(double temperaturaCorporal) {
            this.temperaturaCorporal = temperaturaCorporal;
        }

        public int getFrecuenciaRespiratoria() {
            return frecuenciaRespiratoria;
        }

        public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
            this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        }

        public double getSaturacionOxigeno() {
            return saturacionOxigeno;
        }

        public void setSaturacionOxigeno(double saturacionOxigeno) {
            this.saturacionOxigeno = saturacionOxigeno;
        }

        public double getGlucosa() {
            return glucosa;
        }

        public void setGlucosa(double glucosa) {
            this.glucosa = glucosa;
        }

        public double getColesterol() {
            return colesterol;
        }

        public void setColesterol(double colesterol) {
            this.colesterol = colesterol;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
            this.indiceMasaCorporal = calcularIMC(peso, altura);
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
            this.indiceMasaCorporal = calcularIMC(peso, altura);
        }

        public double getIndiceMasaCorporal() {
            return indiceMasaCorporal;
        }

        @Override
        public String toString() {
            return "Signos Vitales: " +
                    "Frecuencia Cardíaca: " + frecuenciaCardiaca + " bpm, " +
                    "Presión Arterial: " + presionArterial + ", " +
                    "Temperatura Corporal: " + temperaturaCorporal + " °C, " +
                    "Frecuencia Respiratoria: " + frecuenciaRespiratoria + " rpm, " +
                    "Saturación de Oxígeno: " + saturacionOxigeno + " %, " +
                    "Glucosa: " + glucosa + " mg/dL, " +
                    "Colesterol: " + colesterol + " mg/dL, " +
                    "Peso: " + peso + " kg, " +
                    "Altura: " + altura + " cm, " +
                    "Índice de Masa Corporal: " + indiceMasaCorporal;
        }
    }

}
