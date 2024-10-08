import java.util.Arrays;

public class SortestSubArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, };
        int k = 0;
        int count = 0;
        int sum = 0;
        Arrays.sort(nums);
        if (nums[nums.length - 1] > k) {
            count++;

        }
        for (int i = 0; i < nums.length; i++) {
            if (sum < k) {
                sum += nums[i];
                count++;
            }
        }
        if (sum <= k) {
            System.out.println("fali");
        }
        System.err.println(count);
    }
}
