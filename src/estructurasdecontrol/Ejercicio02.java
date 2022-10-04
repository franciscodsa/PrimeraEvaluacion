package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
//        2. Realiza un programa que pida por teclado el sueldo anual de una persona,
        Scanner sc = new Scanner(System.in);
        System.out.print("Sueldo anual: ");
        int sueldo = sc.nextInt();

//        si supera los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar impuestos.
    if (sueldo > 9000) {
        System.out.println("Pagas impuestos.");
    } else {
        //        Si no lo supera, que indique que no debe abonarlos.
        System.out.println("No pagas impuestos.");
    }

    }
}
