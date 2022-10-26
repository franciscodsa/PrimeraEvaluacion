package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
//        38. Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive.
        Scanner sc = new Scanner(System.in);
        int número = 0; // lo declaro antes para poder imprimirlo después, fuera del bucle
        do {
            System.out.print("Introduce un número entre 1 y 100, ambos inclusive: ");
            número = sc.nextInt();
            //Si se introduce un número fuera del intervalo debe indicarlo mediante un error
            if (número < 1 || número > 100) {
                System.out.println("Error");
            }
        } while (número < 1 || número > 100); // sigo en el bucle si introduzco el número fuera del rango: si meto un número < 1 o > 100
        // cuando el número introducido es correcto, lo imprimo
        System.out.println(número);


//        Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango
//indicado. Al terminar debe imprimir por pantalla el número introducido.

    }
}
