package VariablesYOperadores;

public class EjemplosBoolean {
    public static void main(String[] args) {
        boolean apto = false;
        System.out.println("¿Es apto? " + apto);

        // Operadores lógicos
        // Unario: ! NOT

        System.out.println(!apto);

        // Operadores binaros: se utilizan con 2 variables
        // AND y
        System.out.println("AND");
        System.out.println("===");
        boolean v1 = true;
        boolean v2 = true;
        boolean and = v1 && v2;
        System.out.println(and);

        // OR o ||
        System.out.println("OR");
        boolean or = v1 || v2;
        System.out.println(or);

        // XOR ^
        System.out.println("XOR");
        boolean xor = v1 ^ v2;
        System.out.println(xor);

        boolean frío = false; // no hace frío
        boolean seco = true; // hace tiempo seco
        boolean verano = false; // no estamos en verano
        boolean trekking = seco && (!frío || verano); // ¡true, nos vamos de trekking!

    }
}
