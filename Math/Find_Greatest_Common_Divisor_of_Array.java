import java.util.*;
class Solution 
{
    public int findGCD(int[] nums) 
    {
        int max=0,min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min=nums[i];
        } 
        int m=1; 
        for(int i=1;i<=min;i++)
        {
            if(max%i==0 && min%i==0)
            m=i;
        }
        return m;  
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
        System.out.println(obj.findGCD(nums));
    }
}