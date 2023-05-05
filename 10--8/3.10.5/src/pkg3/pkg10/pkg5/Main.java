package pkg3.pkg10.pkg5;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de obreros: ");
        int numObreros = scanner.nextInt();

        double[] horasTrabajo = new double[numObreros];
        double[] pagoSemanal = new double[numObreros];

        for (int i = 0; i < numObreros; i++) {
            System.out.print("Ingrese las horas trabajadas por el obrero " + (i + 1) + ": ");
            horasTrabajo[i] = scanner.nextDouble();

            pagoSemanal[i] = calcularPagoSemanal(horasTrabajo[i]);
        }

        System.out.println("Cantidad semanal de dinero que recibirá cada obrero:");
        for (int i = 0; i < numObreros; i++) {
            System.out.println("Obrero " + (i + 1) + ": $" + pagoSemanal[i]);
        }
    }

    public static double calcularPagoSemanal(double horasTrabajo) {
        double horasNormales = Math.min(horasTrabajo, 40);
        // Máximo de 40 horas normales
        double horasExtras = Math.max(horasTrabajo - 40, 0);
// Horas extras más allá de las 40

        double pagoHoraNormal = 10.0;
        // Pago por hora normal
        double pagoHoraExtraSimple = pagoHoraNormal * 2;
// Pago por hora extra simple
        double pagoHoraExtraDoble = pagoHoraNormal * 2 * 2;
// Pago por hora extra doble
        double pagoHoraExtraTriple = pagoHoraNormal * 2 * 3;
// Pago por hora extra triple

        double pagoSemanal = horasNormales * pagoHoraNormal;
// Pago por horas normales
        pagoSemanal += Math.min(horasExtras, 8) * pagoHoraExtraSimple;
// Pago por primeras 8 horas extras
        pagoSemanal += Math.max(horasExtras - 8, 0) * pagoHoraExtraDoble;
// Pago por horas extras adicionales

        return pagoSemanal;
    }
}
