import java.util.*;
class Solution 
{
    public int countKDifference(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        map.put(nums[i],map.getOrDefault(nums[i] ,0)+1);   

        int c=0;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if ( map.containsKey(e.getKey()+k))
            c+=e.getValue() * (map.get(e.getKey()+k));
        } 
        return c;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int result = s.countKDifference(nums, k);
        System.out.println("The no.pairs are: " + result); 
    }   
}