public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u00b6'; //forma unicode
        char decimal = 64; //forma decimal
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = simbolo " + (decimal == simbolo));
        var caracterVar = '@';
        System.out.println("caracterVar = " + caracterVar);

        char espacio = ' ';
        char retroceso = '\b';
        char tabulado = '\t';
        char nuevalinea = '\n';
        System.out.println("Character.BYTES = "+ tabulado+ retroceso + retroceso + nuevalinea + Character.BYTES);
        System.out.println("Character.SIZE = " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);

        String imei = calcImei("86394505983394");
        System.out.println("imei = " + imei);


    }

    //CALCULAR ULTIMO DIGITO DE IMEI
    public static String calcImei(String imei){
        String im = "0";
        Integer sum = 0;
        Integer total = 0;
        for (int i = 0; i < imei.length(); i++){
            char test = imei.charAt(i);
            if(i%2!=0){
                sum = Integer.parseInt(String.valueOf(test)) * 2;
                String convertSum = String.valueOf(sum);
                if (convertSum.length() > 1){
                    for(int j = 0; j<convertSum.length(); j++){
                        char itm = convertSum.charAt(j);
                        total += Integer.parseInt(String.valueOf(itm));
                        System.out.println("total = " + total);
                    }
                } else {
                    total += Integer.parseInt(convertSum);
                    System.out.println("total = " +total);
                }
            } else {
                total += Integer.parseInt(String.valueOf(test));
                System.out.println("total = "+total);
            }
           if (i == imei.length()-1) {
               int nearestClose = 10 - (total % 10);
               im = imei.concat(String.valueOf(nearestClose));
           }
            System.out.println(test);
        }
        return im;
    }
}
