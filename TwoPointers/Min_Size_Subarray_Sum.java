import java.util.*;
class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int min=Integer.MAX_VALUE;
        int sum=0,l=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                min=Math.min(min,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;

    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target sum:");    
        int target=sc.nextInt();
        System.out.println("Enter the size of the array:");    
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.println("The minimum size of the subarray is "+s.minSubArrayLen(target, nums));
        sc.close();
    }

}