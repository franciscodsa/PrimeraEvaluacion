package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
//        18. Hacer un programa que lea una temperatura en grados centígrados,
        Scanner sc = new Scanner(System.in);
        double centigrados = sc.nextDouble();

//        y la calcule y
//        visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:
//        Reamur = Centígrados x 0.8
        double reamur = centigrados * 0.8;
//        Fahenheit = (Centígrados * 9/5)+32
        double farenheit = (centigrados * 9 / 5) + 32;
//        Kelvin = Centígrados + 273
        double kelvin = centigrados + 273;

        System.out.printf("Reamur: %.2f\n", reamur);
        System.out.printf("Farenheit: %.2f\n", farenheit);
        System.out.printf("Kelvin: %.2f", kelvin);
    }
}
