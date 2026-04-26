import java.util.*;
class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int m=-1;;
        for(int i=arr.length-1;i>=0;i--)
        {
            int t=arr[i];
            arr[i]=m;
            m=Math.max(t,m);
        }
        return arr;
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
        int[] result=s.replaceElements(arr);
        System.out.println("The modified array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}