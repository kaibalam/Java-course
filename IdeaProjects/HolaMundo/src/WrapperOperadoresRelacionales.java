 public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        //en java si el valor es menor de 128 java siempre va a comparar por el valor y no por la intancia.
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("son el mismo objeto? " + (num1 == num2));

        System.out.println("tienen el mismo valor? " + (num1.equals(num2)));

        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        num2 = 2000;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);
    }
}
