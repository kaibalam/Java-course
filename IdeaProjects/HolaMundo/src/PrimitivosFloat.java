public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 3.4028235E38F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo realFloat corresponde en byte a  " + Float.BYTES);
        System.out.println("tipo realFloat correstonde en bits a " + Float.SIZE);
        System.out.println("valor maximo de un realFloat " + Float.MAX_VALUE);
        System.out.println("valor minimo de un realFloat " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo realDouble corresponde en byte a  " + Double.BYTES);
        System.out.println("tipo realDouble correstonde en bits a " + Double.SIZE);
        System.out.println("valor maximo de un realDouble " + Double.MAX_VALUE);
        System.out.println("valor minimo de un realDouble " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
