package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
//        39. Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado.
//        Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).

        Scanner sc = new Scanner(System.in);
        // vamos introduciendo números por teclado hasta que pulsamos un 0
        // mejor do-while porque al menos un número tenemos que meter
        // esta variable es para guardar el número que cada vez introducimos por teclado
        int n;
        // para contar los números declaramos una variable contador, que empieza en 0
        int contador = 0;
        do {
            // leo el número
            n = sc.nextInt();
            contador++; // también valdría contador = contador + 1 o también contador + = 1
        } while (n != 0); // mientras el número introducido no sea 0, seguimos en el bucle
        // al finalizar, mostramos la "longitud de la secuencia", o sea, cuántos números hemos metido
        System.out.println((contador - 1)); // le restamos 1 para quitar el 0

    }
}
