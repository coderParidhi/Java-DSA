import java.util.*;
class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int left = 0;
        int zeros = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) 
        {

            if (nums[right] == 0) 
            {
                zeros++;
            }

            while (zeros > k) 
            {
                if (nums[left] == 0) 
                {
                    zeros--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the size of the array:");     
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        int result = solution.longestOnes(nums, k);
        System.out.println("The longest subarray of 1's after flipping at most " + k + " zeros is: " + result);
    }
}