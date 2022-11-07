package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
//        44. Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO
//        VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.

        Scanner sc = new Scanner(System.in);
        // necesitamos una variable para guardar el carácter que va entrando:
        char c = 0;

        do {
            System.out.print("Introduce un carácter: ");
            c = sc.nextLine().charAt(0); // ponemos nextLine() en vez de next() porque next() no "llega" al espacio
            // comprobamos si es vocal
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("VOCAL");
            } else if ( c == ' '){
                break; // si escribimos un espacio en blanco no queremos que imprima "NO VOCAL", sino que directamente salte fuera del if
            } else {
                System.out.println("NO VOCAL");
            }
        } while (c != ' '); // salimos cuando introducimos un espacio en blanco

    }
}
