import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("nuemeroBinario de : " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de  : " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de  : " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = "nuemeroBinario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";
        mensaje += "numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";
        mensaje += "numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";

        JOptionPane.showMessageDialog(null,mensaje);

    }
}
