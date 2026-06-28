import java.util.*;
class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        return s>=k ? s%k : s;
        
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];                            
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();   
        System.out.println(sol.minOperations(nums, k)); 
    }   
}