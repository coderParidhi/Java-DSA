import java.util.*;
class Solution 
{
    public int[] numberGame(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
            i++;
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] result = s.numberGame(nums);  
        System.out.println(Arrays.toString(result));
    }
}