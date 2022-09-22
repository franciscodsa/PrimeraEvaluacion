package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
cuántas sobrarán tras el reparto.
         */

        // Pedimos el número de ardillas y de nueces
        Scanner sc = new Scanner(System.in);
        System.out.print("Nº de ardillas: ");
        int N = sc.nextInt();
        System.out.print("Nº de nueces: ");
        int K = sc.nextInt();

        // Las dividimos (división entera)
        int cociente = K / N; // son las nueces que corresponden a cada ardilla
        int resto = K % N; // son las que sobran

        // Mostramos el resultado
        System.out.println("Tocan a " + cociente + " nuecees por ardilla y" +
                " sobran " + resto + " nueces.");
    }
}
