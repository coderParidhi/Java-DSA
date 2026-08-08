import java.util.*;
class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int a[]=new int[nums.length];
        int c1=0,c2=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                a[c1]=nums[i];
                c1+=2;
            }
            else
            {
                a[c2]=nums[i];
                c2+=2;
            }
        }  
        return a;
    }
    public static void main(String args[])
    {
        Solution s=new Solution();
        System.out.println("Enter the size of the rearrangeArray");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int a[]=s.rearrangeArray(nums);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }   
}