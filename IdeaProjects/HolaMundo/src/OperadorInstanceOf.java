public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creamos un objetdo de la clase String ... que tal ";
        Integer num = 7;

        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String? = " + b1);


        boolean b2 = texto instanceof Object;

        System.out.println("texto es del tipo Objeto? = " + b2);


        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer? = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number? = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object? = " + b1);

        Double decimal = 45.55;

        b1 = decimal instanceof Number;
        System.out.println("decimas es del tipo Number? = " + b1);

        b1 = decimal instanceof Object;
        System.out.println("decimas es del tipo Object? = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("decimas es del tipo Double? = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean? = " + b1);
    }
}
