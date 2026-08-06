import java.util.*;
class Solution 
{
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int c1=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(Math.abs(arr[i] -arr[j]) > a)
                continue;
                for(int k=j+1;k<arr.length;k++)
                {
                    if(Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                    c1++;
                }
            }
        } 
        return c1;   
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the values of a, b, and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = s.countGoodTriplets(arr, a, b, c);  
        System.out.println("Number of good triplets: " + result);
    }
}