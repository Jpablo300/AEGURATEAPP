package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Asegurados aseguradosUno=new Asegurados();
        Asegurados aseguradosDos=new Asegurados("juan","masculino","calle 70","3235477564","juan@gmail.com","Asegurate APP","Colombia","medellin","234232", LocalDate.now(),"23",1200000,"Ana","ana@gmail.com","123456789","prvencion de perdidad");

        Vehiulos vehiulosUno=new Vehiulos();
        Vehiulos vehiulosDos=new Vehiulos("BMW","2024",2024,"Negro","serie 4","23","FGR123",2.000000,8000,"De avion",2,true,"Manual","DTC","Carlos","2323345345");


        Accidente accidenteUno=new Accidente();
        Accidente accidenteDos=new Accidente(LocalDate.now(),"estadio","moto","Arollado",2,"vulnerable",2.30,"si","daños a terceros","maria y juan");

        Aseguradora aseguradoraUno=new Aseguradora();
        Aseguradora aseguradoraDos=new Aseguradora("Sura","daños a terceros","calle30","3232899334","sura@gmail.com","facebook","Colombia","Medellin","12","20");

        Beneficiario beneficiarioUno=new Beneficiario();
        Beneficiario beneficiarioDos=new Beneficiario("Mario","Alavrez",LocalDate.now(),"Si","23","calee 78","232123456","Mario@gmail.com",10.9,true);

        System.out.println(aseguradoraUno);
        System.out.println(accidenteDos);

        System.out.println(vehiulosUno);
        System.out.println(vehiulosDos);

        System.out.println(accidenteUno);
        System.out.println(accidenteDos);

        System.out.println(aseguradoraUno);
        System.out.println(aseguradoraDos);

        System.out.println(beneficiarioUno);
        System.out.println(beneficiarioDos);

        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.println("Ingrese el nombre de la aseguradora:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tipo de seguro (salud, vida, auto, etc.):");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese la dirección de la sede:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el número de contacto:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico:");
        String email = scanner.nextLine();

        System.out.println("Ingrese la página web:");
        String sitioWeb = scanner.nextLine();

        System.out.println("Ingrese el país de operación:");
        String pais = scanner.nextLine();

        System.out.println("Ingrese la ciudad de operación:");
        String ciudad = scanner.nextLine();

        System.out.println("Ingrese el código postal:");
        String codigoPostal = scanner.nextLine();

        System.out.println("Ingrese la fecha de fundación (formato YYYY-MM-DD):");
        String fechaInput = scanner.nextLine();
        LocalDate fechaFundacion = LocalDate.parse(fechaInput);

        System.out.println("Ingrese el número de licencia de operación:");
        String numeroLicencia = scanner.nextLine();

        System.out.println("Ingrese el capital social:");
        double capitalSocial = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el nombre del representante legal:");
        String nombreRepresentante = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del representante:");
        String emailRepresentante = scanner.nextLine();

        System.out.println("Ingrese el teléfono del representante:");
        String telefonoRepresentante = scanner.nextLine();

        System.out.println("Ingrese la política de privacidad:");
        String politicaPrivacidad = scanner.nextLine();


        // Solicitar información al usuario
        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese el año de fabricación:");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el color del vehículo:");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de vehículo (sedán, SUV, etc.):");
        String tipob = scanner.nextLine();

        System.out.println("Ingrese el número de identificación del vehículo (VIN):");
        String numeroVin = scanner.nextLine();

        System.out.println("Ingrese el número de placa:");
        String placa = scanner.nextLine();

        System.out.println("Ingrese el precio del vehículo:");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el kilometraje recorrido:");
        int kilometraje = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el tipo de combustible (gasolina, diésel, eléctrico, etc.):");
        String combustible = scanner.nextLine();

        System.out.println("Ingrese el número de puertas:");
        int puertas = scanner.nextInt();

        System.out.println("¿Tiene aire acondicionado? (true/false):");
        boolean aireAcondicionado = scanner.nextBoolean();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el tipo de transmisión (manual, automática):");
        String transmision = scanner.nextLine();

        System.out.println("Ingrese el tipo de registro (nuevo, usado):");
        String tipoRegistro = scanner.nextLine();

        System.out.println("Ingrese el nombre del propietario del vehículo:");
        String nombrePropietario = scanner.nextLine();

        System.out.println("Ingrese el teléfono del propietario:");
        String telefonoPropietario = scanner.nextLine();

        // Solicitar información del vehículo
        System.out.println("Ingrese la marca del vehículo:");
        String marcab = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelob = scanner.nextLine();

        System.out.println("Ingrese el año de fabricación:");
        int anob = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el color del vehículo:");
        String colorb = scanner.nextLine();

        System.out.println("Ingrese el tipo de vehículo (sedán, SUV, etc.):");
        String tipoop = scanner.nextLine();

        System.out.println("Ingrese el número de identificación del vehículo (VIN):");
        String numeroVinb = scanner.nextLine();

        System.out.println("Ingrese el número de placa:");
        String placab = scanner.nextLine();

        System.out.println("Ingrese el precio del vehículo:");
        double preciob = scanner.nextDouble();

        System.out.println("Ingrese el kilometraje recorrido:");
        int kilometrajeb = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el tipo de combustible (gasolina, diésel, eléctrico, etc.):");
        String combustibleb = scanner.nextLine();

        System.out.println("Ingrese el número de puertas:");
        int puertasb = scanner.nextInt();

        System.out.println("¿Tiene aire acondicionado? (true/false):");
        boolean aireAcondicionadob = scanner.nextBoolean();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el tipo de transmisión (manual, automática):");
        String transmisionb = scanner.nextLine();

        System.out.println("Ingrese el tipo de registro (nuevo, usado):");
        String tipoRegistrob = scanner.nextLine();

        System.out.println("Ingrese el nombre del propietario del vehículo:");
        String nombrePropietariob = scanner.nextLine();

        System.out.println("Ingrese el teléfono del propietario:");
        String telefonoPropietariob = scanner.nextLine();

        // Solicitar información de la aseguradora
        System.out.println("Ingrese el nombre de la aseguradora:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el tipo de seguros ofrecidos (vida, salud, auto, etc.):");
        String tipos = scanner.nextLine();

        System.out.println("Ingrese la dirección de la sede:");
        String direccions = scanner.nextLine();

        System.out.println("Ingrese el número de contacto:");
        String telefonos = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico:");
        String emails = scanner.nextLine();

        System.out.println("Ingrese la página web de la aseguradora:");
        String sitioWebs = scanner.nextLine();

        System.out.println("Ingrese el país de operación:");
        String paisb = scanner.nextLine();

        System.out.println("Ingrese la ciudad donde está ubicada:");
        String ciudads = scanner.nextLine();

        System.out.println("Ingrese el código postal:");
        String codigoPostals = scanner.nextLine();

        System.out.println("Ingrese el número de licencia de operación:");
        String numeroLicencias = scanner.nextLine();

        // Solicitar información del beneficiario
        System.out.println("Ingrese el nombre del beneficiario:");
        String nombress = scanner.nextLine();

        System.out.println("Ingrese el apellido del beneficiario:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        String fechaNacimientoInput = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoInput);

        System.out.println("Ingrese la relación con el asegurado:");
        String relacion = scanner.nextLine();

        System.out.println("Ingrese el documento de identidad:");
        String id = scanner.nextLine();

        System.out.println("Ingrese la dirección del beneficiario:");
        String direccionc = scanner.nextLine();

        System.out.println("Ingrese el número de contacto:");
        String telefonoc = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico:");
        String emailc = scanner.nextLine();

        System.out.println("Ingrese el porcentaje del beneficio asignado:");
        double porcentajeBeneficio = scanner.nextDouble();

        System.out.println("¿El beneficiario está activo? (true/false):");
        boolean estado = scanner.nextBoolean();


    }
}