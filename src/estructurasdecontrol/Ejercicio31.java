package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
//        31. Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
//        el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int número = sc.nextInt();

        int factorial = 1;
        for (int i = número; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println(número + "! = " + factorial);

    }
}
