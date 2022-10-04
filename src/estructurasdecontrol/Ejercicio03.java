package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
//        3. Escribe un programa que pida dos números
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();

//        e indique si el primero es mayor que el segundo o no.
        if (n1 > n2) {
            System.out.println("El primero es mayor (" + n1 + " > " + n2 + ")");
        } else { // si no es mayor, es que es menor o igual
            System.out.println("El primero no es mayor (" + n1 + " <= " + n2 + ")");
        }
    }
}
