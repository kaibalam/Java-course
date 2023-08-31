public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a  " + Byte.BYTES);
        System.out.println("tipo byte correstonde en bits a " + Byte.SIZE);
        System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a  " + Short.BYTES);
        System.out.println("tipo short correstonde en bits a " + Short.SIZE);
        System.out.println("valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a  " + Integer.BYTES);
        System.out.println("tipo int correstonde en bits a " + Integer.SIZE);
        System.out.println("valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a  " + Long.BYTES);
        System.out.println("tipo long correstonde en bits a " + Long.SIZE);
        System.out.println("valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long " + Long.MIN_VALUE);

        float numeroFloat = 3.4028235E38F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en byte a  " + Float.BYTES);
        System.out.println("tipo float correstonde en bits a " + Float.SIZE);
        System.out.println("valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float " + Float.MIN_VALUE);


    }
}
