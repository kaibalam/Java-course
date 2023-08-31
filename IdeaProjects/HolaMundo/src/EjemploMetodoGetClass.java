import java.lang.reflect.Method;
import java.text.Annotation;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "hola que tal!";
        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackage());
        System.out.println("strClass.getName() = " + strClass.getPackageName());

        for (Method r: strClass.getMethods()){
            System.out.println("r = " + r.getName());
        }

        Integer num = 34;
        Class integerClass = num.getClass();
        Class objClass = integerClass.getSuperclass().getSuperclass();
        System.out.println("integerClass = " + integerClass.getAnnotatedInterfaces());
        System.out.println("integerClass = " + integerClass.getSuperclass());
        System.out.println("object Class = " + objClass);
        for(Method obj: integerClass.getMethods()){
            System.out.println("obj.getName() = " + obj.getName());
        }

    }
}
