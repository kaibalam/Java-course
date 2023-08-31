public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Ricardo";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUppercase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals() = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"ricardo\") = " + nombre.equals("ricardo"));
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("ricardo"));
        System.out.println("nombre.compareTo(\"ricardo\") = " + nombre.compareTo("ricardo"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(0,4) = " + nombre.substring(0,4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas %% s";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());
        System.out.println("trabalenguas = " + trabalenguas.replace("%%",nombre));

    }
}
