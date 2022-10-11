package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        /*
        19. Realizar un programa que pida un número entero por teclado y visualice el dia de la
semana correspondiente.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número:");
        int numero = sc.nextInt();
        String dia = "";
        switch (numero) {
            case 1 -> dia = "Lunes";
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miércoles";
            case 4 -> dia = "Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sábado";
            case 7 -> dia = "Domingo";
        }
        System.out.println(dia);
    }
}
