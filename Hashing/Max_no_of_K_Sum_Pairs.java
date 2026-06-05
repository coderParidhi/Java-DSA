import java.util.*;
class Solution 
{
    public int maxOperations(int[] nums, int k) 
    {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=k-nums[i];
            if(map.getOrDefault(n,0)>0)
            {
                c++;
                map.put(n,map.get(n)-1);
            }
            else
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        }
        return c;    
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        System.out.println("The maximum number of operations that can be performed is: "+s.maxOperations(nums, k));
        sc.close();
    }
}