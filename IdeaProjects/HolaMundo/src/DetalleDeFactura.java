import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreFactura = "";
        Double primerProducto = 0.00;
        Double segundoProducto = 0.00;
        try{
            System.out.println("Ingrese nombre de la factura: ");
            nombreFactura = scanner.nextLine();
            System.out.println("Ingrese productos: ");
            primerProducto = scanner.nextDouble();
            System.out.println("Ingrese productos: ");
            segundoProducto = scanner.nextDouble();
        } catch (Exception err){
            System.out.println("debe de ingresar el dato correcto = " + err);
            main(args);
            System.exit(0);
        }

        Double precioTotalBruto = primerProducto + segundoProducto;
        Double impuesto = (primerProducto + segundoProducto) * 0.19;
        Double totalConImpuesto = precioTotalBruto + impuesto;

        System.out.println("La factura de " + " tiene un total bruto de: " +  Math.round(precioTotalBruto * 100.0)/100.0+ ", con un impuesto de: " + Math.round(impuesto*100.0)/100.0+ " y el monto después del impuesto es de "+ Math.round(totalConImpuesto*100.0)/100.0);

    }
}
