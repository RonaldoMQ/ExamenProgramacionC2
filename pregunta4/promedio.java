package pregunta4;

import java.util.*;

public class promedio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media;

        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);

        double[] notas = new double[numAlum];

        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        media = suma / notas.length;

        System.out.printf("Nota media del curso: %.2f %n", media);

        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1) + " Nota final: " + notas[i]);
            }
        }
    }
}