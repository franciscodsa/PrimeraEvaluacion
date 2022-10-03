package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
//        13. Escribe un programa que, dado un importe en euros,
//        indique el número mínimo de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
//                Por ejemplo: 232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.
        Scanner sc = new Scanner(System.in);
        int euros = sc.nextInt();
        int billetes500 = euros / 500;
        int auxiliar = euros % 500; // en el resto queda lo demás: de 200, de 100....
        int billetes200 = auxiliar / 200;
        auxiliar = auxiliar % 200; // aquí en este resto está lo que queda: de 100, 50, de 20...
        int billetes100 = auxiliar / 100;
        auxiliar = auxiliar % 100;
        int billetes50 = auxiliar / 50;
        auxiliar = auxiliar % 50;
        int billetes20 = auxiliar / 20;
        auxiliar = auxiliar % 20;
        int billetes10 = auxiliar / 10;
        auxiliar = auxiliar % 10;
        int billetes5 = auxiliar / 5;
        auxiliar = auxiliar % 5;
        int monedas2 = auxiliar / 2;
        int monedas1 = auxiliar % 2;
        System.out.println(euros + " euros: " + billetes500 + " billetes de 500, " +
        + billetes200 + " billetes de 200, " + billetes100 + " billetes de 100, " +
                + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " +
                + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 y " + monedas1 + " monedas de 1 €");
    }
}
