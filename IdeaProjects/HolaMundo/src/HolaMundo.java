public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola Mundo! Hola Ricardo";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 11;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("valor = " + valor);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        System.out.println("numero3 = " + numero3);

        String nombre;
        nombre = "Andres";

        if(numero>10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        boolean a = false; //tamaño 1 bit
        boolean b = true;

        char x = 'a'; // 16 bits
        char y = '1';
        char c = '\u0021';
        //entre -128 a 127
        byte enteroByte = 127; //8 bits
        //entre -32768 a 32767
        short enteroShort = 32767; //16 bits
        //entre -2147483648 a 2147483647
        int enteroInt = 2147483647; //32 bits
        //entre -92233720366854775808 a 92233720366854775807
        long enteroLong = 9223372036854775807L; // 64 bits

        //enre -1.4E-45 a 3.4028235E38
        float realFloat = 3.1416f; // 32 bits

        //entre -4.9E-324 a 1.7976931348623157E308
        double realDouble = 1.7976931348623157E308; //64 bits



    }
}
