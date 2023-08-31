public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5; // el signo = es el operador de asignación
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i = i + 2;
        i += 2;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        j -= 4;
        System.out.println("j = " + j);
        j *=3 ;

        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c ";

        sqlString += " where c.nombre = 'Andres'";
        sqlString += " and c.activo = 1;";
        System.out.println("sqlString = " + sqlString);
    }
}
