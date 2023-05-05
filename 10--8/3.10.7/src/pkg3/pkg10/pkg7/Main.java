package pkg3.pkg10.pkg7;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de diputados: ");
        int numDiputados = scanner.nextInt();

        int numFavor = 0;
        int numContra = 0;
        int numAbstencion = 0;

        for (int i = 1; i <= numDiputados; i++) {
            System.out.print("Ingrese la opinión del diputado " + i + " (1: A favor, 2: En contra, 3: Abstención): ");
            int opinion = scanner.nextInt();

            if (opinion == 1) {
                numFavor++;
            } else if (opinion == 2) {
                numContra++;
            } else if (opinion == 3) {
                numAbstencion++;
            }
        }

        double porcentajeFavor = (double) numFavor / numDiputados * 100;
        double porcentajeContra = (double) numContra / numDiputados * 100;
        double porcentajeAbstencion = (double) numAbstencion / numDiputados * 100;

        System.out.println("Porcentaje de diputados a favor: " + porcentajeFavor + "%");
        System.out.println("Porcentaje de diputados en contra: " + porcentajeContra + "%");
        System.out.println("Porcentaje de diputados que se abstienen: " + porcentajeAbstencion + "%");
    }
}