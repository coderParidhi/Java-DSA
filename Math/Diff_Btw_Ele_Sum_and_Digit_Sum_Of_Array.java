import java.util.*;
class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int s=0,s1=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            if(nums[i]<10)
            s1+=nums[i];
            else
            {
                while(nums[i]>0)
                {
                    s1+=nums[i]%10;
                    nums[i]/=10;
                }
            }
        }  
        return Math.abs(s-s1);  
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
        System.out.println(obj.differenceOfSum(nums));
        sc.close();
    }
}