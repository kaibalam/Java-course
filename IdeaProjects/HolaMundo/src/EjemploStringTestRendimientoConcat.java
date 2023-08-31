public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "c";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i <10000; i++){
            //c=c.concat(a).concat(b).concat("\n"); //500 = 3ms; 1000 = 10ms ; 10K = 280ms
            c += a + b +"\b"; //500 = 32ms; 1000 = 42ms ; 10K = 161ms
            //sb.append(a).append(b).append("\n"); // 500 = 0ms; 1000 = 0ms; 10K = 3ms
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
