import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesSistema {
    public static void main(String[] args) {
        try  {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);

            String puerto = ps.getProperty("config.puerto.servidor");
            String autor = ps.getProperty("config.autor.email");
            System.out.println("puerto = " + puerto);
            System.out.println("autor = " + autor);
        } catch (Exception e){
            System.out.println("No existe el archivo = " + e);
        }
    }
}
