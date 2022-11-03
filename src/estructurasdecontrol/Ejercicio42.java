package estructurasdecontrol;

public class Ejercicio42 {
    public static void main(String[] args) {
        // 42. Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.

        int numero = 1; // empiezo en 1 porque no quiero que salga 0 como múltplo de 5
        int contadorDeMultiplosDe5 = 0;
        while (contadorDeMultiplosDe5 < 20) {
            if (numero % 5 == 0) {
                System.out.println(numero);
                contadorDeMultiplosDe5++; // cada vez que encontramos un múltiplo incrementamos el contador
            }
            numero++;
        }
    }
}
