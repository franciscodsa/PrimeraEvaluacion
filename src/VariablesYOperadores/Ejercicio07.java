package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.
         */

        // que reciba una cantidad de minutos
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();

        // calculamos cuántas horas y minutos corresponden a los minutos introducidos
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        // y muestre por pantalla a cuantas horas y minutos corresponde
        System.out.println(minutos + " minutos equivalen a " + horas + " hora/s y " + minutosRestantes + " minutos.");

    }
}
