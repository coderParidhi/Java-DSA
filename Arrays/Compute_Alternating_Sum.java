import java.util.*;
class Solution 
{
    public int alternatingSum(int[] nums) 
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            s+=nums[i];
            else
            s-=nums[i];
        }
        return s;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.alternatingSum(arr));    
    }   
}