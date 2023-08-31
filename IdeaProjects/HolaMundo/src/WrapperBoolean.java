public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1,num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false

        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("comparando dos objetos Boolean: " + (objetoBoolean == objBoolean2));
        System.out.println("comparando dos objetos Boolean: " + (objetoBoolean.equals(objBoolean2)));
        System.out.println("comparando dos objetos Boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos Boolean: " + (objetoBoolean == objBoolean3));

        boolean primBoolean2 = objBoolean2.booleanValue();


    }
}
