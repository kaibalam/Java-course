import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String familyNames = JOptionPane.showInputDialog(null,"Ingresa tres nombres completos (nombre y apellido) de familiares separados por un espacio \" \" y por coma al final \",\" : ");
        String[] fName = familyNames.split(",");
        String n1 = fName[0];
        String n2 = fName[1];
        String n3 = fName[2];

        String[] name1 = n1.split(" ");
        String[] name2 = n2.split(" ");
        String[] name3 = n3.split(" ");


        String longer = "";
        if(name1[0].length() > name2[0].length()){
            longer = fName[0];
        } else {
            longer = fName[1];
        }

        if(longer.length() > name3[0].length()){
            longer = longer;
        } else {
            longer = fName[2];
        }

        System.out.println("familyNames = " + familyNames);
        System.out.println("longer = " + longer);
        JOptionPane.showMessageDialog(null,longer.concat(" tiene el nombre mas largo"));
        
        String line = "832938472348347|50253291129|832938472348347|Motivo|Observacion|1921|0|MU2323";
        String[] lineObj = line.split("\\|");
        String imei = lineObj[0];
        String msisdn = lineObj[1];
        String imsi = lineObj[2];
        String excepCause = lineObj[3];
        String obsrns = lineObj[4];
        String operator = lineObj[5];
        String status = lineObj[6];
        String userId = lineObj[7];

        System.out.println("lineObj = " + lineObj);
        System.out.println("n1 + n2 + n3 = " + n1 + n2 + n3);
        for (String s: lineObj
             ) {
            System.out.println(s);

        }

    }
}
