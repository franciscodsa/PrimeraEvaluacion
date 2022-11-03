package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio36b_26 {
    public static void main(String[] args) {
//        26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
//        el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
//        tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
//        su sueldo base y comisiones.
//
//        b) Ejercicio 26: en vez de 3 ventas pedir por teclado el número de ventas realizadas y el
//        importe de cada venta.

        // Datos que necesitamos pedir:
        Scanner sc = new Scanner(System.in);
        System.out.print("Sueldo base: ");
        double sueldoBase = sc.nextDouble(); // 1100

        /*

        System.out.print("Importe venta 2: ");
        double venta2 = sc.nextDouble();  // 200
        System.out.print("Importe venta 3: ");
        double venta3 = sc.nextDouble(); // 175
*/
        // En vez de lo anterior, lo que tenemos que hacer es pedir el número de ventas
        System.out.print("Nümero de ventas realizadas: ");
        int ventas = sc.nextInt(); // por ejemplo 10 ventas

        // y luego, para cada una de las ventas
        double comisionTotal = 0; // es como la variable suma, vamos acumulando las comisiones de cada venta
        for (int i = 0; i < ventas; i++) {
            // 1. Pido el importe de esa venta
            System.out.print("Importe venta " + (i+1) + ": ");
            double ventai = sc.nextDouble(); // 150
            // 2. Ahora calculo la comisión que obtiene por cada venta:
            double comisioni = ventai * 10 / 100; // 15
            // 3. se la sumo a la comisión total que voy acumulando
            comisionTotal = comisionTotal + comisioni;
        }

        System.out.printf("Obtendrá por comisiones %.2f euros.", comisionTotal);

        // y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
        double sueldoTotal = sueldoBase + comisionTotal; // 1152,5
        System.out.println("En total recibirá " + sueldoTotal + " euros.");
    }
}
