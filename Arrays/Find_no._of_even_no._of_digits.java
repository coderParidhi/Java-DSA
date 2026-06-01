import java.util.*;
class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int c1=0;
            while(nums[i]>0)
            {
                nums[i]=nums[i]/10;
                c1++;
            }
            if(c1%2==0)
            c++;
        }   
        return c; 
    }
    public static void main(String[] args) 
    {
        Solution sol=new Solution();
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int ans=sol.findNumbers(nums);
        System.out.println("The number of even digit numbers in the array is "+ans);
        sc.close();
    }
}