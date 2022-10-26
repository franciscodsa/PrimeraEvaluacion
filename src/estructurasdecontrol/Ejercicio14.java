package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
//        14. El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
//        La forma de cobrar es la siguiente:
//        a. Si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
//        b. de 50 a 99 alumnos, el costo es de 70 euros,
//        c. de 30 a 49, de 95 euros,
//        d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//                Escribe un programa que, introduciendo el número de alumnos que van de viaje,
//        permita determinar el pago a la compañía de autobuses -> costeTotal
//        y lo que debe pagar cada alumno.

        // ENTRADA: introduciendo el número de alumnos que van de viaje,...
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();
        // necesito una variable para guardar cuánto va a pagar cada alumno
        double costeAlumno = 0;
        // también necesito una variable para guardar el coste total del autobús que alquilamos
        double costeTotal = 0;
        if (alumnos >= 100) {
            costeAlumno = 65;
            costeTotal = costeAlumno * alumnos;
        } else if (alumnos >= 50 && alumnos <= 99) {
            costeAlumno = 70;
            costeTotal = costeAlumno * alumnos;
        } else if (alumnos >= 30 && alumnos <= 49) {
            costeAlumno = 95;
            costeTotal = costeAlumno * alumnos;
        } else {
            // para el resto de casos, o sea, menos de 30 alumnos, se paga 4000 en total
            costeTotal = 4000;
            costeAlumno = costeTotal / alumnos;
        }

        System.out.printf("El coste total es: %.2f €", costeTotal);
        System.out.printf("\nCada alumno pagará: %.2f €", costeAlumno);



    }
}
