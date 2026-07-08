import java.util.*;
class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int s=0;
            while(n>0)
            {
                s+=n%10;
                n=n/10;
            }
            if(s==i)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();    
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            nums[i] = sc.nextInt();
        }
        int result = sol.smallestIndex(nums);
        System.out.println(result); 
    }   
}