import java.util.*;
class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          if(map.containsKey(nums[i]))
          {
            int pi=map.get(nums[i]);
            if(i-pi<=k)
            return true;
          }
          map.put(nums[i],i);
        }    
        return false;

    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println("Enter the index to be searched in the array");
        int k=sc.nextInt();
        System.out.println(obj.containsNearbyDuplicate(arr,k));
    }
}