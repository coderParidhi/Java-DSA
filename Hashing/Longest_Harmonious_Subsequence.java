import java.util.*;
class Solution 
{
    public int findLHS(int[] nums) 
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxLength=0;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            int k=e.getKey();
            int v=e.getValue();
            if(map.containsKey(k+1))
            {
                int length = v + map.get(k + 1);
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result=s.findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: "+result);
        sc.close();
    }
}