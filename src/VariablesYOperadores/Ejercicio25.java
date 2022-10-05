package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
//        25. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
//        desea saber cuanto deberá pagar finalmente por su compra.
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio total de la compra: ");
        double precioCompra = sc.nextDouble();

        // Calculamos el 15%
        double descuento = precioCompra * 15 / 100;

        // Descontamos esa cantidad
        double precioConDescuento = precioCompra - descuento;
        System.out.println("Debe abonar " + precioConDescuento + " €.");

    }
}
