
package pkg3.pkg11.pkg1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * El profesor de una materia desea conocer la cantidad de sus alumnos que no
         * tienen derecho al examen de nivelación.
         * - Diseñe un pseudocódigo que lea las calificaciones obtenidas en las 5
         * unidades por
         * cada uno de los 40 alumnos y escriba la cantidad de ellos que no tienen
         * derecho al
         * examen de nivelación.
         */

        Scanner scan = new Scanner(System.in);
        double u1, u2, u3, u4, u5, promedio;
        int nivelan = 0, nestudiante = 0;
        while (nestudiante != 40) {
            nestudiante++;
            System.out.println("Ingrese las calificaciones de las 5 unidades del alumno " + nestudiante);
            u1 = scan.nextDouble();
            u2 = scan.nextDouble();
            u3 = scan.nextDouble();
            u4 = scan.nextDouble();
            u5 = scan.nextDouble();
            promedio = (u1 + u2 + u3 + u4 + u5) / 5;
            System.out.println("El promedio del estudiante " + nestudiante + " es de: " + promedio);
            if (promedio < 3.0 & promedio >= 2.5) {
                nivelan++;
            }
        }
        System.out.println("El total de estudiantes que nivelan es de: " + nivelan);
        scan.close();
    }
}
