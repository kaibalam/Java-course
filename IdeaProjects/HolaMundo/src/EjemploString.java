public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String cursoNew = new String ("programación java");
        System.out.println("curso = " + curso);
        System.out.println("cursoNew = " + cursoNew);
        System.out.println("Curso es igual "+ curso.equals(cursoNew));
        boolean esIgual = curso == cursoNew;
        System.out.println("esIgual = " + esIgual);
        esIgual = curso.equalsIgnoreCase(cursoNew);

        System.out.println("esIgual ignoreCase= " + esIgual);

        String curso3 = "Programación Java";

        esIgual = curso == curso3;
        System.out.println("curso3 = curso " + esIgual);
    }
}
