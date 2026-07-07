import java.util.*;
class Solution 
{
    public int countPartitions(int[] nums) 
    {
        int s=0,s1=nums[0],c=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            s+=nums[i];
        }
        for(int i=0;i<n-1;i++)
        {
            if( (s-s1)%2 ==0 )
            c++;    
            s=s-nums[i+1];
            s1=s1+nums[i+1];

        }   
        return c; 
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }       
        System.out.println(obj.countPartitions(nums));
        sc.close();
    }
}