
package pkg3.pkg11.pkg2;

import java.util.Scanner;

public class Main {
    /*
     * Diseñe un diagrama que lea los 2,500,000 votos otorgados a los 3 candidatos a
     * gobernador e imprima el número del candidato ganador y su cantidad de votos.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int voto, votantes = 0, c1 = 0, c2 = 0, c3 = 0;
        while (votantes != 2500000) {
            votantes++;
            System.out.println("Candidato por el que vota.");
            System.out.println("1. Candidato 1.");
            System.out.println("2. Candidato 2.");
            System.out.println("3. Candidato 3.");
            voto = scan.nextInt();
            switch (voto) {
                case 1:
                    c1 = c1 + 1;
                    break;
                case 2:
                    c2 = c2 + 1;
                    break;
                case 3:
                    c3 = c3 + 1;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        if (c1 >= c2 & c1 >= c3) {
            System.out.println("El total de votos al candidato 1 es: " + c1);
        }
        if (c2 >= c1 & c2 >= c3) {
            System.out.println("El total de votos al candidato 2 es: " + c2);
        }
        if (c3 >= c2 & c3 >= c2) {
            System.out.println("El total de votos al candidato 3 es: " + c3);
        }
        scan.close();
    }

}
