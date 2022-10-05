package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
//        26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
//        vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
//        tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
//        su sueldo base y comisiones.


        // variables: sueldoBase, comisión (el 10% sobre la venta), venta (hace 3 ventas)


        // Datos que necesitamos pedir:
        Scanner sc = new Scanner(System.in);
        System.out.print("Sueldo base: ");
        double sueldoBase = sc.nextDouble(); // 1100
        System.out.print("Importe venta 1: ");
        double venta1 = sc.nextDouble(); // 150
        System.out.print("Importe venta 2: ");
        double venta2 = sc.nextDouble();  // 200
        System.out.print("Importe venta 3: ");
        double venta3 = sc.nextDouble(); // 175

//        desea saber cuanto dinero obtendrá por concepto de comisiones
        // Ahora calculo la comisión que obtiene por cada venta:
        double comision1 = venta1 * 10 / 100; // 15
        double comision2 = venta2 * 10 / 100; // 20
        double comision3 = venta3 * 10 / 100; // 17,5
        double comision = comision1 + comision2 + comision3; // 52,5
        System.out.printf("Obtendrá por comisiones %.2f euros.", comision);

        // y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
        double sueldoTotal = sueldoBase + comision; // 1152,5
        System.out.println("En total recibirá " + sueldoTotal + " euros.");
    }
}
