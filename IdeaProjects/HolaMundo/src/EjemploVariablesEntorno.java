import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();

        System.out.println("varEnv = " + varEnv);
        String home = varEnv.get("JAVA_HOME");
        System.out.println("home = " + home);
        String path = varEnv.get("Path");
        System.out.println("path = " + path);
        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);
        String path2 = System.getenv("path");
        System.out.println("path2 = " + path2);

        for (String key: varEnv.keySet()
             ) {
            System.out.println(key + " => " + varEnv.get(key));

        }

    }
}
