import java.util.*;
class Solution 
{
    public int[] sortArrayByParityII(int[] nums) 
    {
        int[] a=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[j]=nums[i];
                j=j+2;
            }           
            else
            {
                a[k]=nums[i];
                k=k+2;
            }
        }  
        return a; 
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] result=s.sortArrayByParityII(arr);
        System.out.println("The sorted array is:");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}