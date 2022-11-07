package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
//        45. Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta
//        que seleccionamos la opción de “Salir”.

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            // mostramos el menú
            System.out.println("Menú:\n1. Derecha\n2. Izquierda\n3. Arriba\n4. Abajo\n5. Salir");
            opcion = sc.nextInt();

            // según lo elegido, hacemos una cosa u otra
            switch (opcion) {
                case 1:
                    System.out.println("->");
                    break;
                case 2:
                    System.out.println("<-");
                    break;
                case 3:
                    System.out.println("^");
                    break;
                case 4:
                    System.out.println("v");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 5); // la opción para salir es pulsar 5

        System.out.println("Partida terminada");



    }
}
