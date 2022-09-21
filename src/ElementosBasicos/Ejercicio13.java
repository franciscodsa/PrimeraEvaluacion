package ElementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        13. Imagina que eres un gerente de recursos humanos en un restaurante y necesitas
contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares
sobre los candidatos,
concretamente 5 campos:
nombre, edad, años de experiencia, preferencia de cocina.

Escribe un programa que lea todas las palabras (o números)
una a una*/
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        int experiencia = sc.nextInt();
        // para que no "salte", añadimos la siguiente línea
        sc.nextLine();
        // y ya ponemos el nextLine() que tocaba poner
        String preferenciaCocina = sc.nextLine();

/*e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años
y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos
con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE
COCINA>".
         */
        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " +
                        experiencia + " de experiencia, está completo. Nos comunicaremos con usted" +
                " si necesitamos a alguien que cocine comida " + preferenciaCocina + ".");


    }

}
