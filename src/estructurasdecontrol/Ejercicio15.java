package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
//        15. Tenemos un programa que pregunta a los estudiantes qué lenguaje de programación están estudiando.
//        Hay cuatro opciones, una de las cuales es correcta:
//        Java, Kotlin, Scala o Python
//        Tu tarea consiste en:
//        leer el número de respuesta de la entrada estándar y generar
//        el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
//        correcta es Java (obviamente).

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué lenguaje estás estudiando?\n1. Java\n2.Kotlin\n3. Scala\n4. Python");
        int opción = sc.nextInt();
        switch (opción) {
            case 1:
                System.out.println("¡Sí!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("¡No!");
                break;
            default:
                System.out.println("Ese número no es una opción correcta.");
        }
        System.out.println("Fin");

    }
}
