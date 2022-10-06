package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
//        9. Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
//        comparan con dos valores guardados previamente. Si coinciden, se indica “Has
//        entrado al sistema”, en caso contrario se da un error.

        // se supone que en algún sitio tengo guardado esto
        String user = "Pablito";
        String passwd = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        if (usuario.equals(user) && password.equals(passwd)) {
            System.out.println("Has entrado al sistema.");
        } else {
            System.out.println("Error. Usuario o contraseña incorrectos.");
        }


    }
}
