package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
//        24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
//                menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
//        ambos inclusive.
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        // tenemos que hacer una suma desde a hasta b
        // declaramos una variable suma inicializada a 0
        int suma = 0;
        for (int i = a; i <= b; i++) {
            // vamos sumando a suma todos los números desde a hasta b
            suma = suma + i; // sumo lo que tengo acumulado en suma hasta ese momento más la i que toque en cada iteración y lo guardo en suma
        }
        System.out.println("Resultado: " + suma);

    }
}
