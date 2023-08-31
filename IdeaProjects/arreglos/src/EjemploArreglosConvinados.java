public class EjemploArreglosConvinados {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new  int[10];
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }
        for (int i = 0; i < b.length; i++){
            b[i] = (i + 1) *5;
        }
        int d = 0;
        /*for (int i = 0; i < 10; i++){
            c[d++] = a[i];
            c[d++] = b[i];
        }*/
        for (int i = 0; i < 10; i+=2){
            for (int j = 0; j <2; j++){
                c[d++] = a[i+j];
            }
            for (int j = 0; j <2; j++){
                c[d++] = b[i+j];
            }
        }

        for (int i = 0; i < c.length; i++){
            System.out.println("i = " + i + " valor: " + c[i]);
        }
    }
}
