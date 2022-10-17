package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
//        21. Escribe un programa que responda a un usuario que quiere comprar un helado en una conocida marca de comida rápida cuanto le costará en función del topping que
//        elija.
//• El helado sin topping cuesta 1.90€.
//• El topping de oreo cuesta 1€.
//• El topping de KitKat cuesta 1.50€.
//• El topping de brownie cuesta 0.75€.
//• El topping de lacasitos cuesta 0.95€.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe topping: sin topping, oreo, kitkat, brownie, lacasitos.");
        String topping = sc.nextLine();
        double precio = 1.90; // el precio del helado

        switch (topping) {
            case "sin topping":
                // no hacemos nada porque es el precio por defecto
                break;
            case "oreo":
                precio = precio + 1;
                break;
            case "kitkat":
                precio = precio + 1.50;
                break;
            case "brownie":
                precio = precio + 0.75;
                break;
            case "lacasitos":
                precio = precio + 0.95;
                break;
            default:
                System.out.println("no tenemos este topping, lo sentimos");
                System.out.println("El precio del helado sin topping es " + precio);
        }
        System.out.printf("Total: %.2f €", precio);


//• En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos.» y a continuación informará
//        del precio del helado sin ningún topping.
//                Finalmente, el programa escribe por pantalla el precio del helado con el topping
//        seleccionado (o ninguno).
    }
}
