package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
//        4. Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e ingresos.
        // Pedimos los datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Nivel de estudios:\n0 - Sin estudios\n1 - Educación primaria\n2 - ESO\n3 - Grado medio\n4 - Estudios superiores");
        int estudios = sc.nextInt();
        System.out.print("Ingresos: ");
        int ingresos = sc.nextInt();

//        Necesitamos almacenar en la variable boolean jasp el valor:
        boolean jasp;

//        a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
        if (edad <= 28 && estudios > 3 || edad < 30 && ingresos > 28000) {
          jasp = true;
        } else { //       b. false, en caso contrario.
          jasp = false;
        }

        if (jasp) { // es lo mismo que jasp == true
            System.out.println("Eres un Joven Aunque Sobradamente Preparado");
        }

//        Escribe el código necesario.
    }
}
