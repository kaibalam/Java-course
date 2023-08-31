public class ConsecutivesOnes {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1};

        int a = 0,b= 0,temp =0;
        for (int i = 0; i < array.length; i++){
            a = array[i]==1? ++a:a;
            System.out.println("a = " + a);
            if (array[i]==0){
                b = a;
                System.out.println("b = " + b);
                temp = Math.max(a,b);
                a = 0;
            }
        }
        temp = Math.max(a,b);

        System.out.println("temp = " + temp);

    }

}
