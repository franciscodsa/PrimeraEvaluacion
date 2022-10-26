package estructurasdecontrol;

public class EjemploWhileChar {
    public static void main(String[] args) {
        // while con variables de tipo char sirve para imprimir una parte de la tabla asii
        // por ejemplo: las letras mayúsculas
        char letra = 'A';
        while (letra <= 'Z') {
            System.out.print(letra);
            letra++;
        }
    }
}
