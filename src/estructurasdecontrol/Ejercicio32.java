package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
//        32. Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n,
//        siendo n un número introducido por el usuario.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // ejemplo: 100
        // tenemos que ir mirando todos los números entre 1 y n, y entonces:
        // a) si es múltiplo de 5: al dividirlo por 5 el resto da 0 -> lo muestro por pantalla
        // b) si no es múltiplo de 5, no hago nada
        for (int i = 1; i <= n ; i++) {
            // miramos si es múliplo de 5
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
