package ElementosBasicos;

import java.util.Scanner;

public class EjemplosLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ahora ya podemos meter datos por teclado
        // Pero para poder utilizarlos después en el programa
        // tenemos que guardarlos en una variable
        // las variables que guardan palabras o cadenas de texto se llaman String
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine(); // escribo el nombre en el teclado y lo guardo en la variable nombre
        System.out.println("Hola, " + nombre);
    }
}
