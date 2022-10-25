package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio13otraForma {
    public static void main(String[] args) {
//        13. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
//        Cuando se realiza la venta del producto, ésta es de un solo tipo (A o B) y tamaño (1 o 2).
//
//        PEDIR DATOS
        Scanner sc = new Scanner(System.in);
//        Al comenzar el programa pide
//        el precio inicial (POR KILO EN EUROS),
        System.out.print("Precio inicial (€/kg): ");
        double precioInicial = sc.nextDouble();
//        tipo,
        System.out.print("Tipo (A o B): ");
        char tipo = sc.next().charAt(0);
//        tamaño de la uva y
        System.out.print("Tamaño (1 ó 2): ");
        int tamaño = sc.nextInt();
//        kilos que se van a vender en un embarque.
        System.out.print("Kilos a vender: ");
        int kilos = sc.nextInt();
//
//
//
//        Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
//        a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
//        b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

    // La idea es que el precio (por kilo) va a ser distinto según sea el tipo y el tamaño
        double precio = 0; // creo esta variable para guardar el precio según el caso
        if (tipo == 'A') {
            if (tamaño == 1) {
                precio = precioInicial + 0.2;
            } else { // por abreviar, suponemos que si no es tamaño 1 va a ser tamaño 2
                precio = precioInicial + 0.3;
            }
        } else { // por abreviar, suponemos que si nos es tipo A va a ser tipo B
            if (tamaño == 1) {
                precio = precioInicial - 0.3;
            } else { // por abreviar, suponemos que si no es tamaño 1 va a ser tamaño 2
                precio = precioInicial - 0.5;
            }
        }

//        Escribe un programa para determinar el precio al que se tendrán que vender las uvas
//        para los datos introducidos --> EL PRECIO TOTAL TENIENDO EN CUENTA LO ANTERIOR
        double precioTotal = precio * kilos;
        System.out.println("A pagar: " + precioTotal + " €.");


    }
}
