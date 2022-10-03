package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
//        20. Realizar un programa que lea cuatro valores numéricos

        // como vamos a tener que calcular la media, trabajamos con valores decimales
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        //        e imprima su suma y su media. Ten en cuenta que la media puede contener decimales.
        double suma = n1 + n2 + n3 + n4;
        double media = suma / 4;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
