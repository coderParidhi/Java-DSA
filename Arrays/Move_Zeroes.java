import java.util.*;
class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length)
        {
            nums[j++]=0;
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the size of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
       obj.moveZeroes(arr); 
        System.out.println("Array after moving zeroes:");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
    
}
