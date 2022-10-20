package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
//        33. Escribe un programa que, dados dos números, uno real (base) y un entero positivo
//        (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
//        método Math.pow().
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exponente: ");
        int exponente = sc.nextInt();

        int producto = 1;
        for (int i = 0; i < exponente; i++) {
            producto = producto * base;
        }
        System.out.println(producto);

    }
}
