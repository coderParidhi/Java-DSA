import java.util.*;
class Solution 
{
    public int minOperations(int[] nums) 
    {
        int n=nums.length,o=0;
        for(int i=0;i<=n-3;i++)
        {
            if(nums[i]==0)
            {
                for(int j=i;j<i+3;j++)
                {
                    if(nums[j]==0)
                    nums[j]=1;
                    else
                    nums[j]=0;
                }
                o++;
            }
        }  
        for(int i=0;i<n;i++) 
        {
            if(nums[i]==0)
            return -1;
        } 
        return o ;
    }
    public static void main(String args[])
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(s.minOperations(nums));
    }
}