import java.util.*;
class Solution 
{
    public int[] concatWithReverse(int[] nums) 
    {
        int j=2*nums.length-1;
        int a[]=new int[2*nums.length];        
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
            a[j--]=nums[i];
        }
        return a;
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
        int[] result = s.concatWithReverse(nums); 
        System.out.println(Arrays.toString(result));
    }
}
