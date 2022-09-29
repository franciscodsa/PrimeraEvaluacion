package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
//        31. Escribe un programa que lea un valor por teclado
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
//        y verifique si es menor que 10.
        boolean menorQue10 = valor < 10;
//        El programa debe imprimir un booleano (true o false).
        System.out.println(menorQue10);
    }
}
