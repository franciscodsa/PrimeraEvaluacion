package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*
        Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
rectángulo en que la base sea el número mayor y la altura el número menor, con un
carácter también introducido por teclado.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        // tengo que comprobar que ninguno sea 0 o negativo
        if (a <= 0 || b <= 0) {
            System.out.println("No me valen.");
        } else { // si entra por aquí es que a y b son valores válidos; ya el resto del ejercicio lo hacemos dentro de este bloque
            // Ahora tengo que ver cuál va a ser la base (el mayor) y cuál va a ser la altura (el otro, es decir, el que sea menor o igual)
            // igual que en el ejercicio 25, creamos dos variables para guardar base y altura

            int base, altura;

            if (a > b) {
                base = a;
                altura = b;
            } else {
                base = b;
                altura = a;
            }

            // me falta pedir el carácter
            System.out.print("Carácter: ");
            char c = sc.next().charAt(0);

            // Ahora que ya sé cuál es la base y cuál la altura, pinto el rectángulo
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }
}
