package VariablesYOperadores;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicios09 {
    public static void main(String[] args) {
        /*
        9. Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
transcurrido entre dos momentos del mismo día. */

//        Para ello, el programa ha de pedir por teclado seis números enteros:
//        las horas, minutos y segundos para el momento inicial
        Scanner sc = new Scanner(System.in);
        System.out.println("MOMENTO INICIAL");
        System.out.println("===============");
        System.out.println("Introduce la hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos1 =sc.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos1 = sc.nextInt();

//        y lo mismo para el momento final.

//        De momento vamos a considerar que los números introducidos van a estar en el rango adecuado y que el momento inicial
//introducido es menor (o igual) que el momento final.


        // EL TRUCO: PASAR A SEGUNDOS EL MOMENTOINICIAL Y EL MOMENTO FINAL

        // HALLAR LA DIFERENCIA ENTRE AMBOS

        // DE ESA DIFERENCIA (QUE SERÁ EN SEGUNDOS) EXTRAER HORAS, MINUTOS Y SEGUNDOS


// Por ejemplo, si se introducen
//los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
//el momento final es 15:21:1.


// El programa debe mostrar por pantalla la diferencia en
//el formato: hh:mm:ss.
//



    }
}
