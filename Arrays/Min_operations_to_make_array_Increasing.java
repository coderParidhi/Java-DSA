import java.util.*;
class Solution 
{
    public int minOperations(int[] nums) 
    {
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]<=nums[i])
            {
                c=c+((nums[i]-nums[i+1])+1);
                nums[i+1]=((nums[i]-nums[i+1])+1)+nums[i+1];
            }
        }  
        return c;  
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.minOperations(nums));
    }   
}