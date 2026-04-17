import java.util.*;
class Solution 
{
    public int sumOfUnique(int[] nums) 
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i]) +1);
            }
            else
            map.put(nums[i],1);
        }
        int s=0;
        for( Map.Entry<Integer,Integer> e : map.entrySet() )
        {
            if(e.getValue()==1)
            s+=e.getKey();
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        int[] nums;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        nums=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(s.sumOfUnique(nums));
    }
}