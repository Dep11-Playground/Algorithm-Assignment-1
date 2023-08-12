import java.util.Arrays;

class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] reverse = new int[nums.length];
        
        for (int i = nums.length-1; i >= 0; i--) {
            reverse[reverse.length -1 - i] = nums[i];
        }

        nums = reverse;
        System.out.println(Arrays.toString(nums));
    }
}
