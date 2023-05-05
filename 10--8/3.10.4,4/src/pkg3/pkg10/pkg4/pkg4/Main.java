package pkg3.pkg10.pkg4.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de vehículos: ");
        int numVehiculos = scanner.nextInt();

        double sumaMasas = 0;

        for (int i = 1; i <= numVehiculos; i++) {
            System.out.print("Ingrese la masa de aire del neumático del vehículo " + i + ": ");
            double masaAire = scanner.nextDouble();
            sumaMasas += masaAire;
        }

        double promedioMasas = sumaMasas / numVehiculos;

        System.out.println("El promedio de masa de aire de los neumáticos es: " + promedioMasas);
    }
}