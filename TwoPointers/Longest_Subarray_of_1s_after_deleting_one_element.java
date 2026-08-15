import java.util.*;
class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        int r=0,l=0,m=0,l1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            r++;
            if(nums[i]==0 && i!=nums.length-1)
            {
                l=i+1;
                l1=0;
                while(l<nums.length && nums[l]!=0)
                {
                    l++;
                    l1++;
                }
                m=Math.max(m,r+l1);
                r=l1;
                i=l-1;
            }
            else
            m=Math.max(m,r);
        } 
        return m==nums.length ? m-1 : m;   
    }
    public static void main(String args[]) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the size of the array:");     
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = solution.longestSubarray(nums);
        System.out.println("The longest subarray of 1's after deleting one element is: " + result);
    }   
}