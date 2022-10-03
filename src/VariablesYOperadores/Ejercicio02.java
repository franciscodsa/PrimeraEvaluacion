package VariablesYOperadores;

public class Ejercicio02 {
    public static void main(String[] args) {
        char número = 2; // está cogiendo el valor de la tabla ascii
        int cuad = número * número; // habíá que poner el tipo de variable en la declaración y ; al final
        System.out.println("El cuadrado de " + número + " es: " +
                        cuad); // faltaba el +
    }
}
