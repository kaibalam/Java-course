public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("iniciamos el main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con i en valor = " + i);
    }

    public static void test(int i){
        System.out.println("iniciamos el método test = " + i);
        i = 35;
        System.out.println("finaliza el método test con i = " + i);

    }
}