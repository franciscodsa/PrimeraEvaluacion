package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio36_22 {
    public static void main(String[] args) {
//        22. Realiza un programa que pida las notas finales de todos los módulos de 1o y muestre la nota final del curso.
//        La nota final es la media de las notas de todos los módulos, redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si
//        es 7,4, la nota final es 7). --> método Math.round(nota)

        Scanner sc = new Scanner(System.in);
        double nota; // aquí guardamos las notas según entran por teclado
        double media;
        double suma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Nota módulo " + (i + 1) + ":");
            nota = sc.nextDouble();
            suma = suma + nota;
        }
        media = suma / 6;
        // tenemos que redondearla -> NEW: método Math.round
        media = Math.round(media); // redondeamos la media y la guardamos en su sitio
        System.out.printf("Media: %.0f", media); // lo muestra sin decimales
    }
}
