import java.util.Scanner;

public class TareaCalcularAreaDeCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el radio del circulo: ");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo es ("+Math.PI+" * ("+radio+ " exp(2)) ="+ area);
    }
}
