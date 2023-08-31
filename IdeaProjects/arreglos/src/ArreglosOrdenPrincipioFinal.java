public class ArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }


        System.out.println("==========una forma==========");
        int aux = 0;
        for (int i = 0; i < numeros.length/2; i++){
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length-1-i];
            System.out.print("numeros = " + numeros[i]);
            System.out.println(" " + numeros[numeros.length-1-i]);

        }

        System.out.println("==========otra forma==========");
        for (int i = 0; i < numeros.length -i; i++){
            System.out.println("numeros = " + numeros[i]);
            System.out.println("numeros = " + numeros[numeros.length-1-i]);
        }

        System.out.println("==========nuevo Array \"a\"==========");
        for (int i = 0; i < a.length; i++){
            System.out.println("indice = "+ i +" valor arreglo a: " + a[i]);
        }
    }
}
