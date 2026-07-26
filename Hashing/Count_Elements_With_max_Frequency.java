import java.util.*;
class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int m=0,c=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>m)
            m=map.get(nums[i]);
        } 
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(e.getValue()==m)
            c+=m;
        } 
        return c;  
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
        int result = s.maxFrequencyElements(nums);
        System.out.println(result);
    }   
}