package pkg3.pkg10.pkg4;

public class Main {

  public static void main(String[] args) {
        double presion = 1.5; // Presión en unidades adecuadas
        double volumen = 10; // Volumen en unidades adecuadas
        double temperatura = 25; // Temperatura en grados Celsius

        double masaAire = calcularMasaAire(presion, volumen, temperatura);
        System.out.println("La masa de aire es: " + masaAire + " unidades");
    }

    public static double calcularMasaAire(double presion, double volumen, double temperatura) {
        double masa = (presion * volumen * 0.37) / (temperatura + 460);
        return masa;
    }
}
