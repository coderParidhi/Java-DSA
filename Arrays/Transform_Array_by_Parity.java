import java.util.*;
class Solution 
{
    public int[] transformArray(int[] nums) 
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            c++;
        } 
        for(int i=0;i<nums.length;i++)
        {
            if(i<c)
            nums[i]=0;
            else
            nums[i]=1;
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
        int[] result = s.transformArray(nums);
        System.out.println(Arrays.toString(result));
    }   
}