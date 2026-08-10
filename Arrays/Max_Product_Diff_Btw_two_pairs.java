import java.util.*;

class Solution {

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = solution.maxProductDifference(nums);

        System.out.println("Max Product Difference: " + result);

        scanner.close();
    }
}