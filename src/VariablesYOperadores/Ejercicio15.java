package VariablesYOperadores;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        15. Realiza un programa que calcule el área de una circunferencia de radio 5,2
centímetros.
         */

        // Fórmula: pi * radio al cuadrado

        // como me dice lo que mide el radio no tengo que pedirlo por teclado
        double radio = 5.2;
        double area = Math.PI * Math.pow(radio, 2); // el método Math.pow sirve para calcular una potencia y funciona así: Math.pow(base, exponente);
        // System.out.println(area); // con esto muestra todos los decimales
        System.out.printf("El resultado es %.2f", area);
    }
}
