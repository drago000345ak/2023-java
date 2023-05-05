
package pkg3.pkg10.pkg6;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de gallinas en la granja: ");
        int numGallinas = scanner.nextInt();

        double sumaCalidad = 0;

        for (int i = 1; i <= numGallinas; i++) {
            System.out.print("Ingrese el peso de la gallina " + i + ": ");
            double pesoGallina = scanner.nextDouble();

            System.out.print("Ingrese la altura de la gallina " + i + ": ");
            double alturaGallina = scanner.nextDouble();

            System.out.print("Ingrese el numero de huevos que pone la gallina " + i + ": ");
            int numHuevos = scanner.nextInt();

            double calidadGallina = calcularCalidadGallina(pesoGallina, alturaGallina, numHuevos);
            sumaCalidad += calidadGallina;
        }

        double promedioCalidad = sumaCalidad / numGallinas;
        double precioKiloHuevo = calcularPrecioKiloHuevo(promedioCalidad);

        System.out.println("El precio de venta por cada kilo de huevo es: $" + precioKiloHuevo);
    }

    public static double calcularCalidadGallina(double peso, double altura, int numHuevos) {
        double calidad = (peso * altura) / numHuevos;
        return calidad;
    }

    public static double calcularPrecioKiloHuevo(double promedioCalidad) {
        double precio;

        if (promedioCalidad >= 15) {
            precio = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8 && promedioCalidad < 15) {
            precio = 1.0 * promedioCalidad;
        } else {
            precio = 0.8 * promedioCalidad;
        }

        return precio;
    }
}