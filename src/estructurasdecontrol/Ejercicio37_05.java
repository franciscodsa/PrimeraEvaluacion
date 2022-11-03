package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio37_05 {
    public static void main(String[] args) {
//        Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor de ellos.

        // Vamos a usar dos variables auxiliares: max y min
        // En max vamos a ir guardando temporalmente el número mayor que tengamos
        // En min  ""   "" "" ""           ""         ""   ""   meno   ""   ""
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n1 = sc.nextInt();
        // al pedir el primer número ese es el mayor y el menor que tenemos de momento, así que lo asignamos a estas variables
        int max = n1;
        int min = n1;

        // creamos una variable para ir guardando los números que entran por teclado antes de comparar si son el max o el min
        int numero;
        for (int i = 0; i < 9; i++) {
            System.out.print("Número: ");
            numero = sc.nextInt();
            // vemos si ese número es mayor que el max que tengo hasta el momento
            if (numero > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
                max = numero;
            }
            if (numero < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
                min = numero;
            }
        }
        // cuando salgo del for ya tengo guardados el número máximo y mínimo
        System.out.println("El número mayor introducido es " + max);
        System.out.println("El número menor introducido es " + min);


    }
}
