package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
//        34. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
//        números a introducir). El programa debe informar de cuantos números introducidos
//        son mayores que 0, menores que 0 e iguales a 0.

        Scanner sc = new Scanner(System.in);
        // primero pido cuántos números se van a introducir
        System.out.print("Números a introducir: ");
        int númerosAIntroducir = sc.nextInt();
        int contadorDePositivos = 0; // la variable contador sirve para contar los números positivos que voy metiendo
        int contadorDeNegativos = 0; // la variable contador sirve para contar los números positivos que voy metiendo
        int contadorDeCeros = 0; // la variable contador sirve para contar los números positivos que voy metiendo
        // ahora los vamos pidiendo
        for (int i = 0; i < númerosAIntroducir; i++) {
            System.out.print("Introduce número: ");
            int n = sc.nextInt();
            // cada vez que meto un número, compruebo si el número n es positivo, negativo o 0
            if (n > 0) {
                // si el número introducido es positivo, incremento el contador de positivos
                contadorDePositivos++; // contadorDePositivos = contadorDePositivos + 1;
                System.out.println("Contador de positivos: " + contadorDePositivos);
            } else if (n < 0) {
                // si no es positivo, puede ser negativo o 0
                // si es negativo entra por aquí e incremento el contador de negativos
                contadorDeNegativos++;
                System.out.println("Contador de negativos: " + contadorDeNegativos);
            } else {
                // la única posibilidad que queda si no ha entrado en ninguno de los dos casos anteriores que sea 0
                contadorDeCeros++;
                System.out.println("Contador de ceros: " + contadorDeCeros);
            }
        }
        // Cuando ya he introducido todos los números que había dicho, escribo el resultado de los contadores
        System.out.println("Total de positivos: " + contadorDePositivos);
        System.out.println("Total de negativos: " + contadorDeNegativos);
        System.out.println("Total de ceros: " + contadorDeCeros);
    }
}
