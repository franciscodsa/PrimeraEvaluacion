package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
//        46. Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste adivine un número que el programa ha elegido al azar.
//        El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el
//        introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si
//        se introduce un número fuera del intervalo debe dar un mensaje de error.
//                Para que el programa elija un número al azar utilizamos el método random de la
//        clase Math:

        int numAleatorio = (int) (Math.random() * 100 + 1); // el número que genera esta fórmula está entre 1 y 100
        //System.out.println(numAleatorio);
        Scanner sc = new Scanner(System.in);
        int prueba = 0;
        do {
            prueba = sc.nextInt();
            if (prueba < 0 || prueba > 100) {
                System.out.println("Fuera de rango");
            } else if (prueba == numAleatorio) {
                System.out.println("¡Bingo!");
            } else if ( prueba == 0) {
                System.out.println("¡Cobarde!");
            } else if ( prueba < numAleatorio) {
                System.out.println("El número es mayor que " + prueba );
            }  else if ( prueba > numAleatorio) {
                System.out.println("El número es menor que " + prueba );
            }
        } while (prueba != numAleatorio && prueba != 0);

    }
}
