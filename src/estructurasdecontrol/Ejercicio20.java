package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*
        20. Escribe un programa que lea dos números enteros positivos, y pida la operación que
quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y
visualizar el resultado. En caso de que el símbolo introducido no sea correcto,
visualizar: operación incorrecta.
         */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Operación a realizar: ");
        char operacion = sc.next().charAt(0); // para guardar una variable por teclado de tipo char
        // Creamos una variable para guardar el resultado de la operación que hagamos en los casos
        int resultado = 0;
        // Miro el valor de la variable operación y en función de eso hago una operación u otra
        switch (operacion) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operación incorrecta.");
        }
        System.out.println("Resultado: " + resultado);
    }
}
