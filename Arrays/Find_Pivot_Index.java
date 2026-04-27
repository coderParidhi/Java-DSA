import java.util.*;
class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int s = 0;
        for(int i = 0; i < nums.length; i++)
        {
            s += nums[i];   // total sum
        }

        int left = 0;

        for(int i = 0; i < nums.length; i++)
        {
            s = s - nums[i];   // now 's' becomes right sum

            if(left == s)
                return i;

            left += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println(sol.pivotIndex(nums));
    }
}