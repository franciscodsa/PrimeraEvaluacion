package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio36_20 {
    public static void main(String[] args) {
        //20. Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
        //media. Ten en cuenta que la media puede contener decimales.
        Scanner sc = new Scanner(System.in);
        // como sabemos que vamos a meter 4 valores -> for
        // necesitamos
        int n; // para guardar el número que vamos introduciendo
        double suma = 0; // para la suma y el numerador de la media
        // no me hace falta contador, en este caso ya se que el denominador de la media es 4
        for (int i = 0; i < 4; i++) {
            n = sc.nextInt();
            // lo sumamos
            suma = suma + n;
        }
        // al terminar de meter y sumar los 4 números, calculamos la media
        double media = suma / 4;

        System.out.println("Suma = " + suma);
        System.out.println("Media = " + media);
    }
}
