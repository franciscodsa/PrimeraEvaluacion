package estructurasdecontrol;

import java.util.Locale;
import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una acción (1-4)");
        int accion = sc.nextInt();
        sc.nextLine(); // para que no se salte el siguiente sc.nextLine();
        /*
        if (accion == 1) {
            System.out.println("Comenzando partida.");
        } else if (accion == 2) {
            System.out.println("Cargando partida guardada");
        } else if (accion == 3) {
            System.out.println("Mostrar ayuda");
        } else if (accion == 4) {
            System.out.println("Salir");
        } else {
            System.out.println("Acción incorrecta");
        }*/

        // Esto se puede poner de otra forma
        // Cuando en el if tienes == o equals -> evalúas el valor de una variable y según sea haces una acción u otra
        /*
        switch (accion) { // en ese () sólo puede ir el nombre de la variable
            case 1:
                System.out.println("Comenzando partida");
                break;
            case 2:
                System.out.println("Cargando partida guardada");
                break;
            case 3:
                System.out.println("Mostrar ayuda");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default: // aquí entra si no se cumple ninguno de los casos anteriores
                System.out.println("Acción incorrecta");
                break;
        }
        System.out.println("Fin");*/

        // Otro ejemplo
        System.out.println("Día de la semana: ");
        String dia = sc.nextLine();
        // según el día que sea quiero que me ponga un número
        int numero = 0;
        switch (dia) {
            case "Lunes" -> numero = 1;
            case "Martes" -> numero = 2;
            case "Miércoles" -> numero = 3;
            case "Jueves" -> numero = 4;
            case "Viernes" -> numero = 5;
            default -> System.out.println("Lo que has introducido no es un día de la semana.");
        }
        System.out.println(numero);

    }
}
