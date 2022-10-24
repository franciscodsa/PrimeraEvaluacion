package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
//        Escribe un programa que, dado un número n introducido por teclado, dibuje un
//        cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
    // Tenemos que pedir un número por teclado; vamos a controlar que no nos cuelen un número negativo ni 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No me vale para hacer un cuadrado.");
        } else { // si entra por aquí es que n es > 0 y entonces puedo hacer el cuadrado
            // Ahora pedimos un carácter para dibujar el cuadrado
            System.out.println("Carácter: ");
            char c = sc.next().charAt(0); // Recuerda: así se recoge una variable tipo char por teclado
            // Ahora dibujamos el cuadrado
            // Vamos a utilizar el for externo para las filas
            for (int i = 0; i < n; i++) { // por ejemplo, si n = 4, dibujará la fila 0, 1 2 y 3
                // Y vamos a utilizar el for interno para las columnas (pero da igual en este ejercicio que veas las filas como i y las columnas como j)
                for (int j = 0; j < n; j++) {
                    System.out.print(c + " ");
                }
                System.out.println(); // este salto de línea lo queremos para cuando termine de imprimir una fila (o sea, un for interno completo)
            }
        }
    }
}
