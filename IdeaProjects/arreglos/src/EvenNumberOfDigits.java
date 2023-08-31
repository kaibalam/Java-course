public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            System.out.println("s = " + nums[x]);
            System.out.println("Integer.toString(s) = " + Integer.toString(nums[x]));
            String d = Integer.toString(nums[x]);
            if (d.length()%2 == 0){
                count++;
            }
        }
        System.out.println("count = " + count);


    }
}
