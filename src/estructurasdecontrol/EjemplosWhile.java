package estructurasdecontrol;

public class EjemplosWhile {
    public static void main(String[] args) {
        // vamos a hacer un bucle while que imprima los números del 0 al 4
/*        int i = 0;
        while (i < 5) { // mientras i < 5 sea true, entramos en el bucle
            //dentro del bucle imprimimos i
            System.out.println(i);
            // ES IMPORTANTE que dentro del while haya alguna cosa que haga que el bucle pare en algún momento
            // normalmente es una variable que va cambiando de valor
            // hasta que toma un valor que hace que la condición sea false
            i++;
        }
        System.out.println("Fuera del bucle");
        */

        // Convertir estos dos for en while
        /*for(int i = 1; i < 11; i += 2){ // i = i + 2;   i += 2
            System.out.println(i);
        }*/
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("=================");
        // queremos imprimir de 10 a 1 decrementando de 1 en 1
        //for (int i = 10; i > 0; i--) {
            //System.out.println(i);
        //}
        int j  = 10;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
    }
}
