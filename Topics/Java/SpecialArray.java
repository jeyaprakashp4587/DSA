public class SpecialArray {
   public static int Element (int[] nums) {
        int n = nums.length;

        // Check for all possible k values from 0 to n
        for (int k = 0; k <= n; k++) {
            int count = 0;

            // Count how many numbers are >= k
            for (int num : nums) {
                if (num >= k) {
                    count++;
                }
            }

            // If count equals k, return k
            if (count == k) {
                System.out.println("k"+k);
                return k;
            }
              System.out.println("k"+k);
        }

        // If no special k found, return -1
        return -1;
       
    }
    public static void main(String[] args) {
        int [] arr = {0,0,4,6,5,3,2};
        // 
        System.out.println(SpecialArray.Element(arr));
    }
}
