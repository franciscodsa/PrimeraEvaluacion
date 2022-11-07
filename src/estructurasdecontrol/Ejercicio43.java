package estructurasdecontrol;

public class Ejercicio43 {
    public static void main(String[] args) {
//        43. Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5,
//        añadiendo un salto de línea cada 10 números.

        // se trata de empezar en 1 e ir incrementando viendo si el número es múltiplo de 5
        int numero = 1; // empezamos en 1, para que no cuente el 0 como múltiplo
        // necesitamos ir contando los múltiplos de 5 que van saliendo
        int contadorDeMultiplosDe5 = 0;
        while (contadorDeMultiplosDe5 < 50) { // hasta que no tengamos 50 múltiplos no salimos del bucle
            // probamos si el número es múltiplo de 5
            if (numero % 5 == 0) {
                // si el número es un múltiplo, lo imprimimos --> en la misma línea
                System.out.print(numero + " ");
                // cada vez que encuentro un múltiplo, incremento el contador
                contadorDeMultiplosDe5++;
                // además, si el contador es múltiplo de 10, meto un salto de línea
                if (contadorDeMultiplosDe5 % 10 == 0) {
                    System.out.println();
                }
            }
            // justo antes de terminar la iteración, incremento el número
            numero++;
        }
    }
}
