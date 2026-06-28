import java.util.*;
class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0)
            continue;
            else
            c++;
        }  
        return c;  
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {       
            nums[i] = sc.nextInt();
        }
        int result = s.minimumOperations(nums); 
        System.out.println(result);
    }
}