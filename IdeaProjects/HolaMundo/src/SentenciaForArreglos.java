import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {
        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].toLowerCase().contains("andres".toLowerCase()) ||
            nombres[i].toLowerCase().contains("pepa".toLowerCase())){
                continue;
            }
            System.out.println(i +" - nombres = " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("ingrese un nombre, ejemplo \"Pepe\" o \"Maria\"");

        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i = 0; i< count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar +" fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null,buscar +" no existe en el sistema");
        }
    }
}
