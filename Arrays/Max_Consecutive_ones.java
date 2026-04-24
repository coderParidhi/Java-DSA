import java.util.*;
class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int c,m;
        c=0;
        m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c=0;
            else 
            c++;
            if(m<c)
            m=c;
        }
        return m;
    }
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the number of elements in the array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int result=s.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
        sc.close();
    }
}