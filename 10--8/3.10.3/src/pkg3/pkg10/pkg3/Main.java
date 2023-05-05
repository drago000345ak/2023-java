package pkg3.pkg10.pkg3;

public class Main {

public class TeatroDescuentos {
    public static void main(String[] args) {
        int precioAsiento = 100; // Precio único de los asientos
        int[] cantidadClientes = {10, 15, 20, 12, 8}; // Cantidad de clientes en cada categoría
        double[] descuentos = {0.35, 0.25, 0.10, 0.25, 0.35}; // Descuentos en cada categoría
        
        double[] dineroDejadoDePercibir = new double[cantidadClientes.length];
        
        for (int i = 0; i < cantidadClientes.length; i++) {
            dineroDejadoDePercibir[i] = precioAsiento * descuentos[i] * cantidadClientes[i];
        }
        
        System.out.println("Cantidad de dinero dejado de percibir por categoría:");
        for (int i = 0; i < cantidadClientes.length; i++) {
            System.out.println("Categoría " + (i+1) + ": $" + dineroDejadoDePercibir[i]);
        }
    }
}

