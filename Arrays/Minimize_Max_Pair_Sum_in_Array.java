import java.util.*;
class Solution 
{
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int l=0,h=nums.length-1,m=0;
        while(l<=h)
        {
            int M=nums[l]+nums[h];
            if(M>m)
            m=M;
            l++;
            h--;
        }
        return m;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.minPairSum(nums));
    }   
}