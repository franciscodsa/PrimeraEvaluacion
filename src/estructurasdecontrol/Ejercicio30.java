package estructurasdecontrol;

public class Ejercicio30 {
    public static void main(String[] args) {
        // 30. Hacer un programa que calcule la suma y el producto de los 30 primeros números
        //naturales.

        // quiero hacer: 0 + 1 + 2 + 3 + .... + 29
        int suma = 0;
        for (int i = 0; i < 30; i++) { // va a ir de 0 a 29, o sea, 30 repeticiones
            suma += i; // es lo mismo que suma = suma + i
        }
        System.out.println("Suma: " + suma);

        // y también quiero hacer: 1 * 2 * 3 * 4 * .... * 30 (no podemos meter el 0 en el producto porque se nos anula to-do siempre)
        double producto = 1;
        for (int i = 1; i < 31; i++) { // también podría haber puesto i <= 30
            producto *= i; // es lo mismo que producto = producto * i;
        }
        System.out.println("Producto: " + producto);

    }


}
