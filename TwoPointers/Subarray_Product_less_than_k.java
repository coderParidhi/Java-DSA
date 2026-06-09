import java.util.*;
class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int c=0,p=1,l=0;
        if(k<=1)
        return 0;
        for(int i=0;i<nums.length;i++)
        {
            p*=nums[i];
            while(p>=k)
            {
                p=p/nums[l];
                l++;
            }
            c+=i-l+1;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k:");    
        int k=sc.nextInt();
        System.out.println("Enter the size of the array:");    
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.println("The number of subarrays with product less than k is "+s.numSubarrayProductLessThanK(nums, k));
        sc.close();
    }   
}