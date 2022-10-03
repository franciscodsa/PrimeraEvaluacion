package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
//        21. Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1ª evaluación: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2ª evaluación: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3ª evaluación: ");
        double n3 = sc.nextDouble();
//        y muestre la nota final (la nota final es la media de las tres evaluaciones).
        double suma = n1 + n2 + n3;
        double media = suma / 3;
        // queremos mostrar la media con 2 decimales -> souf
        System.out.printf("La nota final es %.2f", media);
    }
}
