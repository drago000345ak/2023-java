package pkg3.pkg10.pkg1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes: ");
        int numClientes = scanner.nextInt();

        for (int i = 1; i <= numClientes; i++) {
            System.out.println("Cliente " + i + ":");
            System.out.print("Ingrese el total de la compra: ");
            double totalCompra = scanner.nextDouble();

            System.out.print("Ingrese el color de la bolita (roja/amarilla/blanca): ");
            String colorBolita = scanner.next();

            double descuento = 0.0;
            if (colorBolita.equalsIgnoreCase("roja")) {
                descuento = totalCompra * 0.40;
            } else if (colorBolita.equalsIgnoreCase("amarilla")) {
                descuento = totalCompra * 0.25;
            }

            double totalPagar = totalCompra - descuento;
            System.out.println("El cliente debe pagar: $" + totalPagar);
            System.out.println();
        }
    }
}

   
