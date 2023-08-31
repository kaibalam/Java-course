class Persona{
    private String nombre;

    public void modificaNombre(String nuevoNombre){
        this.nombre = nuevoNombre;

    }

    public String leerNombre(){
        return this.nombre;
    }

}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificaNombre("Andrés");
        System.out.println("iniciamos el main");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de invocar el método test");
        test(persona);
        System.out.println("Despues de llamar al método test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona modificados");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el método test");
        persona.modificaNombre("pepe");
        System.out.println("finaliza el método test");

    }
}
