import org.rvalenzuela.models.Cliente;
import org.rvalenzuela.models.Empleado;
import org.rvalenzuela.models.Gerente;
import org.rvalenzuela.models.Persona;

public class TareaEjemploCrearGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setPresupuesto(3000);

        Empleado emp1 = new Empleado();
        emp1.setNombre("Ricardo");
        emp1.setApellido("Valenzuela");
        emp1.setDireccion("Ciudad");
        emp1.setNumeroFiscal("2343555-3");
        emp1.setRemuneracion(9000);
        System.out.println(emp1.toString());

        emp1.aumentarRemuneracion(12);

        System.out.println(emp1.toString());



        Cliente cln1 = new Cliente();
        cln1.setNombre("Cesia");
        cln1.setApellido("Ramírez");

        System.out.println(emp1.toString());
        System.out.println("========================================");
        System.out.println(gerente.toString());
        System.out.println("========================================");
        System.out.println(cln1.toString());


    }
}
