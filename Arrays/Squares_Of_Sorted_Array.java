import java.util.*;
class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];

        }    
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");    
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.println("The Squares of the Sorted Array is "+Arrays.toString(s.sortedSquares(nums)));
    }
}