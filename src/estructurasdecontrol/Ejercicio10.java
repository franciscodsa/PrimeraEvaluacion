package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
//        10. Escribe un programa que pida tres números y los muestre ordenados (de mayor a
//                menor);

        Scanner sc = new Scanner(System.in);
        System.out.print("n1:");
        int n1 = sc.nextInt();
        System.out.print("n2:");
        int n2 = sc.nextInt();
        System.out.print("n3:");
        int n3 = sc.nextInt();

        // los tenemos que mostrar ordenados de mayor a menor

        // buscamos todas las posibilidades de ordenar esos tres elementos

        if (n1 > n2 && n2 > n3) { // n1 n2 n3
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 > n3 && n3 > n2) { // n1 n3 n2
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n2 > n1 && n1 > n3) { // n2 n1 n3
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 > n3 && n3 > n1) { // n2 n3 n1
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n3 > n1 && n1 > n2) { // n3 n1 n2
            System.out.println(n3 + " " + n1 + " " + n2);
        } else { // como sólo me queda una posibilidad será n3 n2 n1
            System.out.println(n3 + " " + n2 + " " + n1);
        }
    }
}
