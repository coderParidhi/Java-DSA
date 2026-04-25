import java.util.*;
class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            inc=false;
            if(nums[i]<nums[i+1])
            dec=false;
        }
        return inc || dec;
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
        boolean result = s.isMonotonic(arr);
        if(result)
            System.out.println("The array is monotonic.");
        else
            System.out.println("The array is not monotonic.");
    }
}