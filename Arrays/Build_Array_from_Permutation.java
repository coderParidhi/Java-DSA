import java.util.*;
class Solution 
{
    public int[] buildArray(int[] nums) 
    {
    int[] arr=new int[nums.length];
    for(int i=0;i<nums.length;i++)
    {
        arr[i]=nums[nums[i]];
    }   
    return arr; 
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        b=obj.buildArray(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i] +"    ");
        } 
    }
}