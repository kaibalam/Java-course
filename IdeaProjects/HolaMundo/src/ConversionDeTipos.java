public class ConversionDeTipos {
    public static void main(String[] args) {
        String  numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroStr = " + numeroStr);

        String realStr = "98765.43e-3";

        double realDoble = Double.parseDouble(realStr);
        System.out.println("realDoble = " + realDoble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        String otroNumeroStr = String.valueOf(otroNumeroInt);
        String otroNumeroStr2 = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr2);

        int i = 1000;
        short s = (short)i;
        System.out.println("i = " + i);
        long l = i;
        System.out.println("l = " + l);
        float b = i;

    }
}
