public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i;// i = i + 1

        System.out.println("j = " + j);
        System.out.println("i = " + i);

        i = 2;
        System.out.println("valor inicial de i = " + i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //pre decremento

        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j decremento = " + j);

        //post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }
}
