import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
        if (esNulo){
            curso = "Programación Java";
        }
        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // esto es a partir de la versión 11 del JDK
        System.out.println("esBlanco = " + esBlanco);
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al ".concat(curso));
        }


    }
}
