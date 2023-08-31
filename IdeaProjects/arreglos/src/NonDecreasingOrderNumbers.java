import java.util.Arrays;

public class NonDecreasingOrderNumbers {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] order = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            int sqr = nums[i];
            sqr *= sqr;

            System.out.println("sqr = " + sqr);
            order[i] = sqr;
        }
        Arrays.sort(order);
        for (int i: order){
            System.out.println("i = " + i);
        }

    }
}
