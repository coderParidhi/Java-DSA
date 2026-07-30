import java.util.*;
class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
        int s=0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           s+=nums[i];
        } 
        int r=s,l=0;
        for(int i=0;i<nums.length;i++)
        {
            r=r-nums[i];
            arr[i]=Math.abs(l-r);
            l+=nums[i];
        }   
        return arr;
    }
    public static void main(String args[])
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)    
        {
            nums[i] = sc.nextInt();
        }
        int ans[] = s.leftRightDifference(nums);
        System.out.println(Arrays.toString(ans));
    }   
}