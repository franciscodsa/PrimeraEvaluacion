package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Realiza un programa que pida una fecha (día, mes y año) y compruebe si componen
        //una fecha correcta.
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int año = sc.nextInt();

        // empezamos comprobando lo más fácil, que es el año
        if (año != 0) {
            // el año es correcto; ahora hay que comprobar mes
            if (mes >= 1 && mes <= 12) {
                // si entra aquí, es que el mes también es correcto
                // ahora hay que comprobar el día
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { // comprobamos que el día está entre 1 y 31 para los meses de 31 días
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // meses de 30 días
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                } else if (mes == 2) { // comprobamos febrero
                    if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) { // si el año es bisiesto los días pueden estar entre 1 y 29
                        if (dia >= 1 && dia <= 29) {
                            System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                    } else { // si el año no es bisiesto los días pueden estar entre 1 y 28
                        if (dia >= 1 && dia <= 28) {
                            System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                    }
                }
            } else { // mes incorrecto
                System.out.println("Fecha incorrecta.");
            }
        } else { // si entra aquí es que el año == 0
            System.out.println("Fecha incorrecta."); // el año es incorrecto
        }
    }
}
