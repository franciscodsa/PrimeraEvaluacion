package estructurasdecontrol;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

//        16. Harry Potter necesita ayuda para identificar lo que significa cada casa.
//        Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil
//                la entrada por teclado) y que obtenga lo siguiente:
//• si es "gryffindor" , salida "valentía" ;
//• si es "hufflepuff" , salida "lealtad" ;
//
//        4
//• si es "slytherin" , salida "astucia" ;
//• si es "ravenclaw" , salida "intelecto" ;
//• de lo contrario, la salida "no es una casa válida" .
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige casa:\n1. Gryffindor\n2. Hufflepuff\n3. Slytherin\n4. Ravenclaw");
        //int casa = sc.nextInt();

        //for (int i = 0; i < 100; i++) {
            int casa = (int) (Math.random() * 4 + 1);
          //  System.out.println(casa + " ");
        //}
        switch (casa) {
            case 1:
                System.out.println("Valentía");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
            default:
                System.out.println("No es un número válido");
        }
    }

}
