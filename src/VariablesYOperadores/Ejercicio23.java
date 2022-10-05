package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
//        23. Realiza un programa que pida un número y un porcentaje,
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        double numero = sc.nextDouble(); // ejemplo: 500
        System.out.print("Porcentaje: ");
        double porcentaje = sc.nextDouble(); // ejemplo: 3.5
//        y
//        a. Calcule
        double porcentajeCalculado = numero * porcentaje / 100; // 17.5
        //System.out.println(porcentajeCalculado);

//        y muestre ese número incrementado en ese porcentaje.
        double incrementadoConPorcentaje = numero + porcentajeCalculado; // 500 + 17,5
        System.out.println(numero + " incrementado en un " + porcentaje + "% es " + incrementadoConPorcentaje);

//        b. Calcule y muestre ese número decrementado en ese porcentaje.
        double decrementadoConPorcentaje = numero - porcentajeCalculado; // 500 - 17.5
        System.out.println(numero + " decrementado en un " + porcentaje + "% es " + decrementadoConPorcentaje);
    }
}
