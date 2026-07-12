import java.util.*;
class Solution 
{
    public int minMoves(int[] nums) 
    {
        Arrays.sort(nums);
        int l=nums.length;
        int c=0,a=nums[l-1];    
        for(int i=0;i<l;i++)
        {
            c+=a-nums[i];
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        int result = obj.minMoves(nums);
        System.out.println("Minimum moves to equal array elements: " + result);
        sc.close();
    }   
}