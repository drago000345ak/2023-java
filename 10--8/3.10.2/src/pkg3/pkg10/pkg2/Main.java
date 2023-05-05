package pkg3.pkg10.pkg2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; // Variable para almacenar el total de compras
        
        boolean continuarComprando = true;
        
        while (continuarComprando) {
            System.out.print("Ingrese el precio del artículo (0 para finalizar): ");
            double precio = scanner.nextDouble();
            
            if (precio == 0) {
                continuarComprando = false;
                break;
            }
            
            System.out.print("Ingrese la cantidad de artículos: ");
            int cantidad = scanner.nextInt();
            
            double subtotal = precio * cantidad;
            total += subtotal;
            
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("------------------------------");
        }
        
        System.out.println("Total de compras: $" + total);
        
        scanner.close();
    }
}
