import java.util.*;
class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }    
        int c=0;
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(e.getValue()%2==0)
            c+=e.getValue()/2;
        }
        return c==nums.length/2 ? true : false;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(s.divideArray(nums));
        sc.close();
    }   
}