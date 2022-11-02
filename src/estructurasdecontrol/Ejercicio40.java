package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
//        40. Escribe un programa que pida números hasta que se introduzca un cero. Debe
//        imprimir la suma y la media de todos los números introducidos.

        Scanner sc = new Scanner(System.in);

        // do-while porque al menos pedimos el número una vez
        int n;
        // para ir acumulando la suma, declaramos una variable (double por la media)
        double suma = 0;
        // para hacer la media necesitamos un contador, que será el denominador de la media
        int contador = 0;
        do {
            System.out.print("Introduce número (0 para salir):");
            n = sc.nextInt();
            // cada vez que introducimos un número
            // a) lo sumamos
            suma += n; // valdría también suma = suma + n; si he introducido un 0 , da igual
            // b) incrementamos el contador si el número introducido no es 0
            if (n != 0) {
                contador++;
            }
        } while (n != 0);
        // cuando finaliza el bucle imprimimos la suma
        System.out.println("Suma = " + suma);
        // y calculamos la media
        double media = suma / contador;
        System.out.println("Media = " + media);

    }
}
