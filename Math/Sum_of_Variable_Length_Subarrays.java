import java.util.*;
class Solution 
{
    public int subarraySum(int[] nums) 
    {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            int start = Math.max(0, i - nums[i]);

            for (int j = start; j <= i; j++) 
            {
                ans += nums[j];
            }
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        int result = s.subarraySum(nums);
        System.out.println(result); 
    }   
}