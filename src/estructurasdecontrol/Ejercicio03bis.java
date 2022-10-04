package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03bis {
    public static void main(String[] args) {
        // este es inventado para ver la diferencia entre que me pregunten una cosa u otra habiendo if de por medio

        //       Escribe un programa que pida dos números
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();

        //        e indique si el primero es mayor, es igual o es menor que el segundo.
        if (n1 > n2) {
            System.out.println("El primero es mayor que el segundo.");
        } else if (n1 == n2) {
            System.out.println("Los dos números son iguales");
        } else { // aquí sólo me queda una posibilidad, que el primero sea menor, por eso pongo sólo else
            System.out.println("El primero es menor que el segundo");
        }
    }
}
