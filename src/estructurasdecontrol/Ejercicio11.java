package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
//        11. Escribir un programa que lea un año indicar si es bisiesto.
//        Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.
// 2004	2008	2012
//2052	2056	2060
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) { // es bisiesto si es divisible por 4 y no es divisible por 100 o bien si es divisible por 4 y por 400
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
        }
    }
}
