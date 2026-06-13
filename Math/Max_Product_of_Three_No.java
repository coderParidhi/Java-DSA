import java.util.*;
class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(p1, p2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.maximumProduct(nums);
        System.out.println("Maximum product of three numbers: " + result);
    }   
}