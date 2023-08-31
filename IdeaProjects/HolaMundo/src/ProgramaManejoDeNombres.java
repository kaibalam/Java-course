import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre primer familiar");
        String primerFamiliar = sc.nextLine();
        String pF = primerFamiliar.substring(1,2).toUpperCase();
        pF += ".".concat(primerFamiliar.substring(primerFamiliar.length()-2));

        System.out.println("Ingrese nombre segundo familiar");
        String segundoFamiliar = sc.nextLine();
        String sF = segundoFamiliar.substring(1,2).toUpperCase();
        sF += ".".concat(segundoFamiliar.substring(segundoFamiliar.length()-2));

        System.out.println("Ingrese nombre tercer familiar");
        String tercerFamiliar = sc.nextLine();
        String tF = tercerFamiliar.substring(1,2).toUpperCase();
        tF += ".".concat(tercerFamiliar.substring(tercerFamiliar.length()-2));

        String res = pF.concat("_").concat(sF).concat("_").concat(tF);
        System.out.println(res);

    }
}
