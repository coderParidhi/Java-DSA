import java.util.*;
class Solution 
{
    public void duplicateZeros(int[] arr) 
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                for(int j = arr.length - 2; j >= i; j--)
                {
                    arr[j + 1] = arr[j];
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        s.duplicateZeros(arr);
        System.out.println("Array after duplicating zeros:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}