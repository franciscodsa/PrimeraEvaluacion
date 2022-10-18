package estructurasdecontrol;

public class EjemplosFor {
    public static void main(String[] args) {
        // queremos imprimir todos los números del 0 al 10 (ambos inclusive)
        for(int i = 0; i <= 10; i++) {// desde que i es igual a 0 y mientras i sea <= 10, vamos incrementando la i de 1 en 1
            // dentro del bloque escribimos lo que se tiene que hacer en cada repetición
            //System.out.println(i);
        }

        // queremos imprimir de 1 a 10 ambos inclusive de 2 en 2
        for(int i = 1; i < 11; i += 2){ // i = i + 2;   i += 2
            //System.out.println(i);
        }

        // queremos imprimir de 10 a 1 decrementando de 1 en 1
        for (int i = 10; i > 0; i--) {
            //System.out.println(i);
        }
    }
}
