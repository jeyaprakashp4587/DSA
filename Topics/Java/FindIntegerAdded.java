public class FindIntegerAdded {
    public static int findAddedInteger(int[] nums1, int[] nums2) {
        // Assuming both arrays are of the same size
        if (nums1.length == 0)
            return 0;

        // Difference between any corresponding elements will give the integer added
        return nums2[0] - nums1[0]; // You can use any index, as the difference should be constant
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 2 };
        int[] nums2 = { 10, 4 };
        System.out.println("The integer added is: " + findAddedInteger(nums1, nums2));
    }
}
