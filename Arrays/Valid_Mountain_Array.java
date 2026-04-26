import java.util.*;
class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        if(arr.length<3)
        return false;
        boolean inc=false;
        boolean dec=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1]) //Increasing 
            {
                if(dec)
                return false;
                inc=true;
            }           
            if(arr[i]>arr[i+1]) //Decreasing
            {
                if(!inc)
                return false;
                dec=true;
            }
            if(arr[i]==arr[i+1])
            return false;
        }
        return inc && dec;
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
        boolean result=s.validMountainArray(arr);
        if(result)
        System.out.println("The given array is a valid mountain array.");
        else
        System.out.println("The given array is not a valid mountain array.");
    }
}