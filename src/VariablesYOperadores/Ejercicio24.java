package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
//        24. Realiza un programa que pida el precio de venta de un producto,
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble(); // 100

//        la cantidad de productos comprados
        System.out.print("Cantidad de productos a comprar: ");
        int cantidad = sc.nextInt(); // 5

//        y el porcentaje de IVA aplicado.
        System.out.print("Porcentaje de IVA a aplicar: ");
        double porcentajeIVA = sc.nextDouble(); // 10

//        El programa mostrará el importe a abonar.
        // 1ª) Calcular el precio sin IVA
        double precioSinIVA = precio * cantidad;
        //System.out.println(precioSinIVA); // 500

        // 2ª Calcular el iva calculado
        double ivaCalculado = precioSinIVA * porcentajeIVA / 100; // 500 * 10 / 100 = 50
        //System.out.println(ivaCalculado);

        // 3ª Precio con iva
        double precioConIVA = precioSinIVA + ivaCalculado; // 500 + 50
        System.out.println("Debe abonar " + precioConIVA + "€.");
    }
}
