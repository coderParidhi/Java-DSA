import java.util.*;
class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int arr[]=new int[gain.length+1];
        int m=0;
        for(int i=0;i<gain.length;i++)
        {
            arr[i+1]=arr[i]+gain[i];
            if(arr[i+1]>m)
            m=arr[i+1];
        }  
        return m;  
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");    
        int n=sc.nextInt();
        int gain[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        gain[i]=sc.nextInt();
        System.out.println("The Highest Altitude is "+s.largestAltitude(gain));
    }   
}