package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio05 {
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
        System.out.print("Número: ");
        int n2 = sc.nextInt();
        if (n2 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n2;
        }
        if (n2 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n2;
        }

        System.out.print("Número: ");
        int n3 = sc.nextInt();
        if (n3 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n3;
        }
        if (n3 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n3;
        }

        System.out.print("Número: ");
        int n4 = sc.nextInt();
        if (n4 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n4;
        }
        if (n4 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n4;
        }

        System.out.print("Número: ");
        int n5 = sc.nextInt();
        if (n5 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n5;
        }
        if (n5 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n5;
        }

        System.out.print("Número: ");
        int n6 = sc.nextInt();
        if (n6 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n6;
        }
        if (n6 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n6;
        }

        System.out.print("Número: ");
        int n7 = sc.nextInt();
        if (n7 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n7;
        }
        if (n7 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n7;
        }

        System.out.print("Número: ");
        int n8 = sc.nextInt();
        if (n8 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n8;
        }
        if (n8 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n8;
        }

        System.out.print("Número: ");
        int n9 = sc.nextInt();
        if (n9 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n9;
        }
        if (n9 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n9;
        }

        System.out.print("Número: ");
        int n10 = sc.nextInt();
        if (n10 > max ) { // si n2 es mayor que el que teníamos,lo guardamos en max
            max = n10;
        }
        if (n10 < min) {  // si n2 es menor que el que teníamos, lo guardamos en min
            min = n10;
        }

        System.out.println("El número mayor introducido es " + max);
        System.out.println("El número menor introducido es " + min);


    }
}
