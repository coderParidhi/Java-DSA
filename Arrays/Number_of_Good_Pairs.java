import java.util.*;

class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        int c = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                    c++;
            }
        } 
        return c;   
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result= obj.numIdenticalPairs(arr);

        System.out.println("Number of good pairs: " + result);
    }
}