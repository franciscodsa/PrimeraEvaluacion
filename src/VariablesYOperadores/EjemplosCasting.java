package VariablesYOperadores;

public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100; // int ocupa 32 bits
        long numGrande = num; // puedo asignar un int a long sin más (casting implícito)

        // ¿y al revés?
        long numGrande2 = 101; // long ocupa 64 bits
        int entero = (int) numGrande2; // esto es un casting explícito

        // de int a short -> casting explícito
        short numeroCorto = (short) num; // no puedo hacerlo directamente porque int son 32 bits y no "caben" en 16 bits

        // de char a int
        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);

        // de float a double
        float decimal = 3.1416f;
        double decimalDoble = decimal;

        // de double a float
        double decimalDoble2 = 3000000000000.1234567;
        float decimalF = (float) decimalDoble2;

        // de double a int
        int entero32bits = (int) decimalDoble2;
        System.out.println(entero32bits); // resultado imprevisible

        // de double a short
        short entero16bits = (short) decimalDoble2;
        System.out.println(entero16bits);
    }
}
