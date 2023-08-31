import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int mes = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero de mes entre 1 y 12: ");
        mes = sc.nextInt();
        String nombreMes = null;
        char num = 'f';
        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "No existe";
        }
        System.out.println("nombreMes = " + nombreMes);

        switch (num){
            case '0':
                System.out.println("El numero es cero");
                break;
            case '1':
                System.out.println("El numero es uno");
                break;
            case '2':
                System.out.println("El numero es dos");
                break;
            case '3':
                System.out.println("el numero es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println(num + " no se encuentra validado en ningun caso");
                break;
        }

        String nombre = "Juan";

        switch (nombre){
            case "admin":
                System.out.println("Hola Admin, bienvenido!");
                break;
            case "andres":
                System.out.println("Hola Andres!");
                break;
            case "pepe":
                System.out.println("Hola pepe!");
                break;
            default:
                System.out.println("usuario desconocido!");
        }

    }
}
