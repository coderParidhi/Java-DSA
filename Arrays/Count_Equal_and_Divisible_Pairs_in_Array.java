import java.util.*;
class Solution 
{
    public int countPairs(int[] nums, int k) 
    {
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && (i*j)%k==0 )
                c++;
            }           
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the number of elements in the array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }       
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        int result = solution.countPairs(nums, k);
        System.out.println(result); // Output: count of equal and divisible pairs
    }   
}