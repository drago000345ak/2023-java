package pkg3.pkg10.pkg8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de artículos que compró: ");
        int numArticulos = scanner.nextInt();
        
        double totalPagar = 0.0;
        
        for (int i = 1; i <= numArticulos; i++) {
            System.out.print("Ingrese el precio del artículo " + i + ": ");
            double precio = scanner.nextDouble();
            
            System.out.print("Ingrese el color de la etiqueta (roja/negra): ");
            String colorEtiqueta = scanner.next();
            
            if (colorEtiqueta.equalsIgnoreCase("roja")) {
                double descuento = precio * 0.20;
                precio -= descuento;
            }
            
            totalPagar += precio;
        }
        
        System.out.println("El total a pagar es: $" + totalPagar);
    }
}
