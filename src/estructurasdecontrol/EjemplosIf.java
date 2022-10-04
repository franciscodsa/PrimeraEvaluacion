package estructurasdecontrol;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();

        // si la edad es mayor que 100 es una persona con mucha experiencia
        // si no, pues nada, no decimos nada
        if (edad > 100) {
            System.out.println("Eres una persona con mucha experiencia.");
        }
        */

        // El resultado de la condición es boolean; podemos simplificar, a veces, así
       /* boolean semáforoAbierto = false;


        if (semáforoAbierto) { // es lo mismo que semáforoAbierto == true
            System.out.println("Adelante, puedes pasar.");
        } else {
            System.out.println("Detente, pecador.");
        }
    */
        // Vamos a ver si un número es par o impar
       /*
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
*/
        int presupuesto = sc.nextInt();
        if (presupuesto < 100) {
            System.out.println("Esto no es para mí.");
        } else if (presupuesto >= 100 && presupuesto < 200) {
            System.out.println("Me compraré el paquete básico.");
        } else if (presupuesto >= 200 && presupuesto < 300) {
            System.out.println("Me compraré el paquete estándar.");
        } else {
            System.out.println("Me compro lo que quiera.");
        }
    }
}
