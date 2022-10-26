package estructurasdecontrol;

import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {
        // La ventaja que tiene do-while es que SIEMPRE SIEMPRE SIEMPRE se va a ejecutar lo de dentro del bloque AL MENOS una vez (y, si se cumple la condición, se repetirá)
        // por ejemplo, pedimos números y 0 para salir
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números (0 para salir):");
        int número = 0;
        do {
            número = sc.nextInt();
        } while (número != 0); // mientras eso no sea false, va a seguir pidiendo números
    }
}
