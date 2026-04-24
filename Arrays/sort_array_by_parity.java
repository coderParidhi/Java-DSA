import java.util.*;
class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int[] arr=new int[nums.length];
        int a=0;
        int b=nums.length-1;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]%2==0)
            arr[a++]=nums[i];
            else
            arr[b--]=nums[i];
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the number of elements in the array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int[] result=s.sortArrayByParity(nums);
        System.out.println("Sorted array by parity: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}