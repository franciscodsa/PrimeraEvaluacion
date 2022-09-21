package ElementosBasicos;

public class LasVariables {
    public static void main(String[] args) {
        // Variables
        int a; // Declaro la variable a (a partir de ahora hay un trocito de memoria que se llama a)
        // Por favor, las variables se declaran en minúscula
        a = 5;// y a continuación guardo en ella el valor 5
        System.out.println("La variable a vale " + a);
        // su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + a);

        // Reglas para nombrar variables
//        No puede comenzar por ningún digito
        //int 5c = 4; --> no compila
//        Puede contener cualquier letra o digito
        int c58 = 2;
//        No puede contener ningún caracter especial (signos de puntuación, . . .)
//        a excepción de los caracteres _ y $
        int _variable = 3;
        int $otraVariable = 4;
//        No puede contener espacios
        //int otra variable; --> no compila

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("==================");
        System.out.println("Las variables se declaran poniendo 1ª el tipo de variable que es y 2ª el nombre que le damos a la variable");
        System.out.println("Variables para números enteros: byte, short, int, long");
        System.out.println("byte");
        byte variableBytePos = 127; // es el número más grande que puedo guardar en una variable de tipo byte
        byte variableByteNeg = -128; // es el número más pequeño que puedo guardar en una variable byte
        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        System.out.println("Números con decimales: float o double");
        double decimal = 3.14;
        double numero = 3;
        System.out.println(numero);
        float otroDecimal = 8.43f; // si declaras una variable de tipo float ponemos una f

        // Formas alternativas de declarar una variable (pag 11)
        String lenguaje = "java" ;
        String version = "8 o superior";
        // esto también se puede hacer así:
        String lenguaje1 = "java", version1 = "10 o superior";
        int num1 = 5, num2 = 10; // declaro dos variables de tipo int en la misma línea
        // también podría hacer
        int num3; // aquí declaro la variable sin asignar nada, coge el valor por defecto; en los números, 0
        num3= 6;
        num3 = num1; // aquí guarda en num3 el valor 5
        System.out.println(num3);

        // Inferencia de tipos
        var variable = "Hola";
        var otraVariable = 10;
        var var = "Toma";




    }
}
