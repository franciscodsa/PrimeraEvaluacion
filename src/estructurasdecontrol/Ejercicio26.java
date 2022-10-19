package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // 26. Hacer un programa que pida diez números por teclado y calcule su media.
        Scanner sc = new Scanner(System.in);

        // tenemos que pedir un numero 10 veces -> un for que da 10 vueltas
        double suma = 0; // la declaro como double porque voy a hacer una media
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            double número = sc.nextInt();
            // este número que pido cada vez lo tengo que ir acumulando
            suma = suma + número;
            //System.out.println(suma);
        }
        // cuando termina el bucle, ya tengo el numerador de la media
        double media = suma / 10;
        System.out.println(media);
    }
}
