package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio36_21 {
    public static void main(String[] args) {
//        21. Realiza un programa que pida las notas de las tres evaluaciones del módulo
//        Programación y muestre la nota final (la nota final es la media de las tres
//        evaluaciones).

        Scanner sc = new Scanner(System.in);
        // for que itere 3 veces para meter las notas e ir sumando
        double suma = 0;
        double nota;
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + " evaluación: ");
            nota = sc.nextDouble();
            suma = suma + nota;
        }
        // cuando termino de pedir las notas y de sumarlas, calculo media
        double media = suma / 3;
        System.out.printf("Nota final = %.2f", media);

    }
}
