package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

//        16. Realiza un programa que pida el lado de un cuadrado,
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el lado del cuadrado en cms: ");
        double lado = sc.nextDouble();

        // calcular el perímetro(El perímetro de un cuadrado se calcula multiplicando el valor
        //del lado por cuatro).
        double perimetro = lado * 4;

//        y muestre por pantalla el //perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
//del lado por cuatro).
        System.out.println("Perímetro: " + perimetro + " cms.");


    }
}
