import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String[] usernames = new String[3];
        usernames[0] = "Ricardo";
        usernames[1] = "Admin";
        usernames[2] = "Pepe";

        String[] passwords = new String[3];
        passwords[0] = "12345";
        passwords[1] = "654321";
        passwords[2] = "1234";*/
        String[] usernames = {"Ricardo","Admin","Pepe"};
        String[] passwords = {"12345","654321","1234"};


        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el username?");
        String u = sc.nextLine();

        System.out.println("ingrese contraseña");
        String p = sc.nextLine();

        boolean esAuntenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAuntenticado = usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p) ? true : esAuntenticado;


            //            if(usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(p)){
//                esAuntenticado = true;
//                break;
//            }

        }
//        if (esAuntenticado){
//            System.out.println("Bienvenido a tu pefil ".concat(u).concat("!"));
//        } else {
//            System.out.println("Username o contraseña incorrectos!");
//            System.out.println("Lo sentimos, requieres autenticación!");
//
//        }
        String mensaje = esAuntenticado ? "Bienvenido a tu pefil ".concat(u).concat("!"):
                "Username o contraseña incorrectos! \n Lo sentimos, requieres autenticación!";

        System.out.println("mensaje = " + mensaje);
    }
}
